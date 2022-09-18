public class Premium extends Offshore {
    private int premiumMoney;

    public Premium(int childrenTax, Taxes tax, int premiumMoney) {
        super(childrenTax, tax);
        this.premiumMoney = premiumMoney;
    }

    public void printPremium(Employees employees) {
        int taxPrem = premiumMoney * (100 - tax.getFixTax()) / 100;
        int taxPremChil = premiumMoney * (100 - tax.getFixTax() - super.getChildrenTax()) / 100;
        if (!employees.isInOffshore()) {
            if (employees instanceof DailySalaryEmployee) {
                DailySalaryEmployee dailySalaryEmployee = (DailySalaryEmployee) employees;
                if (dailySalaryEmployee.getDay() * 8 > 200) {
                    if (!dailySalaryEmployee.isHaveChildren()) {
                        System.out.println(employees.getLastName() + "   " + tax.getFixTax() + "(+5%)" +
                                "   " + (super.countSum(employees) + premiumMoney) + "         " + (countChildrenTax(employees) + taxPremChil));
                    } else {
                        System.out.println(employees.getLastName() + "   " + tax.getFixTax() + "   " +
                                "     " + (super.countSum(employees) + premiumMoney) + "         " + (countChildrenTax(employees) + taxPrem));
                    }
                } else {
                    super.printSalaryWithChildrenTax(employees);
                }
            } else if (employees instanceof HourlySalaryEmployee) {
                HourlySalaryEmployee hourlySalaryEmployee = (HourlySalaryEmployee) employees;
                if (hourlySalaryEmployee.getHour() > 200) {
                    if (!hourlySalaryEmployee.isHaveChildren()) {
                        System.out.println(employees.getLastName() + "   " + tax.getFixTax() + "(+5%)" +
                                "   " + (super.countSum(employees) + premiumMoney) + "         " + (countChildrenTax(employees) + taxPremChil));
                    } else {
                        System.out.println(employees.getLastName() + "   " + tax.getFixTax() + "   " +
                                "     " + (super.countSum(employees) + premiumMoney) + "         " + (countChildrenTax(employees) + taxPrem));
                    }
                } else {
                    super.printSalaryWithChildrenTax(employees);
                }
            }else {
                super.printSalaryWithChildrenTax(employees);
            }
        }else {
            super.printTaxOffshore(employees);
        }
    }
}
