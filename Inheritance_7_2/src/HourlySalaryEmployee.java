import java.util.Scanner;

public class HourlySalaryEmployee extends Employees {
    protected boolean haveChildren;
    protected String lastName;
    protected int moneyHour;
    protected int hour;
    protected boolean inOffshore;
    public HourlySalaryEmployee(String lastName, int moneyHour, int hour) {
        this.lastName = lastName;
        this.moneyHour = moneyHour;
        this.hour = hour;
    }
    public int getMoneyHour() {
        return moneyHour;
    }
    public int getHour() {
        return hour;
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

    public void setHaveChildren(boolean haveChildren) {
        this.haveChildren = haveChildren;
    }
    @Override
    public boolean isHaveChildren() {
        return haveChildren;
    }
}
