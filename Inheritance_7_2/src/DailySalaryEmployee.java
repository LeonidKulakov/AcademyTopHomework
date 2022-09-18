public class DailySalaryEmployee extends Employees {

    protected boolean haveChildren;
    protected String lastName;
    protected int moneyDay;
    protected int day;
    protected boolean inOffshore;
    public DailySalaryEmployee(String lastName, int moneyDay, int day) {
        this.lastName = lastName;
        this.moneyDay = moneyDay;
        this.day = day;
    }

    public boolean isInOffshore() {
        return inOffshore;
    }

    public void setInOffshore(boolean inOffshore) {
        this.inOffshore = inOffshore;
    }

    public int getMoneyDay() {
        return moneyDay;
    }
    public int getDay() {
        return day;
    }
    @Override
    public String getLastName() {
        return lastName;
    }
    @Override
    public boolean isHaveChildren() {
        return haveChildren;
    }
    public void setHaveChildren(boolean haveChildren) {
        this.haveChildren = haveChildren;
    }


}

