package class_04.ex01;

public class Employee {
    private String name;
    private long id;
    private Double salary;
    private String jobTitle;
    private Department department;
    private Department departmentInCharge;


    public Employee(String name, long id, Double salary, String jobTitle, Department department, Department departmentInCharge) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.jobTitle = jobTitle;
        this.department = department;
        this.departmentInCharge = departmentInCharge;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Department getDepartmentInCharge() {
        return departmentInCharge;
    }

    public void setDepartmentInCharge(Department departmentInCharge) {
        this.departmentInCharge = departmentInCharge;
    }
}
