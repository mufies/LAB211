package Tuan4.Second;

import java.time.Year;

public class Students extends Person {
    private int yearOfAdmission;
    private double entranceEnglishScore;

    public Students() {
        super();
        this.yearOfAdmission = 0;
        this.entranceEnglishScore = 0.0;
    }

    public void inputAll(int id, String FullName, String phoneNumber, int birthYear, String Major, int yearOfAdmission, double entranceEnglishScore) {
        super.inputAll(id, FullName, phoneNumber, birthYear, Major);



        this.yearOfAdmission = yearOfAdmission;


        this.entranceEnglishScore = entranceEnglishScore;

    }

    public String toString() {
        return
                super.toString() +
                " - " + yearOfAdmission +
                " - " + entranceEnglishScore;
    }
}
