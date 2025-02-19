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

    public void inputAll(String courseID,String CourseName,int credit, String platform, String instructor, String note) {
        super.InputAll(courseID, CourseName, credit);
        this.platform = platform;
        this.instructor = instructor;
        this.note = note;
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
