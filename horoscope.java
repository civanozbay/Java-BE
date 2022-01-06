import java.util.Scanner;
public class horoscope {

    public static void main(String[] args) {
        //Koç Burcu : 21 Mart - 20 Nisan
        //Boğa Burcu : 21 Nisan - 21 Mayıs
        //İkizler Burcu : 22 Mayıs - 22 Haziran
        //Yengeç Burcu : 23 Haziran - 22 Temmuz
        //Aslan Burcu : 23 Temmuz - 22 Ağustos
        //Başak Burcu : 23 Ağustos - 22 Eylül
        //Terazi Burcu : 23 Eylül - 22 Ekim
        //Akrep Burcu : 23 Ekim - 21 Kasım
        //Yay Burcu : 22 Kasım - 21 Aralık
        //Oğlak Burcu : 22 Aralık - 21 Ocak
        //Kova Burcu : 22 Ocak - 19 Şubat
        //Balık Burcu : 20 Şubat - 20 Mart

        int month, day;
        Scanner inp = new Scanner(System.in);

        System.out.print("Which month were you in born? :");
        month = inp.nextInt();

        System.out.print("Which day were you in born? :");
        day = inp.nextInt();
        if (month == 1) {
            if (day >= 22 && day<=31) {
                System.out.println("Aquarius Horoscope.");
            } else {
                System.out.println("Capricorn Horoscope.");
            }
        } else if (month == 2) {
            if (day >= 20 && day<=31) {
                System.out.println("Fish Horoscope.");
            } else {
                System.out.println("Copricorn Horoscope.");
            }
        } else if (month == 3) {
            if (day >= 21 && day<=31) {
                System.out.println("Aries Horoscope.");
            } else {
                System.out.println("Fish Horoscope");
            }
        } else if (month == 4) {
            if (day >= 21 && day<=31) {
                System.out.println("Taurus Horoscope.");
            } else {
                System.out.println("Aries Horoscope");
            }
        } else if (month == 5) {
            if (day >= 22 && day<=31) {
                System.out.println("Gemini Horoscope.");
            } else {
                System.out.println("Taurus Horoscope");
            }
        } else if (month == 6) {
            if (day >= 23 && day<=31) {
                System.out.println("Cancer Horoscope.");
            } else {
                System.out.println("Gemini Horoscope");
            }
        } else if (month == 7) {
            if (day >= 23 && day<=31) {
                System.out.println("Leo Horoscope.");
            } else {
                System.out.println("Cancer Horoscope");
            }
        } else if (month == 8) {
            if (day >= 23 && day<=31) {
                System.out.println("Virgo Horoscope.");
            } else {
                System.out.println("Leo Horoscope");
            }
        } else if (month == 9) {
            if (day >= 23 && day<=31) {
                System.out.println("Libra Horoscope.");
            } else {
                System.out.println("Virgo Horoscope");
            }
        } else if (month == 10) {
            if (day >= 23 && day<=31) {
                System.out.println("Scorpio Horoscope.");
            } else {
                System.out.println("Libra Horoscope");
            }
        } else if (month == 11) {
            if (day >= 22 && day<=31) {
                System.out.println("Sagittarius Horoscope.");
            } else {
                System.out.println("Scorpio Horoscope");
            }
        } else if (month == 12) {
            if (day >= 22 && day<=31) {
                System.out.println("Copicorn Horoscope.");
            } else {
                System.out.println("Sagittarius Horoscope.");
            }
        }
    }
}
