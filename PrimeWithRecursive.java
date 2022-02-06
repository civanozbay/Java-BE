import java.util.Scanner;

public class PrimeWithRecursive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("sayı : ");
        int num = scanner.nextInt();
        boolean b = primeNumber(num, num / 2);
        if(b){
            System.out.println("asal değil");
        }else {
            System.out.println("asal sayı");
        }


    }
    static boolean primeNumber(int num,int a){

        if(a==1){
            return false;
        }else if (num%a==0){
            return true;
        }
        return primeNumber(num,a-1);

    }


}
