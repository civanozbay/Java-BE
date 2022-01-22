import java.util.Scanner;

public class minMax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("sayı : ");
        int num = scanner.nextInt();
        int dummy ;
        int biggest =0;
        int lowest =0;
        int temp =0;
        while (num>0){
            System.out.print(num+". sayı: ");
            dummy=scanner.nextInt();
            temp++;
            if (temp==1){
                biggest=dummy;
                lowest=dummy;
            }


            if(dummy>biggest){
                biggest=dummy;
                temp=biggest;
            }else if(dummy<lowest){
                lowest=dummy;
            }

            num--;
        } 
        System.out.println(lowest);
        System.out.println(biggest);



    }
}
