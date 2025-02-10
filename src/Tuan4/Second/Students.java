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

    public void inputAll() {
        super.inputAll();

        int currentYear = Year.now().getValue();
        int birthYear = super.getBirthDate();
        System.out.println("Enter year of admission: ");
        int yearOfAdmission = inputData.getInt();
        while (yearOfAdmission < birthYear || yearOfAdmission > currentYear) {
            System.out.println("Wrong format");
            yearOfAdmission = inputData.getInt();
        }

        this.yearOfAdmission = yearOfAdmission;
        System.out.println("Enter entrance English score: ");
        double entranceEnglishScore = inputData.getDouble();
        while (entranceEnglishScore < 0 || entranceEnglishScore > 100) {
            System.out.println("Wrong format");
            entranceEnglishScore = inputData.getDouble();
        }

        this.entranceEnglishScore = entranceEnglishScore;

    }

    public String toString() {
        return "Student{" +
                super.toString() +
                "yearOfAdmission=" + yearOfAdmission +
                ", entranceEnglishScore=" + entranceEnglishScore +
                '}';
    }
}
