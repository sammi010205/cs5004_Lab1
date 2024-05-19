/**
 * My name: Fang Huang
 * This is the main class.
 */

public class Main {
  public static void main(String[] args) {
    Employee TA = new Employee("Anshul","007", 100.00);
    TA.addHoursWorked(20.0);
    TA.getHoursWorked();
    TA.getWeeklyCheck();
    System.out.println(TA.toString());

  }

}
