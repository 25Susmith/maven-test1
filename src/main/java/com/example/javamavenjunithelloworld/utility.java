public class AddTwoNumbers {

    public static int susmith(int num1, int num2) {
        return num1 + num2;
    }

    public static void main(String[] args) {
        int number1 = 5;
        int number2 = 7;

        int sum = susmith(number1, number2);

        System.out.println("Sum of " + number1 + " and " + number2 + " is: " + sum);
    }
}
