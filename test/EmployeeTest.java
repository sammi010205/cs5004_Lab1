import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;

/**
 * This is the test class for the class Employee.
 * This class contains junit tests for the methods of the Employee class.
 */
public class EmployeeTest {
  private Employee test1;

  /**
   * set up the test environment before each test.
   * This method is executed before each test method to initialize common resources.
   */

  @Before
  public void setUp() {
    // Initialize an Employee object before each test
    test1 = new Employee("Anshul", "007", 100.00);
  }

  /**
   * test the method addHoursWorked.
   * ensures the method returns the correct hours worked results.
   */
  @Test
  public void testAddHoursWorked() {
    test1.addHoursWorked(100.00);
    assertEquals(100.00, test1.getHoursWorked(),0.001);
    test1.addHoursWorked(-103.00);
    assertEquals(0.00, test1.getHoursWorked(),0.001);

  }

  /**
   * test the resetHoursWorked method.
   * ensures the method reset the hours to zero.
   */
  @Test
  public void testResetHoursWorked() {
    test1.addHoursWorked(20.00);
    test1.resetHoursWorked();
    assertEquals(0.00, test1.getHoursWorked(),0.001);
  }

  /**
   * test the getHoursWorked method.
   * ensures the method returns the correct hours.
   */
  @Test
  public void testGetHoursWorked() {
    test1.addHoursWorked(-8.00);
    assertEquals(0.00, test1.getHoursWorked(),0.001);
    test1.addHoursWorked(9.00);
    assertEquals(9.00, test1.getHoursWorked(),0.001);

  }

  /**
   * test the getWeeklyCheck method.
   * ensures the methods returns the right object Paycheck.
   */
  @Test
  public void testGetWeeklyCheck() {
   Paycheck expectedPaycheck = new Paycheck(100.00, 9.00);
   test1.resetHoursWorked();
   test1.addHoursWorked(9.00);
   assertEquals(expectedPaycheck.getHours(), test1.getWeeklyCheck().getHours(), 0.001);
   assertEquals(expectedPaycheck.getRate(), test1.getWeeklyCheck().getRate(), 0.001);
  }

  /**
   * test the toString method of the Employee class.
   * ensures the method returns the right string representation of the employee.
   */
  @Test
  public void testEmployeeToString() {
    test1.addHoursWorked(9.00);
    String expectedString = "Name: Anshul\nID: 007\nPayment after taxes: $ 765.00";
    assertEquals(expectedString, test1.toString());
    test1.addHoursWorked(-6.00);
    expectedString = "Name: Anshul\nID: 007\nPayment after taxes: $ 270.00";
    assertEquals(expectedString, test1.toString());

  }

}
