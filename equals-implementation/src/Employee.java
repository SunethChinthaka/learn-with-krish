public class Employee {
    private int id;
    private int code;
    private String name;
    private String NIC;
    private String address;

    public Employee(int id, int code) {
        this.id = id;
        this.code = code;
    }

    public boolean equals(Object obj) {

        Employee e = (Employee) obj;
        if (this.id != e.id && this.code != e.code) {
            return false;
        }
        return true;

    }
}
