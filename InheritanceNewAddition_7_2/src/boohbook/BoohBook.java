package boohbook;

import boohbook.salarity.HourSalary;
import boohbook.salarity.Salary;
import boohbook.taxes.Offshore;
import boohbook.taxes.Tax;
import boohbook.taxes.TaxChildren;

public class BoohBook {
    public void print(Salary[] salaries) {
        getHead();
        getBody(salaries);
        getSum(salaries);
    }

    private void getHead() {
        System.out.println("ФИО     Вид оплаты    Сумма руб.");
    }

    private void getBody(Salary[] salaries) {
        for (int i = 0; i < salaries.length; i++) {
            System.out.println(salaries[i].toString());
        }
    }

    private void getSum(Salary[] salaries) {
        float sum = 0;
        for (Salary s : salaries) {
            sum += s.getSum();
        }
        System.out.println("Итого:                " + sum);
    }

    public void printSalaryWithTax(Salary[] salaries, int taxBid, int taxHour, int taxPiecework) {
        System.out.println("\nФИО      Налог,%   Сумма,руб.    К оплате,руб.");
        Tax tax = new Tax();
        for (int i = 0; i < salaries.length; i++) {
            tax.getSalaryWithTax(salaries[i], taxBid, taxHour, taxPiecework);
        }
    }

    public void printSalTaxCh(Salary[] salaries, int taxBid, int taxHour, int taxPiecework, int taxCh) {
        System.out.println("\nФИО      Налог,%   Сумма,руб.    К оплате,руб.");
        TaxChildren taxChildren = new TaxChildren();
        for (int i = 0; i < salaries.length; i++) {
            taxChildren.getTaxChildren(salaries[i], taxBid, taxHour, taxPiecework, taxCh);
        }
    }

    public void printTange(Salary[] salaries, int taxBid, int taxHour, int taxPiecework, int taxCh, int tange) {
        System.out.println("\nФИО      Налог,%   Сумма,руб.    К оплате,руб.");
        TaxChildren taxChildren = new TaxChildren();
        for (int i = 0; i < salaries.length; i++) {
            if (salaries[i] instanceof HourSalary) {
                System.out.println(salaries[i].getEmployee().getLastName() + "    " + taxHour + "        " + salaries[i].getSum() + "      " + (salaries[i].getSum() * (100 - taxHour) / 100) / 2 + "/" + (salaries[i].getSum() * (100 - taxHour) / 100) / 2 / tange);
            } else {
                taxChildren.getTaxChildren(salaries[i], taxBid, taxHour, taxPiecework, taxCh);
            }
        }
    }
    public void printSalTaxOff(Salary[] salaries, int taxBid, int taxHour, int taxPiecework, int taxCh) {
        System.out.println("\nФИО      Налог,%   Сумма,руб.    К оплате,руб.");
        Offshore offshore = new Offshore();
        for (int i = 0; i < salaries.length; i++) {
            offshore.getOffshoreSalary(salaries[i], taxBid, taxHour, taxPiecework, taxCh);
        }
    }
}
