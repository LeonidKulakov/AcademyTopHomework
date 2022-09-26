package boohbook.salarity;

import boohbook.Employee;

public class HourSalary extends Salary {

    protected float hourBid;
    protected int hour;
    protected float sum;
    private final String paymentType = "Почасовая";

    public HourSalary(Employee employee, float hourBid, int hour) {
        super(employee);
        this.hourBid = hourBid;
        this.hour = hour;
        getSum();
    }

    public String getPaymentType() {
        return paymentType;
    }

    @Override
    public float getSum() {
        sum = hour*hourBid;
        return sum;
    }
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(employee.getLastName());
        builder.append("  ");
        builder.append(getPaymentType());
        builder.append("     ");
        builder.append(sum);
        return builder.toString();
    }
}
