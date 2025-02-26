package Tuan6.ContactManagement;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class Worker implements Comparable<Worker> {
    private String id;
    private String name;
    private int age;
    private double salary;
    private String workLocation;
    private List<SalaryHistory> salaryHistory;

    public Worker(String id, String name, int age, double salary, String workLocation) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.workLocation = workLocation;
        this.salaryHistory = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {

        String date = new SimpleDateFormat("dd/MM/yyyy").format(new java.util.Date());
        if (salary > this.salary) {
            salaryHistory.add(new SalaryHistory(salary,"UP", date));
        } else if (salary < this.salary) {
            salaryHistory.add(new SalaryHistory(salary,"DOWN", date));
        }
        this.salary = salary;
    }

    public String getWorkLocation() {
        return workLocation;
    }

    public void setWorkLocation(String workLocation) {
        this.workLocation = workLocation;
    }
    public int compareTo(Worker other) {
        return this.id.compareTo(other.id);
    }

    public List<SalaryHistory> getSalaryHistory() {
        return salaryHistory;
    }

    public void setSalaryHistory(List<SalaryHistory> salaryHistory) {
        this.salaryHistory = salaryHistory;
    }

    @Override
    public String toString() {
        return
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", workLocation='" + workLocation;
    }
}

