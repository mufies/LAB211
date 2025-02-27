package Test;

import Tuan6.ContactManagement.ContactList;
import Tuan6.ContactManagement.ContactView;
import Tuan6.WorkerInfomationManagement.WorkerList;
import Tuan6.WorkerInfomationManagement.WorkerView;

public class TestTuan6 {
    public static void main(String[] args) {
        InputData input = new InputData();
//        WorkerList workerList = new WorkerList();
//        WorkerView workerView = new WorkerView();
//        while (true) {
//            System.out.println("Worker Management");
//            System.out.println("1. Add Worker");
//            System.out.println("2. Up salary");
//            System.out.println("3. Down salary");
//            System.out.println("4. Print Worker");
//            System.out.println("5. Exit");
//            System.out.print("Enter your choice: ");
//            int choice = input.getInt();
//            switch (choice) {
//                case 1 -> {if(!workerList.addWorker(workerView.getWorker())) System.out.println("Invalid Worker");}
//                case 2 -> {
//                    System.out.print("Enter worker ID: ");
//                    String id = input.getString();
//                    System.out.print("Enter salary: ");
//                    double salary = input.getDouble();
//                    if(!workerList.increaseSalary(id, salary))
//                    {
//                        System.out.println("Invalid ID or Salary");
//                    }
//
//                }
//                case 3 -> {
//                    System.out.print("Enter worker ID: ");
//                    String id = input.getString();
//                    System.out.print("Enter salary: ");
//                    double salary = input.getDouble();
//                    if(!workerList.decreaseSalary(id, salary))
//                    {
//                        System.out.println("Invalid ID or Salary");
//                    }
//                }
//                case 4 -> workerView.printWorker(workerList.getWorkers());
//                case 5 -> System.exit(0);
//                default -> System.out.println("Invalid choice");
//            }
//
//        }

        ContactList contactList = new ContactList();
        ContactView contactView = new ContactView();
        while (true) {
            System.out.println("Contact Management");
            System.out.println("1. Add Contact");
            System.out.println("2. Print Contact");
            System.out.println("3. Delete");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = input.getInt();
            switch (choice) {
                case 1 -> {
                    if (!contactList.addContact(contactView.inputContact())) System.out.println("Invalid Contact");
                }
                case 2 -> contactView.printContact(contactList.getContacts());
                case 3 -> {
                    System.out.print("Enter ID: ");
                    if (!contactList.deleteContact(input.getInt())) System.out.println("Invalid ID");
                    else System.out.println("Deleted");
                }
                case 4 -> System.exit(0);
                default -> System.out.println("Invalid choice");
            }

        }

    }
}
