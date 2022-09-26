package boohbook.salarity;

import boohbook.Employee;

public class BidSalary extends Salary{

    protected float bidDay;
    protected int day;
    protected float sum;
    private final String paymentType = "Ставка";

    public BidSalary(Employee employee, float bidDay, int day) {
        super(employee);
        this.bidDay = bidDay;
        this.day = day;
        getSum();
    }
   @Override
    public float getSum(){
        sum = bidDay*day;
        return sum;
    }

    public String getPaymentType() {
        return paymentType;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(employee.getLastName());
        builder.append("  ");
        builder.append(getPaymentType());
        builder.append("        ");
        builder.append(sum);
        return builder.toString();
    }
}
