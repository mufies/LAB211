package Tuan6.WorkerInfomationManagement;

public class SalaryHistory {
    private double salary;
    private String status;
    private String date;

    public SalaryHistory(double salary, String status, String date) {
        this.salary = salary;
        this.status = status;
        this.date = date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getSalary() {
        return salary;
    }
}
