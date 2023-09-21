package calculator.models;

import junit.framework.TestCase;

public class SubtractionTest extends TestCase {

  public void testSubtract() {
    assertEquals(2.0, Subtraction.subtract(4.0, 2.0));
  }
}
