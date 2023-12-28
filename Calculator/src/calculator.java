public class calculator {
    private static final String ERROR_DIVIDE_BY_ZERO = "Cannot divide by zero";

    public static int add(int num1, int num2) {
        return num1 + num2;
    }

    public static int subtract(int num1, int num2) {
        return num1 - num2;
    }

    public static int multiply(int num1, int num2) {
        return num1 * num2;
    }

    public static double divide(int num1, int num2) {
        if (num2 != 0) {
            return (double) num1 / num2;
        } else {
            throw new ArithmeticException(ERROR_DIVIDE_BY_ZERO);
        }
    }

    public static void performOperation(char operator, int num1, int num2) {
        switch (operator) {
            case '+':
                System.out.println(num1 + " + " + num2 + " = " + add(num1, num2));
                break;
            case '-':
                System.out.println(num1 + " - " + num2 + " = " + subtract(num1, num2));
                break;
            case '*':
                System.out.println(num1 + " * " + num2 + " = " + multiply(num1, num2));
                break;
            case '/':
                try {
                    System.out.println(num1 + " / " + num2 + " = " + divide(num1, num2));
                } catch (ArithmeticException e) {
                    System.out.println(e.getMessage());
                }
                break;
            default:
                System.out.println("Invalid operator");
        }
    }
}

