package J03_KosulluIfadelerVeKodBloklari;

import java.util.Scanner;

public class C06_Pratik_KullaniciGirisi {
    public static void main(String[] args) {

        String userName, password;
        Scanner scan = new Scanner(System.in);
        System.out.print("Kullanici Adiniz  :  ");
        userName = scan.nextLine();
        System.out.print("Sifreniz  :  ");
        password = scan.nextLine();
        if (userName.equals("patika") && password.equals("java123")){
            System.out.println("Basari ile giris yaptiniz. Tebrikler!!! ");
        }else {
            System.out.println("Kullanici adiniz yada Sifreniz eslesmedi. Tekrar Deneyiniz!!!");
        }

    }
}
