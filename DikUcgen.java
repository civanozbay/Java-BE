
public class DikUcgen {

    public static void main(String[] args) {

                int a,b;
        double c;
        Scanner girdi = new Scanner(System.in);

        System.out.print("1. Kenarı Giriniz : ");
        a= girdi.nextInt();

        System.out.print("2. Kenarı Giriniz : ");
        b= girdi.nextInt();

        c=Math.sqrt((a*a) + (b*b));
        System.out.println("Hipotenüs : " + c);

        double cevre = (a + b + c) /  2 , alan ;
        alan = Math.sqrt( cevre * (cevre - a) * (cevre - b) * (cevre - c ) );
        System.out.println("Alan : " + alan);

    }
}
