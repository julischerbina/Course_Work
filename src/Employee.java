public class Employee {
    private String fullName;
    private int department;
    private double salary;
    private int counter;
    static int id = 0;

    public Employee(String fullName, int department, double salary) {
        this.fullName = fullName;
        this.department = department;
        this.salary = salary;
        id++;
        this.counter = id;
    }

    public String getFullName() {
        return fullName;
    }

    public int getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    public static int getId() {
        return id;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return counter + ". " + fullName + ", " + department + " отдел, заработная плата " + salary;
    }
}
