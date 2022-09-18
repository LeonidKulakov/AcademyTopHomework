public class Taxes extends Salary {

    private int taxPiecework;
    private int fixTax;


    public Taxes(int taxPiecework, int fixTax) {
        this.taxPiecework = taxPiecework;
        this.fixTax = fixTax;
    }

    public int getTaxPiecework() {
        return taxPiecework;
    }

    public int getFixTax() {
        return fixTax;
    }

    public void setTaxPiecework(int taxPiecework) {
        this.taxPiecework = taxPiecework;
    }

    public void setFixTax(int fixTax) {
        this.fixTax = fixTax;
    }
    public double countTax(Employees employees) {
        int salTax;
        if (employees instanceof PieceworkEmployee) {
            salTax = super.countSum(employees) * (100 - taxPiecework) / 100;
        } else {
            salTax = super.countSum(employees) * (100 - fixTax) / 100;
        }
        return salTax;
    }

    public void printSalaryWithTax(Employees employees) {
        if (employees instanceof DailySalaryEmployee) {
            System.out.println(employees.getLastName() + "   " + this.fixTax + "        " + super.countSum(employees) + "         " + countTax(employees));
        } else if (employees instanceof HourlySalaryEmployee) {
            System.out.println(employees.getLastName() + "   " + this.fixTax + "        " + super.countSum(employees) + "         " + countTax(employees));
        } else {
            System.out.println(employees.getLastName() + "  " + this.taxPiecework + "        " + super.countSum(employees) + "         " + countTax(employees));
        }
    }
}
