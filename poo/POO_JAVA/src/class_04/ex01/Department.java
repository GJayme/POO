package class_04.ex01;

public class Department {
    private String name;
    private int code;
    private String location;
    private int phoneExtention;
    private double budget;
    private Employee[] staff = new Employee[3];
    private Employee chief;

    private int numberOfEmployees = 0;


    public Department(String name, int code, String location, int phoneExtention, double budget) {
        this.name = name;
        this.code = code;
        this.location = location;
        this.phoneExtention = phoneExtention;
        this.budget = budget;
    }

    public Employee[] getStaff() {
        return staff;
    }

    public void addEmployee(Employee employee){
        staff[numberOfEmployees] = employee;
        numberOfEmployees++;
    }

    public Employee getChief() {
        return chief;
    }

    public void setChief(Employee chief) {
        this.chief = chief;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getPhoneExtention() {
        return phoneExtention;
    }

    public void setPhoneExtention(int phoneExtention) {
        this.phoneExtention = phoneExtention;
    }

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }
}
