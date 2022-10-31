package J04_DongulerVeKararMekanizmalari;

import java.util.Scanner;

public class C02_DoWhileLoop {
    public static void main(String[] args) {
/*
Do-While Döngüsü
Do-while döngüsünün çalışma mantığı while döngüsü ile aynıdır , fakat while döngüsünde parantez içerisindeki koşul
 sağlandığı sürece kod bloğu çalışacaktır. Ama Do-while döngüsünde durum false olsa bile döngü en az bir
 kere çalışacaktır. Bu tür durumlar için Do-while kullanılır.

Java Do-While döngüsü söz dizimi şu şekildedir ;

do {
kodlar//
} while (kosul);
Gördüğünüz gibi, koşul döngünün sonunda test edilir. Bu durumda, koşul false olsa bile döngü en az bir kere
çalıştırılmış olur. Bu şekilde döngü yazmak istediğiniz durumlarla karşılaşacaksınız. Aşağıdaki örneği inceleyelim:
 */
     //  int year = 2020;
     //  do
     //  {
     //      System.out.println("Döngü işletiliyor..");
     //      year++;
     //  } while (year < 2020);


        Scanner scan = new Scanner(System.in);
         int pass = 123;
         boolean askpass = true;// bu deger dogru oldugu muddetce ssormaya devem edecek

         do {
             System.out.print("Lutfen pasword giriniz  = " );
             pass = scan.nextInt();
              if (pass == 123){
                  System.out.println("Password Dogru");
                  askpass = false;// dogru cevabi alinca sistemi sonlandiracak
              }else {
                  System.out.println("Password yanlis");
              }



         } while (askpass);



    }
}
