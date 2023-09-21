package calculator.models;

import junit.framework.TestCase;

public class DivisionTest extends TestCase {

  public void testDivide() {
    assertEquals(2.0, Division.divide(4.0, 2.0));
  }
}
