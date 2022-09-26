package boohbook;

public class Employee {

    private String lastName;
    private boolean children;
    private boolean offshore;

    public Employee(String lastName) {
        this.lastName = lastName;
    }

    public Employee(String lastName, boolean children, boolean offshore) {
        this.lastName = lastName;
        this.children = children;
        this.offshore = offshore;
    }

    public String getLastName() {
        return lastName;
    }

    public boolean isChildren() {
        return children;
    }

    public boolean isOffshore() {
        return offshore;
    }

    public void setChildren(boolean children) {
        this.children = children;
    }

    public void setOffshore(boolean offshore) {
        this.offshore = offshore;
    }
}
