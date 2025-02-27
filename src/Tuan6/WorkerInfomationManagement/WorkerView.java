package Tuan6.WorkerInfomationManagement;

import Test.InputData;

import java.util.List;

public class WorkerView {
    public Worker getWorker()
    {
        InputData input = new InputData();
        System.out.println("Worker Information");
        System.out.println("ID: ");
        String id = input.getString();
        System.out.println("Name: ");
        String name = input.getString();
        System.out.println("Age: ");
        int age = input.getInt();
        System.out.println("Salary: ");
        double salary = input.getDouble();
        System.out.println("Work Location: ");
        String workLocation = input.getString();
        Worker w = new Worker(id, name, age, salary, workLocation);
        return w;
    }

    public void printWorker(List<Worker> workerList)
    {
        if(workerList.isEmpty()) {
            System.out.println("Empty");
            return;
        }

        System.out.println("Worker Information");
        System.out.println("Code - Name - Age - Salary - Status - Date");
       for(Worker w : workerList)
       {
           for(SalaryHistory s : w.getSalaryHistory())
           {
               System.out.println(w.getId() + " - " + w.getName() + " - " + w.getAge() + " - " + s.getSalary() + " - " + s.getStatus() + " - " + s.getDate());
           }
       }
    }
}
