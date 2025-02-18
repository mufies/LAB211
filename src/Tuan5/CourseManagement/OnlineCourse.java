package Tuan5.CourseManagement;

import Test.InputData;

public class OnlineCourse extends Course {
    private String platform;
    private String instructor;
    private String note;

    public OnlineCourse() {
        super();
        this.platform = "";
        this.instructor = "";
        this.note = "";
    }

    public void inputAll(InputData sc, CourseList cl) {
        super.InputAll(sc, cl);
        System.out.println("Enter platform: ");
        platform = sc.getString();
        System.out.println("Enter instructor: ");
        instructor = sc.getString();
        System.out.println("Enter note: ");
        note = sc.getString();
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public String getInstructor() {
        return instructor;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Override
    public String toString() {
        return super.toString() + " - Platform: " + platform + " - Instructor: " + instructor + " - Note: " + note;
    }
}
