import java.util.*;

class StudentInputSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter age: ");
            int age = sc.nextInt();

            if (age <= 0) {
                throw new ArithmeticException("Age must be greater than 0");
            }

            System.out.println("Student age is: " + age);

        } catch (InputMismatchException e) {
            System.out.println("Please enter a valid integer");
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}