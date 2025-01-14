package Test;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TestTuan1 {
    Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
// Bai 1
//      Counting c = new Counting("Hello the world");
//        System.out.println(c.wordCount());
//        System.out.println(c.charCount());


//  bai 2
//        System.out.println("Enter number of array ");
//        int x = getInt();
//        System.out.println("Enter search value");
//        int y = getInt();
//        LinearSearch ls = new LinearSearch(x);
//        ls.addValue(x, y);





//       Bai 3
//       int in = getMenuChoice();
//       int out = getMenuChoice();
//       String s = getNumber(in);
//       ChangeBaseNumber cbn = new ChangeBaseNumber(s);
//       System.out.println(cbn.generate(in, out));



// Bai 4
//        float a,b,c;
//        while(true)
//        {
//            System.out.println("========= Equation Program =========");
//            System.out.println("1. Calculate Superlative Equation");
//            System.out.println("2. Calculate Quadratic Equation");
//            System.out.println("3. Exit");
//            System.out.println("");
//            System.out.println("Please choice one option:");
//            int x = getInt();
//            switch (x)
//            {
//                case 1:
//                    System.out.print("Enter A: ");
//                   a = getFloat();
//                    System.out.print("Enter B: ");
//                   b = getFloat();
//                    SolvingEquation se = new SolvingEquation(a,b);
//                    List<Float> solution = se.calculateEquation();
//
//                    if (solution == null) {
//                        System.out.println("No solution.");
//                    } else if (solution.isEmpty()) {
//                        System.out.println("Infinitely many solutions.");
//                    } else {
//                        System.out.println("Solution: x = " + solution.get(0));
//                    }
//                    System.out.println("");
//                    System.out.print("Number is odd: ");
//                    if(se.oddNum(a))
//                        System.out.println(a+", ");
//                    if(se.oddNum(b))
//                        System.out.println(b+", ");
//                    System.out.println("");
//                    System.out.print("Number is Even: ");
//                    if(se.evenNum(a))
//                        System.out.println(a+", ");
//                    if(se.evenNum(b))
//                        System.out.println(b+", ");
//                    System.out.println("");
//                    System.out.print("Number is Perfect Square: ");
//                    if(se.perfectSquares(a))
//                        System.out.println(a+", ");
//                    if(se.perfectSquares(b))
//                        System.out.println(b+", ");
//                    System.out.println("");
//                    break;
//                case 2:
//                    System.out.print("Enter A: ");
//                     a = getFloat();
//                    System.out.print("Enter B: ");
//                     b = getFloat();
//                    System.out.print("Enter C: ");
//                     c = getFloat();
//                    SolvingEquation se1 = new SolvingEquation(a, b, c);
//
//                    if (a == 0 && b == 0 && c == 0) {
//                        System.out.println("Infinitely many solutions.");
//                    } else {
//                        List<Float> solution1 = se1.calculateQuadraticEquation();
//
//                        if (solution1 == null) {
//                            System.out.println("No solution.");
//                        } else if (solution1.isEmpty()) {
//                            System.out.println("No solution.");
//                        } else if (solution1.size() == 1) {
//                            System.out.println("Solution: x = " + solution1.get(0));
//                        } else if (solution1.size() == 2) {
//                            System.out.println("Solutions: x1 = " + solution1.get(0) + ", x2 = " + solution1.get(1));
//                        } else {
//                            System.out.println("Unexpected case.");
//                        }
//                    }
//
//
//
//
//                    System.out.println("");
//                    System.out.print("Number is odd: ");
//                    if(se1.oddNum(a))
//                        System.out.println(a+", ");
//                    if(se1.oddNum(b))
//                        System.out.println(b+", ");
//                    if(se1.oddNum(c))
//                        System.out.println(c+", ");
//                    System.out.println("");
//                    System.out.print("Number is Even: ");
//                    if(se1.evenNum(a))
//                        System.out.println(a+", ");
//                    if(se1.evenNum(b))
//                        System.out.println(b+", ");
//                    if(se1.evenNum(c))
//                        System.out.println(c+", ");
//                    System.out.println("");
//                    System.out.print("Number is Perfect Square: ");
//                    if(se1.perfectSquares(a))
//                        System.out.println(a+", ");
//                    if(se1.perfectSquares(b))
//                        System.out.println(b+", ");
//                    if(se1.perfectSquares(c))
//                        System.out.println(c+", ");
//                    System.out.println("");
//                    break;
//
//                case 3:
//                    System.out.println("Exit...");
//                    return;
//
//
//            }
//        }





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
    public static float getFloat()
    {
        Scanner sc = new Scanner(System.in);


        float k;
        while(true)
        {
            try
            {
                k = sc.nextFloat();
                sc.nextLine();
                return k;
            }catch(InputMismatchException e)
            {
                System.out.println("Wrong format");
                sc.nextLine();
            }
        }

    }
    public static int getMenuChoice() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Choose the base number:");
            System.out.println("1. Binary");
            System.out.println("2. Decimal");
            System.out.println("3. Hexadecimal");

            try {
                int x = sc.nextInt();
                sc.nextLine();
                if (x < 1 || x > 3) {
                    System.out.println("Choose again");
                } else {
                    return x;
                }
            } catch (InputMismatchException e) {
                System.out.println("Wrong input format");
                sc.nextLine();
            }
        }
    }

    public static String getNumber(int base) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Input number you want to change:");
        while (true) {
            String s = sc.nextLine();
            switch (base) {
                case 1:
                    if (!s.matches("[01]+")) {
                        System.out.println("Wrong format for Binary. Please enter only 0s and 1s.");
                    } else {
                        return s;
                    }
                    break;
                case 2:
                    if (s.matches(".*[A-Za-z].*")) {
                        System.out.println("Wrong format for Decimal. Please enter only numbers.");
                    } else {
                        return s;
                    }
                    break;
                case 3:
                    if (!s.matches("[0-9A-Fa-f]+")) {
                        System.out.println("Wrong format for Hexadecimal. Please enter valid hex digits (0-9, A-F).");
                    } else {
                        return s;
                    }
                    break;
            }
        }
    }
}
