import java.util.Scanner;

class StudentNameComparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first name: ");
        String name1 = sc.nextLine();

        System.out.print("Enter second name: ");
        String name2 = sc.nextLine();

        // Case-sensitive
        if (name1.equals(name2)) {
            System.out.println("Names are same (Case-Sensitive)");
        } else {
            System.out.println("Names are different (Case-Sensitive)");
        }

        // Case-insensitive
        if (name1.equalsIgnoreCase(name2)) {
            System.out.println("Names are same (Case-Insensitive)");
        } else {
            System.out.println("Names are different (Case-Insensitive)");
        }
    }
}