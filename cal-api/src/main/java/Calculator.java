/**
 *
 */
public class Calculator {
    /**
     * @param number1
     * @param number2
     */
    final void addition(final int number1, final int number2) {
        int result;
        result = number1 + number2;
        System.out.println("Addition of two numbers is=" + result);
    }

    /**
     * @param number1
     * @param number2
     */
    final void subtraction(final int number1, final int number2) {
        int result;
        result = number1 - number2;
        System.out.println("Subtraction of two numbers is=" + result);
    }

    /**
     * @param number1
     * @param number2
     */
    final void multiplication(final int number1, final int number2) {
        int result;
        result = number1 * number2;
        System.out.println("Multiplication of two numbers is=" + result);
    }

    /**
     * @param number1
     * @param number2
     */
    final void division(final double number1, final double number2) {
        double result;
        result = number1 / number2;
        System.out.println("division of two numbers is=" + result);
    }

}

