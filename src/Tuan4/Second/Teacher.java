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

    public void inputAll() {
        super.inputAll();
        Scanner sc = new Scanner(System.in);
        int age = Year.now().getValue() - super.getBirthDate();

        System.out.println("Enter years in profession: ");
        int yearsInProfession = inputData.getInt();
        while (yearsInProfession < 0 || yearsInProfession >= age) {
            System.out.println("Wrong format");
            yearsInProfession = inputData.getInt();
        }

        this.yearsInProfession = yearsInProfession;
        System.out.println("Enter contract type: ");
        String contractType = sc.nextLine();
        while (contractType.length() > 30) {
            System.out.println("Wrong format");
            contractType = sc.nextLine();
        }

        this.contractType = contractType;
        System.out.println("Enter salary coefficient: ");
        double salaryCoefficient = inputData.getDouble();
        while (salaryCoefficient < 0) {
            System.out.println("Wrong format");
            salaryCoefficient = inputData.getDouble();
        }

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
