import java.util.Scanner;

public class Recursive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("sayı : ");
        int num = scanner.nextInt();
        System.out.println("üs :");
        int us = scanner.nextInt();
        System.out.println(usRec(num,us));
    }

    static int usRec(int sayı,int us){
        if(us==1){
            return sayı;
        }else if(us==0){
            return 1;
        }
        int result =sayı * usRec(sayı,us-1);
        return result;


    }

}
