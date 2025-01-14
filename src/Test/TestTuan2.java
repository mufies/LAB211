package Test;

import java.util.Scanner;
import Tuan2.*;
public class TestTuan2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Normal Calculator");
            System.out.println("2. BMI Calculator");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Option 1 selected");
                    normalCalculator();
                    break;
                case 2:
                    System.out.println("Option 2 selected");
                    BMICalculator();
                    break;
                case 3:
                    System.out.println("Exiting...");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
    public static void normalCalculator() {
        Scanner scanner = new Scanner(System.in);
        Calculate c = new Calculate();
        System.out.println("Normal Calculator");
        double a = getDoubleInput();
        double result = a;
        while(true) {
            Operator operator = new Operator(getOperator());

            if(operator.getOperator() == '=') {
                System.out.println("Result: " + result);
                return;
            }
            else
            {
                double b = getDoubleInput();

                result = c.normalCalc(result, b, operator);
                System.out.println("Result: " + result);

            }

        }
    }
    public static void BMICalculator() {
        Calculate c = new Calculate();
        System.out.println("BMI Calculator");
        double weight = getDoubleInput();
        double height = getDoubleInput();
        c.BMICalc(weight, height);
    }

    public static double getDoubleInput() {
        Scanner scanner = new Scanner(System.in);
        double input = 0;
        boolean valid = false;

        while (!valid) {
            System.out.print("Enter a double value: ");
            String userInput = scanner.nextLine();
            try {
                input = Double.parseDouble(userInput);
                valid = true;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid double value.");
            }
        }

        return input;
    }

    public static char getOperator()
    {
        Scanner scanner = new Scanner(System.in);
        char operator = ' ';
        boolean valid = false;

        while (!valid) {
            System.out.print("Enter an operator (+, -, *, /, ^): ");
            String userInput = scanner.nextLine();
            if(userInput.matches("[+\\-*/^=]") && userInput.length() == 1)
            {
                operator = userInput.charAt(0);
                valid = true;
            }
            else
            {
                System.out.println("Invalid input. Please enter a valid operator.");
            }
        }

        return operator;
    }

}
