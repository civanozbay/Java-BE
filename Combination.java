import java.util.Scanner;

public class Combination {
    public static void main(String[] args) {
        int is =0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("n : ");
        is=scanner.nextInt();
        int r = 0 ;
        System.out.print("r : ");
        r=scanner.nextInt();
        if(is<r){
            System.out.println("n r'den küçük olamaz.");
        }
        int nFac = 1;
        for (int i=1;i<=is;i++){
            nFac = nFac*i;
        }
        int tFac = 1 ;
        for (int i=1;i<=r;i++){
            tFac = tFac*i;
        }
        int diff=1;
        for (int i=1;i<=is-r;i++){
            diff = diff*i;
        }
        System.out.println("Kombinasyon : " + nFac/(tFac*diff));

    }
}
