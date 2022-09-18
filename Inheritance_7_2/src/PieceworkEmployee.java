public class PieceworkEmployee extends Employees {
    protected boolean haveChildren;
    protected String lastName;
    protected int moneyWork1;
    protected int moneyWork2;
    protected int moneyWork3;
    protected boolean inOffshore;
    public PieceworkEmployee(String lastName, int moneyWork1, int moneyWork2, int moneyWork3) {
        this.lastName = lastName;
        this.moneyWork1 = moneyWork1;
        this.moneyWork2 = moneyWork2;
        this.moneyWork3 = moneyWork3;
    }

    public boolean isInOffshore() {
        return inOffshore;
    }

    public void setInOffshore(boolean inOffshore) {
        this.inOffshore = inOffshore;
    }
    @Override
    public String getLastName() {
        return lastName;
    }

    public int getMoneyWork1() {
        return moneyWork1;
    }

    public int getMoneyWork2() {
        return moneyWork2;
    }

    public int getMoneyWork3() {
        return moneyWork3;
    }

    public void setHaveChildren(boolean haveChildren) {
        this.haveChildren = haveChildren;
    }

    @Override
    public boolean isHaveChildren() {
        return haveChildren;
    }
}

