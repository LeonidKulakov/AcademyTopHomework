public class Application {
    public static void main(String[] args) {
        Application application = new Application();
        application.start();
    }

    private void start() {
        DailySalaryEmployee dailySalaryEmployee = new DailySalaryEmployee("Иванов", 1500, 22);
        HourlySalaryEmployee hourlySalaryEmployee = new HourlySalaryEmployee("Петров", 200, 201);
        PieceworkEmployee pieceworkEmployee = new PieceworkEmployee("Сидоров", 7500, 8800, 9400);
        Employees[] employees = {dailySalaryEmployee, hourlySalaryEmployee, pieceworkEmployee};
        printSalary(employees);
        Taxes tax = new Taxes(15, 20);
        printSalaryWithTax(employees, tax);
        ChildrenTax childrenTax = new ChildrenTax(5, tax);
        dailySalaryEmployee.setHaveChildren(true);
        hourlySalaryEmployee.setHaveChildren(false);
        pieceworkEmployee.setHaveChildren(false);
        printSalaryWithTaxAndChildren(employees, childrenTax);
        TugrikTax tugrikTax = new TugrikTax(5, tax, 8);
        printSalaryWithTaxAndTugrik(employees, tugrikTax);
        dailySalaryEmployee.setInOffshore(true);
        hourlySalaryEmployee.setInOffshore(false);
        pieceworkEmployee.setInOffshore(false);
        printSalaryOffshore(employees,tax);
        Premium premium = new Premium(childrenTax.getChildrenTax(),tax, 2000);
        printSalaryPremium(employees,premium);
    }

    private void printSalary(Employees[] employees) {
        System.out.println("ФИО      Вид Оплаты   Сумма");
        Salary salary = new Salary();
        salary.printSalary(employees);
        System.out.println("Итого                 " + getSum(employees) + " руб.");

    }

    private int getSum(Employees[] employees) {
        Salary salary = new Salary();
        int sum = 0;
        for (int i = 0; i < employees.length; i++) {
            sum += salary.countSum(employees[i]);
        }
        return sum;
    }

    private void printSalaryWithTax(Employees[] employees, Taxes tax) {
        System.out.println("\nФИО      Налог,%   Сумма,руб.    К оплате,руб.");
        for (int i = 0; i < employees.length; i++) {
            tax.printSalaryWithTax(employees[i]);
        }
    }

    private void printSalaryWithTaxAndChildren(Employees[] employees, ChildrenTax childrenTax) {
        System.out.println("\nФИО      Налог,%   Сумма,руб.    К оплате,руб.");
        for (int i = 0; i < employees.length; i++) {
            childrenTax.printSalaryWithChildrenTax(employees[i]);
        }
    }

    private void printSalaryWithTaxAndTugrik(Employees[] employees, TugrikTax tugrikTax) {
        System.out.println("\nФИО      Налог,%   Сумма,руб.    К оплате,руб.");
        for (int i = 0; i < employees.length; i++) {
            tugrikTax.printTugrik(employees[i]);
        }
    }

    private void printSalaryOffshore(Employees[] employees, Taxes tax) {
        Offshore offshore = new Offshore(5, tax);
        System.out.println("\nОфшорная зона\nФИО      Налог,%   Сумма,руб.    К оплате,руб.");
        for (int i = 0; i < employees.length; i++) {
            offshore.printTaxOffshore(employees[i]);
        }
    }
    private void printSalaryPremium(Employees[] employees, Premium premium){
        System.out.println("\nОфшорная зона\nФИО      Налог,%   Сумма,руб.    К оплате,руб.");
        for (int i = 0; i < employees.length; i++) {
            premium.printPremium(employees[i]);
        }
    }
}
