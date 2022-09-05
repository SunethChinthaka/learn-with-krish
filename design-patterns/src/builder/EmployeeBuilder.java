package builder;

public class EmployeeBuilder {
    private String employeeId;
    private String name;
    private String email;
    private int age;
    private String address;
    private String position;

    public EmployeeBuilder setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
        return this;
    }
    public EmployeeBuilder setName(String name) {
        this.name = name;
        return this;
    }
    public EmployeeBuilder setEmail(String email) {
        this.email = email;
        return this;
    }
    public EmployeeBuilder setAge(int age) {
        this.age = age;
        return this;
    }
    public EmployeeBuilder setAddress(String address) {
        this.address = address;
        return this;
    }
    public EmployeeBuilder setPosition(String position) {
        this.position = position;
        return this;
    }

    public Employee getEmployee() {
        return new Employee(employeeId, name, email, age, address, position);
    }
}
