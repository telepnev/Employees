public class Employee {
    private final String firstName;
    private final String midleName;
    private final String lastName;
    private int department;
    private double salary;
    private int id ;
    public static int count;


    public Employee(String firstName, String midleName, String lastName, int department, int salary) {
        this.firstName = firstName;
        this.midleName = midleName;
        this.lastName = lastName;
        this.department = department;
        this.salary = salary;
        this.id = 1 + count++;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMidleName() {
        return midleName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    public int getId() {
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
        return "ФИО сотрудника : " + " " + firstName
                + " " + midleName
                + " " + lastName
                + ", отдел : " + department
                + ", зарплата : " + salary
                + ", ID сотрудника - " + id;
    }
}
