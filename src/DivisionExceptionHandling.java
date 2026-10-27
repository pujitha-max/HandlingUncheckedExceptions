
import java.util.Scanner;

public class DivisionExceptionHandling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter the first number: ");
            int num1 = Integer.parseInt(sc.nextLine());

            System.out.print("Enter the second number: ");
            int num2 = Integer.parseInt(sc.nextLine());

            int result = num1 / num2;

            System.out.println("Result: " + result);

        } catch (ArithmeticException e) {
            System.out.println(
                    "Error: Cannot divide by zero."
            );

        } catch (NumberFormatException e) {
            System.out.println(
                    "Error: Please enter valid whole numbers."
            );

        } finally {
            sc.close();
        }
    }
}
