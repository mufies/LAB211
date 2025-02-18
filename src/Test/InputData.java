package Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

public class InputData {
    Scanner sc = new Scanner(System.in);

    public int getInt()
    {


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

    public double getDouble()
    {


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
    public String getString()
    {
       String s = sc.nextLine();
       while (checkBlank(s)) {
           System.out.println("Input is blank");
           s = sc.nextLine();
       }
       return s;
    }
    public String getStringButContainBlank()
    {
        String s = sc.nextLine();
        return s;
    }

    public char getChar()
    {
        char c = (char) sc.nextShort();
        return c;
//        while(true)
//        {
//            String s = sc.nextLine();
//            if(!checkBlank(s) && s.length() == 1)
//            {
//                c = s.charAt(0);
//                return c;
//            }
//            else return ' ';
//        }
    }

    public String getStringNumber()
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        while(true)
        {
            if(s.matches("[0-9]+"))
            {
                return s;
            }
            else
            {
                System.out.println("Wrong format");
                s = sc.nextLine();
            }
        }
    }

    public boolean checkBlank(String s)
    {
        return s.trim().isEmpty();
    }
    public String getDate()
    {
        String date = sc.nextLine();
        while(true) {
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            sdf.setLenient(false);
            try {
                sdf.parse(date);
                return date;
            } catch (ParseException e) {
                System.out.println("Wrong format");
                date = sc.nextLine();
            }
        }

    }
}
