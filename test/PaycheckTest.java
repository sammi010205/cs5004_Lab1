import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

/**
 * This is the test class for the class Paycheck
 * This class contains junit tests for the methods of the Paycheck class.
 */
public class PaycheckTest {
  private Paycheck test2;
  private Paycheck test3;
  private Paycheck test4;
  private Paycheck test5;

  /**
   * set up the test environment which can be commonly used in the test methods.
   * It will be executed before the other test methods.
   */
  @Before
  public void setUp() {
    test2 = new Paycheck(100.00, 45.00);
    test3 = new Paycheck(100.00, 3.00);
    test4 = new Paycheck(0.00, 0.00);

  }

  /**
   * test the method getTotalPay
   * ensures the method returns the right amount of total pay.
   */
  @Test
  public void testGetTotalPay() {
    assertEquals(4750.00, test2.getTotalPay(), 0.001);
    assertEquals(300.00, test3.getTotalPay(), 0.001);
    assertEquals(0.00, test4.getTotalPay(), 0.001);
  }

  /**
   * test the method getPayAfterTaxes.
   * ensures the method returns the right amount of total pay after taxes.
   */
  @Test
  public void testGetPayAfterTaxes() {
    assertEquals(4037.50, test2.getPayAfterTaxes(), 0.001);
    assertEquals(270.00, test3.getPayAfterTaxes(), 0.001);
    assertEquals(0.00, test4.getPayAfterTaxes(), 0.001);
  }

  /**
   * test the method getRate
   * ensures the method returns the right paycheck rate.
   */
  @Test
  public void testGetRate() {
    assertEquals(100.00, test2.getRate(), 0.001);
    assertEquals(100.00, test3.getRate(), 0.001);
    assertEquals(0.00, test4.getRate(), 0.001);
  }

  /**
   * test the method getHours
   * ensures the method returns the right paycheck hours.
   */
  @Test
  public void testGetHours() {
    assertEquals(45.00, test2.getHours(), 0.001);
    assertEquals(3.00, test3.getHours(), 0.001);
    assertEquals(0.00, test4.getHours(), 0.001);
  }

  /**
   * test the method toString of Paycheck class
   * ensures the method returns the right string representation of Paycheck class.
   */
  @Test
  public void testPaycheckToString() {
    String expectedString_2 = "Payment after taxes: $ 4037.50";
    String expectedString_3 = "Payment after taxes: $ 270.00";
    String expectedString_4 = "Payment after taxes: $ .00";
    assertEquals(expectedString_2, test2.toString());
    assertEquals(expectedString_3, test3.toString());
    assertEquals(expectedString_4, test4.toString());
  }

}
