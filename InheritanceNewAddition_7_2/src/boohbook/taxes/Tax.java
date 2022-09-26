package boohbook.taxes;

import boohbook.Employee;
import boohbook.salarity.BidSalary;
import boohbook.salarity.HourSalary;
import boohbook.salarity.Salary;

public class Tax {

    public float getSalaryWithTax(Salary salary, int taxBid, int taxHour, int taxPiecework) {
        if (salary instanceof BidSalary) {
            System.out.println(salary.getEmployee().getLastName() + "    " + taxBid + "        " + salary.getSum() + "      " + salary.getSum() * (100 - taxBid) / 100);
            return salary.getSum() * (100 - taxBid) / 100;
        } else if (salary instanceof HourSalary) {
            System.out.println(salary.getEmployee().getLastName() + "    " + taxHour + "        " + salary.getSum() + "      " + salary.getSum() * (100 - taxHour) / 100);
            return salary.getSum() * (100 - taxHour) / 100;
        } else {
            System.out.println(salary.getEmployee().getLastName() + "   " + taxPiecework + "        " + salary.getSum() + "      " + salary.getSum() * (100 - taxPiecework) / 100);
            return salary.getSum() * (100 - taxPiecework) / 100;
        }
    }

}
