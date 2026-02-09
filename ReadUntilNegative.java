import java.util.Scanner;

public class ReadUntilNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;

        System.out.println("Enter numbers (negative number to stop):");

        while (true) {
            number = sc.nextInt();

            if (number < 0) {
                System.out.println("Negative number entered. Program stopped.");
                break;
            }

            System.out.println("You entered: " + number);
        }

        sc.close();
    }
}
