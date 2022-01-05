import java.util.Scanner;

public class VucutKutleEndeks {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("boy:");
        double i = scanner.nextDouble();
        System.out.print("kilo:");
        int i1 = scanner.nextInt();

        double endeks = i1/(i*i);
        System.out.println("endeksiniz : "+endeks);






    }
}
