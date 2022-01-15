import java.util.Scanner;

public class ExponentialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("sayı : ");
        int r = scanner.nextInt();
        System.out.println("üssü : ");
        int i1 = scanner.nextInt();
        int total =  1 ;

        for (int i=1; i<=i1 ; i++){
            total = total*r;   // 1 5 ,  5 5 , 25 5,  125 5
        }
        System.out.println("sonuc : "+ total);


    }
}
