public class CalculatorTest {

    public static void test_Calculate() {
        String expression = "10+5*2";
        String expectedResult = "20.0";

        String actualResult = Calculator.Run(expression);

        if (expectedResult.equals(actualResult)) {
            System.out.println("Test succeeded.");
        } else {
            System.out.println("Test failed for expression: " + expression);
            System.out.println("Expected: " + expectedResult + ", but got: " + actualResult);
        }
    }

    public static void main(String[] args) {
        test_Calculate();
    }
}