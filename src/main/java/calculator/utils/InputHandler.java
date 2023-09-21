package calculator.utils;

import java.util.Scanner;

public class InputHandler {
  private final Scanner scanner;

  public InputHandler() {
    this.scanner = new Scanner(System.in);
  }

  public String getExpression() {
    System.out.println("Enter an expression (e.g., '1 + 1') or type 'exit' to quit:");
    return scanner.nextLine();
  }

  public void waitForEnter() {
    System.out.println("Press Enter to restart calculator...");
    scanner.nextLine();
  }

  public void closeScanner() {
    scanner.close();
  }
}
