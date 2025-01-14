package Tuan2;


public class Calculate {
    public double memory;
    public Calculate()
    {
        this.memory = 0;
    }

    public void BMICalc(double a,double b)
    {
        double bmi = a/(b*b);
        System.out.println("BMI: "+bmi);
        if (bmi < 18.5) {
            System.out.println("Underweight");
        } else if (bmi >= 18.5 && bmi < 24.9) {
            System.out.println("STANDARD");
        } else if (bmi >= 25 && bmi < 29.9) {
            System.out.println("Overweight");
        } else {
            System.out.println("Obesity");
        }
    }

    public double normalCalc(double a, double b, Operator operator)
    {
        double result = 0;
        switch (operator.getOperator()) {
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '*':
                result = a * b;
                break;
            case '/':
                if (b == 0) {
                    System.out.println("Cannot divide by zero");
                    return 0;
                }
                result = a / b;
                break;
            case '^':
                result = Math.pow(a, b);
                break;
            default:
                System.out.println("Invalid operator. Please try again.");
                return 0;
        }
        return result;
    }


}

