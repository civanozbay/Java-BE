import java.util.Scanner;

public class ArtikYil {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print( "Yıl giriniz: ");
        int i = scanner.nextInt();
        if(i%4==0){
            System.out.println(i+ " artık bir yıldır");
        }else{
            System.out.println(i+" artık bir yıl değildir.");
        }
    }
}
