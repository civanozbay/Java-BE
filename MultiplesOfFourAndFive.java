import java.util.Scanner;

public class MultiplesOfFourAndFive {
    public static void main(String[] args) {
        int is =0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("SAYI : ");
        is=scanner.nextInt();
        int total = 0 ;

        for (int i = 1; i <= is; i++) {
             if(i%4==0 && i%5==0){
                 System.out.print(i+" ");
             }

        }



    }
}
