package J03_KosulluIfadelerVeKodBloklari;

import java.util.Scanner;
/*
Eğer şifre yanlış ise kullanıcıya şifresini sıfırlayıp sıfırlamayacağını sorun,
eğer kullanıcı sıfırlamak isterse yeni girdiği şifrenin hatalı girdiği
ve unuttuğu şifre ile aynı olmaması gerektiğini kontrol edip , şifreler aynı ise
ekrana "Şifre oluşturulamadı, lütfen başka şifre giriniz." sorun yoksa "Şifre oluşturuldu"
yazan programı yazınız.
 */
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
