import java.util.Scanner;

public class UsernamePassword {

    public static void main(String[] args) {
        String userName,password,answer,newPassword;
        Scanner scanner = new Scanner(System.in);
        System.out.print(  "Username : ");
        userName= scanner.nextLine();
        System.out.print("Passowrd:");
        password=scanner.nextLine();

        if(userName.equals("patika")&&password.equals("java123")) {
            System.out.println("giriş yaptınız.");
        }else if(!password.equals("java123")){
            System.out.print("Şifre sıfırlamak ister misin : ");
            answer=scanner.nextLine();
            switch (answer){
                case "evet":
                    System.out.print("Yeni şifre : ");
                    newPassword=scanner.nextLine();
                    while(newPassword.equals("java123")||newPassword.equals(password)){
                        System.out.println("şifre oluşturulamadı.Başka şifre deneyiniz.");
                        newPassword=scanner.nextLine();
                    }
                    System.out.println("şifre sıfırlandı");
                case "hayır":
                    System.out.println("Teşkkürler.iyi günler");
            }
            }
        }



    
}
