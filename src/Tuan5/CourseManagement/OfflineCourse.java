package Tuan5.CourseManagement;

import Test.InputData;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class OfflineCourse extends Course {
    private String begin;
    private String end;
    private String campus;

    public OfflineCourse() {
        super();
        this.begin = "";
        this.end = "";
        this.campus = "";
    }

    public void inputAll(InputData sc, CourseList cl) throws ParseException {
        super.InputAll(sc, cl);

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Enter begin date (dd/MM/yyyy): ");
        begin = sc.getDate();

        Date beginDate = sdf.parse(begin);
        while (true) {
            System.out.println("Enter end date (must be after begin date): ");
            end = sc.getDate();
            if (sdf.parse(end).after(beginDate)) break;
            System.out.println("End date must be after begin date.");
        }

        System.out.println("Enter campus: ");
        campus = sc.getString();
    }

    public String getBegin() {
        return begin;
    }

    public void setBegin(String begin) {
        this.begin = begin;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    public String getCampus() {
        return campus;
    }

    public void setCampus(String campus) {
        this.campus = campus;
    }

    @Override
    public String toString() {
        return super.toString() + " - " + begin + " - " + end + " - " + campus;
    }
}
