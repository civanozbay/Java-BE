import java.util.Scanner;

public class calculator {

    public static void main(String[] args) {
        int a, b, choose;

        Scanner scanner = new Scanner(System.in);
        System.out.print("ilk sayı :");
        a = scanner.nextInt();
        System.out.print("ikinci sayı :");
        b = scanner.nextInt();

        System.out.println("1-bölme\n2-çarpma\n3-toplama\n4-çıkarma");
        System.out.print("Seçiminiz :");
        choose = scanner.nextInt();

        switch (choose) {
            case 1:
                if(b!=0){
                    System.out.println(a / b);
                }else{
                    System.out.println("payda 0 olamaz !!!");
                }
                break;
            case 2:
                System.out.println(a * b);
                break;
            case 3:
                System.out.println(a+b);
                break;
            case 4:
                System.out.println(a-b);
                break;
            default:
                System.out.println("yanlış seçim yaptınız.");

        }
    }
}
