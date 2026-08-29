public class Main {

    /**
     * Description: Prints numbers from 10 down to 1 in descending order.
     * @param none
     * @return void
     */
    public static void printNumbersDescending() {
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }
    }

    /**
     * Description: Prints numbers from 1 to 10 and specifies whether each number is Even or Odd.
     * @param none
     * @return void
     */
    public static void printEvenOrOdd() {
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " -> Even");
            } else {
                System.out.println(i + " -> Odd");
            }
        }
    }

    /**
     * Description: Checks if the passed number is Positive, Negative, or Zero.
     * @param number int value to check
     * @return String ("Positive", "Negative", or "Zero")
     */
    public static String checkNumberType(int number) {
        if (number > 0) {
            return "Positive";
        } else if (number < 0) {
            return "Negative";
        } else {
            return "Zero";
        }
    }

    /**
     * Description: Calculates and returns the sum of two integer numbers.
     * @param number1 int first number
     * @param number2 int second number
     * @return int sum of number1 and number2
     */
    public static int calculateSum(int number1, int number2) {
        return number1 + number2;
    }

    public static void main(String[] args) {
        // Step 1: Test Method 1
        System.out.println("--- Testing Method 1 ---");
        printNumbersDescending();

        // Step 2: Test Method 2
        System.out.println("--- Testing Method 2 ---");
        printEvenOrOdd();

        // Step 3: Test Method 3
        System.out.println("--- Testing Method 3 ---");
        int testNumber = 5;
        String resultType = checkNumberType(testNumber);
        System.out.println(resultType);

        // Step 4: Test Method 4
        System.out.println("--- Testing Method 4 ---");
        int num1 = 10;
        int num2 = 20;
        int sumResult = calculateSum(num1, num2);
        System.out.println(sumResult);
    }
}
