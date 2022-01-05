import java.util.Scanner;

public class KDV {

    public static void main(String[] args) {
        double kdv,amountOfKdv,totalWithKDV;
        int amount;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Amount: ");
        amount=scanner.nextInt();

        if(amount>0 && amount<1000){
            kdv =0.18;
             amountOfKdv = amount*kdv;
             totalWithKDV=amount+amountOfKdv;
            System.out.println("KDV'li fiyat: "+totalWithKDV);
            System.out.println("KDV tutarı "+amountOfKdv);
        }else if(amount>1000){
            kdv=0.08;
             amountOfKdv = amount*kdv;
            totalWithKDV=amount+amountOfKdv;
            System.out.println("KDV'li fiyat: "+totalWithKDV);
            System.out.println("KDV tutarı "+amountOfKdv);
        }

    }
}
