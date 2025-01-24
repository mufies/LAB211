package Test;

import java.util.InputMismatchException;
import java.util.Scanner;
import Tuan2.*;
public class TestTuan2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Bai 1");
            System.out.println("2. Bai 2");
            System.out.println("3. Bai 3");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = getInt();
            switch (choice)
            {
                case 1:
                    boolean check=true;
                    while (check) {
                        System.out.println("Menu:");
                        System.out.println("1. Normal Calculator");
                        System.out.println("2. BMI Calculator");
                        System.out.println("3. Exit");
                        System.out.print("Enter your choice: ");
                        int choice1 = scanner.nextInt();

                        switch (choice1) {
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
                                check=false;
                                break;
                            default:
                                System.out.println("Invalid choice. Please try again.");
                        }
                    }
                break;
                case 2:
                    calculateShapeProgram();
                    break;
                case 3:
                    matrixCalculator();
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }

        }
    }
    public static void normalCalculator() {
            Calculate c = new Calculate();
            System.out.println("Normal Calculator");
            double a = getDoubleInput();
            double result = a;
            while (true) {
                Operator operator = new Operator(getOperator());

                if (operator.getOperator() == '=') {
                    System.out.println("Result: " + result);
                    return;
                } else {
                    double b = getDoubleInput();

                    result = c.normalCalc(result, b, operator);
                    System.out.println("Result: " + result);

                }

            }
        }

   public static void calculateShapeProgram() {
    System.out.println("=====Calculator Shape Program=====");
    System.out.println("Please input side width of Rectangle: ");
    double width = getDouble();
    System.out.println("Please input length of Rectangle: ");
    double length = getDouble();
    System.out.println("Please input radius of Circle: ");
    double radius = getDouble();
    System.out.println("Please input side A of Triangle: ");
    double sideA = getDouble();
    System.out.println("Please input side B of Triangle: ");
    double sideB = getDouble();
    System.out.println("Please input side C of Triangle: ");
    double sideC = getDouble();

    CalculatePerimeterAndArea calculatePerimeterAndArea = new CalculatePerimeterAndArea();
    System.out.println("CalculatePerimeterAndArea object created");

    System.out.println("-----Rectangle-----");
    System.out.println("Width: " + width);
    System.out.println("Length: " + length);
    System.out.println("Rectangle Perimeter: " + calculatePerimeterAndArea.CalculatePerimeter(width, length));
    System.out.println("Rectangle Area: " + calculatePerimeterAndArea.CalculateArea(width, length));

    System.out.println("-----Circle-----");
    System.out.println("Radius: " + radius);
    System.out.println("Circle Perimeter: " + calculatePerimeterAndArea.CalculateRadiusPerimeter(radius));
    System.out.println("Circle Area: " + calculatePerimeterAndArea.CalculateRadiusArea(radius));

    System.out.println("-----Triangle-----");
    System.out.println("Side A: " + sideA);
    System.out.println("Side B: " + sideB);
    System.out.println("Side C: " + sideC);
    System.out.println("Triangle Perimeter: " + calculatePerimeterAndArea.CalculateTrianglePerimeter(sideA, sideB, sideC));
    System.out.println("Triangle Area: " + calculatePerimeterAndArea.CalculateTriangleArea(sideA, sideB, sideC));
}


    public static int[][] inputMatrix(int num) {
        System.out.print("Enter number of rows for matrix " + num + ": ");
        int rows = getInt();
        System.out.print("Enter number of columns for matrix " + num + ": ");
        int columns = getInt();
        int[][] matrix = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("Enter Matrix "+num+" at [" + (i+1) + "][" + (j+1) + "]: ");
                matrix[i][j] = getInt();
            }
        }
        return matrix;
    }




    public static void matrixCalculator() {
    boolean check = true;
    while (check) {
        System.out.println("Menu:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Exit");
        System.out.print("Enter your choice: ");
        int choice = getInt();
        switch (choice) {
            case 1:
                while (true) {
                    try {
                        Matrix m = new Matrix(inputMatrix(1));
                        Matrix m1 = new Matrix(inputMatrix(2));
                        if (m.rows() != m1.rows() || m.cols() != m1.cols()) {
                            throw new IllegalArgumentException("Matrix dimensions must match for addition");
                        }
                        Matrix result = m.additionMatrix(m1);
                        System.out.println("Result:");
                        m.printMatrix();
                        System.out.println("+");
                        m1.printMatrix();
                        System.out.println("=");
                        result.printMatrix();
                        break;
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }
                }
                break;
            case 2:
                while (true) {
                    try {
                        Matrix m = new Matrix(inputMatrix(1));
                        Matrix m1 = new Matrix(inputMatrix(2));
                        if (m.rows() != m1.rows() || m.cols() != m1.cols()) {
                            throw new IllegalArgumentException("Matrix dimensions must match for subtraction");
                        }
                        Matrix result = m.subtractionMatrix(m1);
                        m.printMatrix();
                        System.out.println("-");
                        m1.printMatrix();
                        System.out.println("=");
                        result.printMatrix();
                        break;
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }
                }
                break;
            case 3:
                Matrix m = new Matrix(inputMatrix(1));
                Matrix m1 = new Matrix(inputMatrix(2));
                Matrix result = m.multiplicationMatrix(m1);
                m.printMatrix();
                System.out.println("*");
                m1.printMatrix();
                System.out.println("=");
                result.printMatrix();
                break;
            case 4:
                check = false;
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
        }
    }
}


    public static int getInt()
    {
        Scanner sc = new Scanner(System.in);


        int k;
        while(true)
        {
            try
            {
                k = sc.nextInt();
                sc.nextLine();
                return k;
            }catch(InputMismatchException e)
            {
                System.out.println("Wrong format");
                sc.nextLine();

            }
        }

    }

    public static double getDouble()
    {
        Scanner sc = new Scanner(System.in);


        double k;
        while(true)
        {
            try
            {
                k = sc.nextDouble();
                sc.nextLine();
                return k;
            }catch(InputMismatchException e)
            {
                System.out.println("Wrong format");
                sc.nextLine();

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
