package calculator.models;

import junit.framework.TestCase;

public class MultiplicationTest extends TestCase {

  public void testMultiply() {
    assertEquals(8.0, Multiplication.multiply(4.0, 2.0));
  }
}
