package calculator;

import calculator.models.Addition;
import calculator.models.Operation;
import calculator.utils.InputHandler;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/** Hello world! */
public class CalculatorApplication {
  private final InputHandler inputHandler;

  public CalculatorApplication() {
    this.inputHandler = new InputHandler();
  }

  public void run() {
    boolean running = true;
    while (running) {
      String expression = inputHandler.getExpression();
      if (expression.trim().equalsIgnoreCase("exit")) {
        System.out.println("Exiting...");
        running = false;
        continue;
      }
      Pattern pattern = Pattern.compile("(-?\\d+(\\.\\d+)?)([-+*/])(-?\\d+(\\.\\d+)?)");
      Matcher matcher = pattern.matcher(expression);

      if (!matcher.matches()) {
        System.out.println("Invalid expression. Try again!" + expression);
        continue;
      }
      int groupCount = matcher.groupCount();
      System.out.println("Number of groups: " + groupCount);
      for (int i = 0; i <= groupCount; i++) {
        System.out.println("Group " + i + ": " + matcher.group(i));
      }

      double firstNum, secondNum;
      try {
        firstNum = Double.parseDouble(matcher.group(1));
        secondNum = Double.parseDouble(matcher.group(4));
      } catch (NumberFormatException e) {
        System.out.println("Invalid expression. Try again!" + expression);
        continue;
      }
      Operation operation;
      try {
        operation = Operation.getOperation(matcher.group(3));
      } catch (IllegalArgumentException e) {
        System.out.println("Invalid expression. Try again!" + expression);
        continue;
      }
      switch (operation) {
        case ADDITION -> {
          double result = Addition.add(firstNum, secondNum);
          System.out.println("Result: " + result);
        }
        case SUBTRACTION -> {
          double result = firstNum - secondNum;
          System.out.println("Result: " + result);
        }
        case MULTIPLICATION -> {
          double result = firstNum * secondNum;
          System.out.println("Result: " + result);
        }
        case DIVISION -> {
          double result = firstNum / secondNum;
          System.out.println("Result: " + result);
        }
        case EXIT -> {
          System.out.println("Exiting...");
          running = false;
        }
      }
      inputHandler.waitForEnter();
    }
    inputHandler.closeScanner();
  }

  public static void main(String[] args) {
    CalculatorApplication app = new CalculatorApplication();
    app.run();
  }
}
