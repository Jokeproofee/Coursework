public class Employee {
    private String name;
    private int department;
    private float salary;
    private static int counter = 0;
    private int id;

    public Employee(String name, int department, float salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
        id = counter++;
    }

    public String getName() {
        return name;
    }

    public int getDepartment() {
        return department;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Id: " + id + " / Ф.И.О: " + name + " / Отдел: " + department + " / Зарплата: " + salary + " рублей";
    }
}