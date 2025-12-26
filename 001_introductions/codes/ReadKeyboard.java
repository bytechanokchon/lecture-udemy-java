import java.util.Scanner;

public class ReadKeyboard {
    public static void main(String[] args) {
        int x, y;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 2 number for sum: ");
        x = sc.nextInt();
        y = sc.nextInt();

        System.out.println("Result of X + Y = " + (x + y));

        sc.close();
    }
}
