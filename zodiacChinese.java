import java.util.Scanner;
public class zodiacChinese {

    public static void main(String[] args) {
        int birthYear, mod = 12;
        Scanner inp = new Scanner(System.in);

        System.out.print("Enter your year of birth :");
        birthYear = inp.nextInt();
        if (birthYear % mod == 0) {
            System.out.println("Monkey");
        } else if (birthYear % mod == 1) {
            System.out.println("Cockerel");
        } else if (birthYear % mod == 2) {
            System.out.println("Dog");
        } else if (birthYear % mod == 3) {
            System.out.println("Pork");
        } else if (birthYear % mod == 4) {
            System.out.println("Mouse");
        } else if (birthYear % mod == 5) {
            System.out.println("Pig");
        } else if (birthYear % mod == 6) {
            System.out.println("Tiger");
        } else if (birthYear % mod == 7) {
            System.out.println("Rabbit");
        } else if (birthYear % mod == 8) {
            System.out.println("dragon");
        } else if (birthYear % mod == 9) {
            System.out.println("Snake");
        } else if (birthYear % mod == 10) {
            System.out.println("Horse");
        } else if (birthYear % mod == 11) {
            System.out.println("Sheep");
        }
    }
}
