import java.util.Scanner;

public class SumOfMultiplesOfFour {
    public static void main(String[] args) {
        int is =0;
        Scanner scanner = new Scanner(System.in);

        int total = 0 ;

        do{
            System.out.print("Sayı : ");
            is=scanner.nextInt();
            if(is%4==0){
                total+=is;
            }
        } while(is%2==0);

        System.out.println(total);

    }
}
