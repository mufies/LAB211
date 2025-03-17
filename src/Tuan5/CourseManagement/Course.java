package Tuan5.CourseManagement;



public class Course  {
    private String CourseName;
    private String CourseID;
    private int credit;

    public Course() {
        this.CourseID = "";
        this.CourseName = "";
        this.credit = 0;
    }

    public void InputAll(String courseID,String CourseName,int credit) {
        this.CourseID = courseID;
        this.CourseName = CourseName;
        this.credit = credit;
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
