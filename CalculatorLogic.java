public class CalculatorLogic {
    private double number1;
    private double number2;
    private String operator;

    public void setNumber1(double number1) {
        this.number1 = number1;
    }

    public void setNumber2(double number2) {
        this.number2 = number2;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public double calculate() {
        double result = 0;
        switch (operator) {
            case "+":
                result = number1 + number2;
                break;
            case "-":
                result = number1 - number2;
                break;
            case "*":
                result = number1 * number2;
                break;
            case "/":
                if (number2 != 0) {
                    result = number1 / number2;
                } else {
                    throw new ArithmeticException("Division by zero");
                }
                break;
        }
        return result;
    }

}
