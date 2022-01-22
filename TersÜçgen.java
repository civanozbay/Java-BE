import java.util.Scanner;

public class TersÜçgen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("sayı : ");
        int num = scanner.nextInt();

        for (int i = num - 1; i > 0; i--) {
            for (int j = num; j > i; j--)
                System.out.print(" ");
            for (int k = 1; k <= (2 * (i - 1)) + 1; k++)
                System.out.print("*");
            System.out.println();


        }
    }}
