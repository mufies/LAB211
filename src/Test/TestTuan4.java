package Test;

import Tuan4.First.Student;
import Tuan4.First.StudentList;
import Tuan4.Second.PersonList;
import Tuan4.Second.Students;
import Tuan4.Second.Teacher;

import java.util.Scanner;

public class TestTuan4 {
    public static void main(String[] args) {
      InputData input = new InputData();
        Scanner sc = new Scanner(System.in);
//        StudentList sl = new StudentList();
//        while(true)
//        {
//            System.out.println("-----------------MENU-----------------");
//            System.out.println("1. Add student");
//            System.out.println("2. Find and sort student by name");
//            System.out.println("3. Update/Delete student by ID");
//            System.out.println("4. Show student list");
//            System.out.println("5. Exit");
//            System.out.println("--------------------------------------");
//            System.out.print("Enter your choice: ");
//            int choice = input.getInt();
//            switch (choice)
//            {
//                case 1:
//                    int dem = 0;
//                    while(true)
//                    {
//                        System.out.println("Enter student id");
//                        String id = input.getString();
//                        System.out.print("Enter student name: ");
//                        String name = input.getString();
//                        System.out.print("Enter semester: ");
//                        String semester = input.getString();
//                        System.out.print("Enter student course: ");
//                        String course;
//                        while (true){
//                             course = input.getString();
//                            if(course.equalsIgnoreCase("Java") || course.equalsIgnoreCase("C/C++") || course.equalsIgnoreCase(".Net")){
//                                break;
//                            }
//                            System.out.println("Course must be Java, C/C++ or .Net");
//                            System.out.print("Enter student course: ");
//                        }
//                        Student student = new Student(id, name, semester, course);
//                        if (sl.addStudent(student))
//                        {
//                            System.out.println("Add student successfully");
//                            dem++;
//                        }
//                        else
//                        {
//                            System.out.println("Add student failed");
//                        }
//                        if(dem >= 3)
//                        {
//                            System.out.print("Do you want to continue add student? (Y/N): ");
//                            String c = input.getString();
//                            if (c.equalsIgnoreCase("N"))
//                            {
//                                break;
//                            }
//                        }
//                    }
//                    break;
//                case 2:
//                    System.out.print("Enter student name to find: ");
//                    String name = input.getString();
//                    sl.showStudent(sl.sortStudentByName(sl.findStudentByName(name)));
//                    break;
//                case 3:
//                    System.out.print("Enter student ID to update/delete: ");
//                    String id = input.getString();
//                    Student s = sl.findByID(id);
//                    if(s!=null) {
//                        System.out.println("Student found: ");
//                        System.out.println(s);
//                        System.out.println("U. Update student");
//                        System.out.println("D. Delete student");
//                        System.out.print("Enter your choice: ");
//                        String ch = input.getString().toLowerCase();
//
//                        switch (ch) {
//                            case "u":
//                                System.out.print("Enter new student name: ");
//                                String name1 = input.getString();
//                                if (name1 != null && !name1.trim().isEmpty()) {
//                                    s.setStudentName(name1);
//                                }
//                                System.out.print("Enter new semester: ");
//                                String semester = input.getString();
//                                if (semester != null && !semester.trim().isEmpty()) {
//                                    s.setSemester(semester);
//                                }
//                                System.out.print("Enter new student course: ");
//                                String course = input.getString();
//                                if (course != null && !course.trim().isEmpty()) {
//                                    s.setStudentCourse(course);
//                                }
//
//                                sl.updateStudent(s);
//                                System.out.println("Update student successfully");
//                                break;
//                            case "d":
//                                sl.deleteStudent(s);
//                                System.out.println("Delete student successfully");
//                                break;
//                            default:
//                                System.out.println("Invalid choice");
//                        }
//                    }
//                    else
//                    {
//                        System.out.println("Student not found");
//                    }
//                    break;
//                case 4:
//                    sl.getCourseNumberReport();
//                    break;
//                case 5:
//                    System.out.println("Goodbye");
//                    System.exit(0);
//                default:
//                    System.out.println("Invalid choice");
//
//            }
//        }
//        PersonList pl = new PersonList();
//        while (true)
//        {
//            System.out.println("--------------INFORMATION MANAGEMENT--------------");
//            System.out.println("1. Teacher");
//            System.out.println("2. Student");
//            System.out.println("3. Person");
//            System.out.println("4. Exit");
//            System.out.println("--------------------------------------------------");
//            System.out.print("Enter your choice: ");
//            int choice = input.getInt();
//            switch (choice)
//            {
//                case 1:
//                    boolean check = true;
//                    while (check) {
//                        System.out.println("--------------TEACHER--------------");
//                        System.out.println("1. Input");
//                        System.out.println("2. Print");
//                        System.out.println("3. Exit");
//                        System.out.print("Enter your choice: ");
//                        int choice1 = input.getInt();
//                        switch (choice1) {
//                            case 1:
//                                Teacher teacher = new Teacher();
//                                teacher.inputAll();
//                                pl.addPerson(teacher);
//                                break;
//                            case 2:
//                                pl.printTeacherList();
//                                break;
//                            case 3:
//                                check=false;
//                                break;
//                            default:
//                                System.out.println("Invalid choice");
//                        }
//                    }
//                    break;
//                case 2:
//                    boolean check1 = true;
//                    while (check1) {
//                        System.out.println("--------------STUDENT--------------");
//                        System.out.println("1. Input");
//                        System.out.println("2. Print");
//                        System.out.println("3. Exit");
//                        System.out.print("Enter your choice: ");
//                        int choice2 = input.getInt();
//                        switch (choice2) {
//                            case 1:
//                                Students student = new Students();
//                                student.inputAll();
//                                pl.addPerson(student);
//                                break;
//                            case 2:
//                                pl.printStudentList();
//                                break;
//                            case 3:
//                                check1 = false;
//                                break;
//                            default:
//                                System.out.println("Invalid choice");
//                        }
//                    }
//                    break;
//                case 3:
//                    boolean check2 = true;
//                    while (check2) {
//                        System.out.println("--------------PERSON--------------");
//                        System.out.println("1. Search");
//                        System.out.println("2. Print all");
//                        System.out.println("3. Exit");
//                        System.out.print("Enter your choice: ");
//                        int choice3 = input.getInt();
//                        switch (choice3) {
//                            case 1:
//                                pl.findPersonByName(sc.nextLine());
//                                break;
//                            case 2:
//                                pl.printAll();
//                                break;
//                            case 3:
//                                check2 = false;
//                                break;
//                            default:
//                                System.out.println("Invalid choice");
//                        }
//                    }
//
//                    break;
//                case 4:
//                    System.out.println("Goodbye");
//                    System.exit(0);
//                default:
//                    System.out.println("Invalid choice");
//            }
//
//        }
    }
}
