import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("sayı : ");
        int i = scanner.nextInt();
        int digit ;
        int total =0;
        while (i!=0){
            digit=i%10;
            total+=digit;
            i=i/10;
        }
        System.out.println(total);

    }
}
