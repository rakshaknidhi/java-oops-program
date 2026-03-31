import java.util.Scanner;

class UsernameValidator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter username: ");
        String username = sc.nextLine();

        // Remove spaces and convert to lowercase
        username = username.trim().toLowerCase();

        System.out.println("Cleaned Username: " + username);
    }
}