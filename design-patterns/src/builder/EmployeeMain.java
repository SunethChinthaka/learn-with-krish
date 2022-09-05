package builder;

public class EmployeeMain {
    public static void main(String[] args) {
        Employee employee = new EmployeeBuilder().setName("Suneth").setPosition("Associate Engineer").getEmployee();
        System.out.println(employee);
    }
}

