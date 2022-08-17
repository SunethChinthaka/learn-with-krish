public class Application {
    public static void main(String[] args) {
        Employee employee = new Employee(1, 20);
        Employee employee2 = new Employee(1, 20);
        Employee employee3 = new Employee(3, 50);

        if (employee.equals(employee2)) {
            System.out.println("Employee equals");

        } else {
            System.out.println("Employee not equals");
        }

        if (employee2.equals(employee3)) {
            System.out.println("Employee equals");

        } else {
            System.out.println("Employee not equals");
        }

        if (employee.equals(employee3)) {
            System.out.println("Employee equals");

        } else {
            System.out.println("Employee not equals");
        }
    }
}
