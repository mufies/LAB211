package Tuan4.Second;

import java.time.Year;
import java.util.Scanner;

public class Teacher extends Person{
    private int yearsInProfession;
    private String contractType;
    private double salaryCoefficient;

    public Teacher() {
        super();
        this.yearsInProfession = 0;
        this.contractType = "";
        this.salaryCoefficient = 0.0;
    }

    public void inputAll(int id, String FullName, String phoneNumber, int birthYear, String Major, int yearsInProfession, String contractType, double salaryCoefficient) {
        super.inputAll(id, FullName, phoneNumber, birthYear, Major);
        this.yearsInProfession = yearsInProfession;
        this.contractType = contractType;
        this.salaryCoefficient = salaryCoefficient;

    }

    @Override
    public String toString() {
        return
                super.toString() +
                " - " + yearsInProfession +
                " - " + contractType  +
                " - " + salaryCoefficient;
    }
}
