public class Salary {

    public void printSalary(Employees[] employees) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] instanceof DailySalaryEmployee) {
                System.out.format("%s   Ставка       %s руб.", employees[i].getLastName(), countSum(employees[i]));
                System.out.println();
            } else if (employees[i] instanceof HourlySalaryEmployee) {
                System.out.format("%s   Почасовая    %s руб.", employees[i].getLastName(), countSum(employees[i]));
                System.out.println();
            } else {
                System.out.format("%s  Сдельная     %s руб.", employees[i].getLastName(), countSum(employees[i]));
                System.out.println();
            }
        }
    }

    protected int countSum(Employees employees) {
        int sum;
        if (employees instanceof DailySalaryEmployee) {
            DailySalaryEmployee dailySalaryEmployee = (DailySalaryEmployee) employees;
            sum = dailySalaryEmployee.getMoneyDay() * dailySalaryEmployee.getDay();
        } else if (employees instanceof HourlySalaryEmployee) {
            HourlySalaryEmployee hourlySalaryEmployee = (HourlySalaryEmployee) employees;
            sum = hourlySalaryEmployee.getHour() * hourlySalaryEmployee.getMoneyHour();
        } else {
            PieceworkEmployee pieceworkEmployee = (PieceworkEmployee) employees;
            sum = pieceworkEmployee.getMoneyWork1() + pieceworkEmployee.getMoneyWork2() + pieceworkEmployee.getMoneyWork3();
        }
        return sum;
    }
}