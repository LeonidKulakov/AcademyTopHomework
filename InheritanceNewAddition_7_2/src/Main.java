import boohbook.BoohBook;
import boohbook.Employee;
import boohbook.salarity.BidSalary;
import boohbook.salarity.HourSalary;
import boohbook.salarity.Piecework;
import boohbook.salarity.Salary;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        main.start();
    }

    private void start() {
        BidSalary bidSalary = new BidSalary(new Employee("Иванов", true, true), 2500, 22);
        HourSalary hourSalary = new HourSalary(new Employee("Петров", false, false), 300, 176);
        Piecework piecework = new Piecework(new Employee("Сидоров", false, false), new float[]{11000, 1000, 25000});
        Salary[] salaries = {bidSalary, hourSalary, piecework};
        BoohBook boohBook = new BoohBook();
        boohBook.print(salaries);
        boohBook.printSalaryWithTax(salaries, 20, 20, 15);
        boohBook.printSalTaxCh(salaries,20,20,15,5);
        boohBook.printTange(salaries,20,20,15,5,8);
        boohBook.printSalTaxOff(salaries,20,20,15,5);
    }
}
