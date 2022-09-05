package builder;

public class Employee {
    private final String employeeId;
    private final String name;
    private final String email;
    private final int age;
    private final String address;
    private final String position;

    public Employee(String employeeId, String name, String email, int age, String address, String position) {
        super();
        this.employeeId = employeeId;
        this.name = name;
        this.email = email;
        this.age = age;
        this.address = address;
        this.position = position;
    }

    @Override
    public String toString() {
        return "Employee [employeeId=" + employeeId + ", name=" + name + ", email=" + email + ", age=" + age
                + ", address=" + address + ", position=" + position + "]";
    }
}
