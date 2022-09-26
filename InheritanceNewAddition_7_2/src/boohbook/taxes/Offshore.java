package boohbook.taxes;

import boohbook.salarity.Salary;

public class Offshore extends TaxChildren{

    public void getOffshoreSalary(Salary salary, int taxBid, int taxHour, int taxPiecework, int taxCh){
        if (salary.getEmployee().isOffshore()){
            super.getTaxChildren(salary,0,0,0,0);
        }else {
            super.getTaxChildren(salary,taxBid,taxHour,taxPiecework,taxCh);
        }
    }

}
