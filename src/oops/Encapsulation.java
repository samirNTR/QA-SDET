package oops;

class Employee {
    private String name;
    private int employeeId;

    public void setName(String name) {
        this.name = name;
    }

    public void setEmployeeId(int id) {
        this.employeeId = id;
    }

    public String getName() {
        return name;
    }

    public int getEmployeeId() {
        return employeeId;
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.setName("John Doe");
        emp.setEmployeeId(123);
        System.out.println("Name: " + emp.getName() + ", Employee ID: " + emp.getEmployeeId());
    }
}
