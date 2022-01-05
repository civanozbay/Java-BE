import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int mat,fizik,kimya,tarih,müzik;
        System.out.print("Mat not: ");
        mat=scanner.nextInt();
        System.out.print("Fizik not:");
        fizik=scanner.nextInt();
        System.out.print("Kimya not:");
        kimya=scanner.nextInt();
        System.out.print("Tarih not:");
        tarih=scanner.nextInt();
        System.out.print("Müzik not:");
        müzik=scanner.nextInt();
        int total = mat+fizik+kimya+tarih+müzik;
        double avg = total /5;

        System.out.println(avg >60 ? "geçti" : "kaldı");
    }
}
