package boohbook.salarity;

import boohbook.Employee;

public class Piecework extends Salary{

    protected float[] work;
    protected float sum;
    private final String paymentType = "Сдельная";

    public Piecework(Employee employee, float[] work) {
        super(employee);
        this.work = work;
        getSum();
    }

    public String getPaymentType() {
        return paymentType;
    }

    @Override
    public float getSum() {
        sum = 0;
        for (float w: work)
            sum+=w;
        return sum;
    }
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(employee.getLastName());
        builder.append(" ");
        builder.append(getPaymentType());
        builder.append("      ");
        builder.append(sum);
        return builder.toString();
    }
}
