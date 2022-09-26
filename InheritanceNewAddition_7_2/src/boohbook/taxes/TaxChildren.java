package boohbook.taxes;

import boohbook.salarity.Salary;

public class TaxChildren extends Tax {

    public void getTaxChildren(Salary salary, int taxBid, int taxHour, int taxPiecework, int taxCh) {
        if (salary.getEmployee().isChildren()) {
            super.getSalaryWithTax(salary, taxBid, taxHour, taxPiecework);
        } else {
            super.getSalaryWithTax(salary, taxBid + taxCh, taxHour + taxCh, taxPiecework + taxCh);
        }
    }
}
