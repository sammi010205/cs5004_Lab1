import java.text.DecimalFormat;

/**
 * My name: Fang Huang
 * This class represents paycheck. A paycheck knows an employee's rate and hours worked.
 */
public class Paycheck {
  private double rate;
  private double hours;

  /**
   * constructor of the class paycheck
   * @param rate the pay rate of this paycheck
   * @param hours the hours worked
   */
  public Paycheck(double rate, double hours) {
    if (rate >= 0.00 && hours >= 0.00) {
    this.rate = rate;
    this.hours = hours;
    } else if (rate < 0) {
      System.out.println("Rate cannot be negative. Please check the input rate.");
    } else {
      System.out.println("Hours cannot be negative. Please check the input hours.");
    }

  }

  /**
   * method to get the total pay before taxes
   * @return the total pay before taxes
   */
  public double getTotalPay() {
    double totalPay = 0.0;
    if (hours <= 40) {
      totalPay = rate * hours;
    } else {
      totalPay = (hours - 40) * 1.5 * rate + 40 * rate;
    }
    return totalPay;
  }

  /**
   * method to get the payment after taxes
   * @return the payment after taxes
   */
  public double getPayAfterTaxes() {

    double payAfterTax = getTotalPay();
    if (payAfterTax >= 400) {
      payAfterTax *= 0.85;
    } else {
      payAfterTax *= 0.9;
    }

    return payAfterTax;
  }

  /**
   * method to get the paycheck rate
   * @return the rate of this paycheck
   */
  public double getRate() {
    return this.rate;
  }

  /**
   * method to get the hours of this paycheck
   * @return the hours of this paycheck.
   */
  public double getHours() {
    return this.hours;
  }

  /**
   * method to represent the paycheck in string format
   * @return the string representation of the paycheck
   */

  public String toString() {
    DecimalFormat df = new DecimalFormat("#.00");
    return "Payment after taxes: $ " + df.format(this.getPayAfterTaxes());

  }


}


