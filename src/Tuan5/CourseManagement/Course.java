package Tuan5.CourseManagement;

import Test.InputData;

public class Course {
    private String CourseName;
    private String CourseID;
    private int credit;

    public Course() {
        this.CourseID = "";
        this.CourseName = "";
        this.credit = 0;
    }

    public void InputAll(InputData sc, CourseList cl) {
        while (true) {
            System.out.println("Enter course ID: ");
            CourseID = sc.getString();
            if (cl.findByID(CourseID)) {
                System.out.println("Course ID already exists. Please enter a different ID.");
            } else {
                break;
            }
        }

        while (true) {
            System.out.println("Enter course name: ");
            CourseName = sc.getString();
            if (cl.findByName(CourseName)) {
                System.out.println("Course Name already exists. Please enter a different name.");
            } else {
                break;
            }
        }

        while (true) {
            System.out.println("Enter credit: ");
            credit = sc.getInt();
            if (credit > 0) break;
            System.out.println("Credit must be greater than 0.");
        }
    }

    public String getCourseName() {
        return CourseName;
    }

    public void setCourseName(String courseName) {
        CourseName = courseName;
    }

    public String getCourseID() {
        return CourseID;
    }

    public void setCourseID(String courseID) {
        CourseID = courseID;
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    @Override
    public String toString() {
        return "CourseName='" + CourseName + "', CourseID='" + CourseID + "', Credit=" + credit;
    }
}
