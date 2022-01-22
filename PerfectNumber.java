import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("sayı : ");
        int num = scanner.nextInt();
        int i1 = num / 2;
        int total =0;
        for (int i = i1;i>0;i-- ){
            if(num%i==0){
                total +=i;
            }
        }
        if(total==num){
            System.out.println(num+" is a perfect number");
        }else{
            System.out.println("not");
        }




    }
}
