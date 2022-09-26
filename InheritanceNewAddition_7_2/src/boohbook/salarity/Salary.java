package boohbook.salarity;

import boohbook.Employee;

public abstract class Salary {

    protected Employee employee;

    public Salary(Employee employee) {
        this.employee = employee;
    }

    public abstract float getSum();

    public Employee getEmployee() {
        return employee;
    }

}


