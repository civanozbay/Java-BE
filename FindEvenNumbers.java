import java.util.Scanner;

public class FindEvenNumbers {
    public static void main(String[] args) {
        int is ;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Sayı : ");
        is=scanner.nextInt();
        int count = 0 ;
        int ar = 0;
        for(int i=1;i<=is;i++){
            if(i%3==0 && i%4==0){
                ar += i ;
                count++;
            }
        }
        System.out.println("Ortalaması : " + ar/count);



    }
}
