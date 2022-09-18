public class TugrikTax extends ChildrenTax {

    protected int rublesInTugrik;

    public TugrikTax(int childrenTax, Taxes tax, int rublesInTugrik) {
        super(childrenTax, tax);
        this.rublesInTugrik = rublesInTugrik;
    }

    public void printTugrik(Employees employees) {
        if (employees instanceof HourlySalaryEmployee) {
            if (!employees.isHaveChildren()) {
                System.out.println(employees.getLastName() + "   " + tax.getFixTax() + "(+5%) " +
                        "  " + super.countSum(employees) + "       " +
                        "  " + countChildrenTax(employees) / 2 + "/" + (countChildrenTax(employees) / 2 / this.rublesInTugrik));
            } else {
                System.out.println(employees.getLastName() + "   " + tax.getFixTax() + "   " +
                        "     " + super.countSum(employees) + "     " +
                        "    " + countChildrenTax(employees) / 2 + "/" + (countChildrenTax(employees) / 2 / this.rublesInTugrik));
            }
        } else {
            super.printSalaryWithChildrenTax(employees);
        }
    }
}
