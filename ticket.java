import java.util.Scanner;
public class ticket {

    public static void main(String[] args) {
	// Kullanıcıdan alınan değerler geçerli (mesafe ve yaş değerleri pozitif sayı, yolculuk tipi ise 1 veya 2) olmalıdır. Aksi takdirde kullanıcıya "Hatalı Veri Girdiniz !" şeklinde bir uyarı verilmelidir.
        //Kişi 12 yaşından küçükse bilet fiyatı üzerinden %50 indirim uygulanır.
        //Kişi 12-24 yaşları arasında ise bilet fiyatı üzerinden %10 indirim uygulanır.
        //Kişi 65 yaşından büyük ise bilet fiyatı üzerinden %30 indirim uygulanır.
        //Kişi "Yolculuk Tipini" gidiş dönüş seçmiş ise bilet fiyatı üzerinden %20 indirim uygulanır.
        int age,tripType,distance;
        double totalPrice,totalPriceAfterDiscount,pricePerKm=0.10;
        Scanner inp =new Scanner(System.in);

        System.out.print("Age : ");
        age=inp.nextInt();

        System.out.print("Trip Type 1-One direction 2-Double direction : ");
        tripType=inp.nextInt();

        System.out.print("Distance :");
        distance=inp.nextInt();

        if (age<0 || distance<0 || (tripType!=1 && tripType!=2)){
            System.out.println("Invalid Input");
        }else {
             totalPrice=distance*pricePerKm;
             if (age<12){
                if (tripType==2){
                    totalPriceAfterDiscount=2*((totalPrice-(totalPrice*0.5))*0.8);
                    System.out.println(totalPriceAfterDiscount);
                }else{
                    totalPriceAfterDiscount=totalPrice- totalPrice*0.5;
                    System.out.println(totalPriceAfterDiscount);
                }
             }
             else if(age<24){
                 if(tripType==2){
                     totalPriceAfterDiscount = 2*((totalPrice - (totalPrice*0.1))*0.8);
                     System.out.println(totalPriceAfterDiscount);
                 }
                 else{
                     totalPriceAfterDiscount=totalPrice- totalPrice*0.1;
                     System.out.println(totalPriceAfterDiscount);
                 }
             }
             else if(age>65){
                 if(tripType==2){
                     totalPriceAfterDiscount = 2*((totalPrice - (totalPrice*0.3))*0.8);
                     System.out.println(totalPriceAfterDiscount);
                 }
                 else{
                     totalPriceAfterDiscount=totalPrice- totalPrice*0.3;
                     System.out.println(totalPriceAfterDiscount);
                 }
             }
             else {
                 if(tripType==2){
                     totalPriceAfterDiscount = 2*(totalPrice*0.8);
                     System.out.println(totalPriceAfterDiscount);
                 }
                 else{
                     totalPriceAfterDiscount=totalPrice;
                     System.out.println(totalPriceAfterDiscount);
                 }
             }
        }

    }
}
