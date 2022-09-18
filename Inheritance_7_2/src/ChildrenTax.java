public class ChildrenTax extends Salary {

    protected int childrenTax;
    protected Taxes tax;

    public ChildrenTax(int childrenTax, Taxes tax) {
        this.childrenTax = childrenTax;
        this.tax = tax;
    }

    public int getChildrenTax() {
        return childrenTax;
    }

    public void printSalaryWithChildrenTax(Employees employees) {
        if (!employees.isHaveChildren()) {
            if (employees instanceof DailySalaryEmployee) {
                System.out.println(employees.getLastName() + "   " + tax.getFixTax() + "(+5%)" +
                        "   " + super.countSum(employees) + "         " + countChildrenTax(employees));
            }else if (employees instanceof HourlySalaryEmployee) {
                System.out.println(employees.getLastName() + "   " + tax.getFixTax() + "(+5%) " +
                        "  " + super.countSum(employees) + "         " + countChildrenTax(employees));
            } else {
                System.out.println(employees.getLastName() + "  " + tax.getTaxPiecework() + "(+5%) " +
                        "  " + super.countSum(employees) + "         " + countChildrenTax(employees));
            }
        }else {
            if (employees instanceof DailySalaryEmployee) {
                System.out.println(employees.getLastName() + "   " + tax.getFixTax() + "   " +
                        "     " + super.countSum(employees) + "         " + countChildrenTax(employees));
            }else if (employees instanceof HourlySalaryEmployee) {
                System.out.println(employees.getLastName() + "   " + tax.getFixTax() + "   " +
                        "     " + super.countSum(employees) + "         " + countChildrenTax(employees));
            } else {
                System.out.println(employees.getLastName() + "  " + tax.getTaxPiecework() + "   " +
                        "     " + super.countSum(employees) + "         " + countChildrenTax(employees));
            }
        }
    }

    public double countChildrenTax(Employees employees) {
        if (!employees.isHaveChildren()) {
            int salTax;
            if (employees instanceof PieceworkEmployee) {
                salTax = super.countSum(employees) * (100 - tax.getTaxPiecework() - 5) / 100;
            } else {
                salTax = super.countSum(employees) * (100 - tax.getFixTax() - 5) / 100;
            }
            return salTax;
        } else return tax.countTax(employees);
    }
}
