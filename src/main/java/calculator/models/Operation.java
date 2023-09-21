package calculator.models;

public enum Operation {
  ADDITION("+"),
  SUBTRACTION("-"),
  MULTIPLICATION("*"),
  DIVISION("/"),
  EXIT("Exit");
  private final String symbol;

  Operation(String symbol) {
    this.symbol = symbol;
  }

  public String getSymbol() {
    return symbol;
  }

  public static Operation getOperation(String symbol) {
    for (Operation operation : Operation.values()) {
      if (operation.getSymbol().equals(symbol)) {
        return operation;
      }
    }
    throw new IllegalArgumentException("Invalid operation symbol: " + symbol);
  }
}
