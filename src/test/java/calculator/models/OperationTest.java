package calculator.models;

import junit.framework.TestCase;

public class OperationTest extends TestCase {

  public void testGetSymbol() {
    assertEquals("+", Operation.ADDITION.getSymbol());
  }

  public void testGetOperation() {
    assertEquals(Operation.ADDITION, Operation.getOperation("+"));
  }
}
