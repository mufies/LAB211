package Test;
import Tuan5.*;
import Tuan5.CourseManagement.CourseList;
import Tuan5.CourseManagement.OfflineCourse;
import Tuan5.CourseManagement.OnlineCourse;
import Tuan5.RoomReservations.ReservationList;
import Tuan5.RoomReservations.ReservationView;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestTuan5 {
    public static void main(String[] args) throws ParseException {
        InputData input = new InputData();
        System.out.println("Input 2 num");
        String a = input.getStringNumber();
        String b = input.getStringNumber();
        LargeNum largeNum = new LargeNum();
        largeNum.add(a, b);
        System.out.println(largeNum.getRes());
//        largeNum.Multiply(a, b);
//        System.out.println(largeNum.getRes());

//        CourseList cl = new CourseList();
//        while (true) {
//            System.out.println("\n*** Course Management ***");
//            System.out.println("1. Add online course / offline course");
//            System.out.println("2. Update course");
//            System.out.println("3. Remove course");
//            System.out.println("4. Print all / online / offline courses");
//            System.out.println("5. Search course by name");
//            System.out.println("6. Exit");
//            System.out.print("Enter your choice: ");
//
//            int choice = input.getInt();
//
//            switch (choice) {
//                case 1:
//                    System.out.println("\n*** Add new course ***");
//                    while (true) {
//                        System.out.print("Enter O for Online Course, F for Offline Course: ");
//                        String type = input.getString().toUpperCase();
//
//                        if (type.equals("O")) {
//                            OnlineCourse oc = new OnlineCourse();
//                            String CourseID;
//                            while (true) {
//                                System.out.println("Enter course ID: ");
//                                CourseID = input.getString();
//                                if (cl.findByID(CourseID)) {
//                                    System.out.println("Course ID already exists. Please enter a different ID.");
//                                } else {
//                                    break;
//                                }
//                            }
//                            String CourseName;
//                            while (true) {
//                                System.out.println("Enter course name: ");
//                                CourseName = input.getString();
//                                if (cl.findByName(CourseName)) {
//                                    System.out.println("Course Name already exists. Please enter a different name.");
//                                } else {
//                                    break;
//                                }
//                            }
//                            int credit;
//                            while (true) {
//                                System.out.println("Enter credit: ");
//                                credit = input.getInt();
//                                if (credit > 0) break;
//                                System.out.println("Credit must be greater than 0.");
//                            }
//
//                            System.out.println("Enter platform: ");
//                            String platform = input.getString();
//                            System.out.println("Enter instructor: ");
//                            String instructor = input.getString();
//                            System.out.println("Enter note");
//                            String note = input.getString();
//
//                            oc.inputAll(CourseID, CourseName, credit, platform, instructor, note);
//                            cl.addCourse(oc);
//                            System.out.println("Online course added successfully.");
//                            break;
//                        } else if (type.equals("F")) {
//                            OfflineCourse fc = new OfflineCourse();
//                            String CourseID;
//                            while (true) {
//                                System.out.println("Enter course ID: ");
//                                CourseID = input.getString();
//                                if (cl.findByID(CourseID)) {
//                                    System.out.println("Course ID already exists. Please enter a different ID.");
//                                } else {
//                                    break;
//                                }
//                            }
//                            String CourseName;
//                            while (true) {
//                                System.out.println("Enter course name: ");
//                                CourseName = input.getString();
//                                if (cl.findByName(CourseName)) {
//                                    System.out.println("Course Name already exists. Please enter a different name.");
//                                } else {
//                                    break;
//                                }
//                            }
//                            int credit;
//                            while (true) {
//                                System.out.println("Enter credit: ");
//                                credit = input.getInt();
//                                if (credit > 0) break;
//                                System.out.println("Credit must be greater than 0.");
//                            }
//                            String begin;
//                            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
//                            while(true) {
//                                System.out.println("Enter begin date (dd/MM/yyyy): ");
//                                begin = input.getDate();
//                                if (sdf.parse(begin).after(new Date())) break;
//                                System.out.println("Begin date must be after the present date.");
//
//                            }
//                            Date beginDate = sdf.parse(begin);
//
//                            String end;
//                            while (true) {
//                                System.out.println("Enter end date (must be after begin date): ");
//                                end = input.getDate();
//                                if (sdf.parse(end).after(beginDate)) break;
//                                System.out.println("End date must be after begin date.");
//                            }
//
//                            System.out.println("Enter campus: ");
//                            String campus = input.getString();
//                            fc.inputAll(CourseID, CourseName, credit, begin, end, campus);
//                            cl.addCourse(fc);
//                            System.out.println("Offline course added successfully.");
//                            break;
//                        } else {
//                            System.out.println("Invalid input! Please enter O or F.");
//                        }
//                    }
//                    break;
//
//                case 2:
//                    System.out.println("\n*** Update course ***");
//                    cl.updateCourse();
//                    break;
//
//                case 3:
//                    System.out.println("\n*** Remove course ***");
//                    cl.deleteCourse();
//                    break;
//
//                case 4:
//                    System.out.println("\n*** Print Courses ***");
//                    System.out.print("Enter A (All), O (Online), F (Offline): ");
//                    while (true) {
//                        String option = input.getString().toUpperCase();
//                        if (option.equals("A") || option.equals("O") || option.equals("F")) {
//                            cl.displayAll(option);
//                            break;
//                        }
//                        System.out.println("Invalid input! Please enter A, O, or F.");
//                    }
//                    break;
//
//                case 5:
//                    System.out.println("\n*** Search Course by Name ***");
//                    cl.searchByName();
//                    break;
//
//                case 6:
//                    System.out.println("Exiting program...");
//                    return;
//
//                default:
//                    System.out.println("Invalid choice! Please enter a number between 1-6.");
//            }
//        }


//        ReservationList rl = new ReservationList();
//        ReservationView rv = new ReservationView();
//        while (true)
//        {
//            System.out.println("*** Reservation Management ***");
//            System.out.println("1. Add reservation");
//            System.out.println("2. Update reservation");
//            System.out.println("3. Remove reservation");
//            System.out.println("4. Print Flight reservations");
//            System.out.println("5. Print all reservations");
//            System.out.println("6. Exit");
//            System.out.print("Enter your choice: ");
//            int choice = input.getInt();
//            switch (choice)
//            {
//                case 1:
//                    rl.addReservation(rv.getFlightInfo());
//                    break;
//                case 2:
//                    rl.updateReservation();
//                    break;
//                case 3:
//                    rl.deleteReservation();
//                    break;
//                case 4:
//                    rv.displayFlightInfo(rl.getRl());
//                    break;
//                case 5:
//                    rv.displayAll(rl.getRl());
//                    break;
//                case 6:
//                    System.out.println("Exiting program...");
//                    return;
//                default:
//                    System.out.println("Invalid choice! Please enter a number between 1-6.");
//
//            }
//        }


    }
}