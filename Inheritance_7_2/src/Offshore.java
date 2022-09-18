public class Offshore extends ChildrenTax {

    public Offshore(int childrenTax, Taxes tax) {
        super(childrenTax, tax);
    }
    public void printTaxOffshore(Employees employees){
        if (employees.isInOffshore()){
            if (employees instanceof DailySalaryEmployee) {
                System.out.println(employees.getLastName() + "   0%        " + super.countSum(employees) + "         " + super.countSum(employees));
            } else if (employees instanceof HourlySalaryEmployee) {
                System.out.println(employees.getLastName() + "   0%        " + super.countSum(employees) + "         " + super.countSum(employees));
            } else {
                System.out.println(employees.getLastName() + "   0%         " + super.countSum(employees) + "         " + super.countSum(employees));
            }
        }else {
            super.printSalaryWithChildrenTax(employees);
        }
    }

}
