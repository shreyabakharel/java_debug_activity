public class DebugActivity {

    public static int divideNumbers(int a, int b) {
        return a / b;
    }

    public static void main(String[] args) {
        int x = 5;
        int y = 1;

        System.out.println("Starting the program...");
        try {
            int result = divideNumbers(x, y);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero.");
        }
//            figure out how to "catch" the "divide by zero" error, don't just change the value on "y"
        int result = divideNumbers(x, y);
        System.out.println("Result: " + result);

        String name = "John";
        int length = name.length();
        System.out.println("Length of name: " + length);

        int[] numbers = new int[]{1, 2, 3, 4, 5};
        for (int i = 0; i < numbers.length; i++) {
//                for loop should print one number each iteration
            System.out.println(numbers[i]);
        }

        String[] fruits = {"Apple", "Banana", "Orange"};
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        System.out.println("End of the program.");
    }

}
