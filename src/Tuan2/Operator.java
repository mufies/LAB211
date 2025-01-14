package Tuan2;

public class Operator {
    private char operator;

    public Operator(char operator) {
        this.operator = operator;
    }

    public char getOperator() {
        return operator;
    }

    public void setOperator(char operator) {
        this.operator = operator;
    }

    public static Operator valueOf(String operator) {
        return new Operator(operator.charAt(0));
    }
}
