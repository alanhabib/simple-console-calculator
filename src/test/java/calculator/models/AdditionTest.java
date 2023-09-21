package calculator.models;

import junit.framework.TestCase;

public class AdditionTest extends TestCase {

  public void testAdd() {
    assertEquals(6.0, Addition.add(4.0, 2.0));
  }
}
