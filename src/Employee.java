/**
 * My name: Fang Huang
 * This is a class Employee. An employee knows its name, id, pay rate and number of hours worked.
 */
public class Employee {
  private String name;
  private String id;
  private double payRate;
  private Double numHours = 0.0;

  /**
   * constructor of the class Employee
   * @param name the name of the employee
   * @param id the ID of the employee
   * @param payRate the pay rate of the employee
   */
  public Employee(String name, String id, double payRate) {
    this.name = name;
    this.id = id;
    this.payRate = payRate;
  }

  /**
   * method to add hours worked to existing hours
   * @param hoursWorked represents the hours need to be added
   */
  public void addHoursWorked(double hoursWorked) {
      if (hoursWorked + this.numHours <0) {
        this.numHours = 0.0;
        System.out.println("Total number of hours worked cannot drop below 0.");
      } else {
        this.numHours += hoursWorked;
      }
  }

  /**
   * method to reset the hours to zero
   */
  public void resetHoursWorked() {
    this.numHours = 0.0;

  }

  /**
   * method to get the hours worked
   * @return the total hours worked
   */
  public double getHoursWorked() {
    return this.numHours;
  }

  /**
   * method to get the weekly paycheck
   * @return object Paycheck which takes this.payRate and this.numHours as parameters
   */
  public Paycheck getWeeklyCheck() {
    return new Paycheck(this.payRate, getHoursWorked());
  }

  /**
   * method to represent an employee's name, id, and payment after taxes
   * @return a string representation of an employee
   */
  public String toString() {
    return ("Name: " + this.name +"\n" +
        "ID: " + this.id + "\n" + this.getWeeklyCheck()
    );
  }

}


