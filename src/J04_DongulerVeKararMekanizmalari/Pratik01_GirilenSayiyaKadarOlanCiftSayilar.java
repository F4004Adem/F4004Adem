package J04_DongulerVeKararMekanizmalari;
import java.util.Scanner;
public class Pratik01_GirilenSayiyaKadarOlanCiftSayilar {
    public static void main(String[] args) {
//va döngüler ile kullanıcının girdiği sayıya kadar çift olan sayıları bulan
// programı yazıyoruz.
  //int k;
   // Scanner scan = new Scanner(System.in);
    //  System.out.print("Please enter an integer ");
   // k = scan.nextInt();
   // for ( int i = 0; i < k; i++ ) {//1.yol 1++ yerine i+=2
     // if (k %2 ==0){// 2. yol
     //   System.out.print(i+", ");
   //   }
   // }

   //Task Java döngüler ile 0'dan girilen sayıya kadar olan sayılardan 3 ve 4'e
      // tam bölünen sayıların ortalamasını hesaplayan programı yazınız.

      int sayi;
 
    double average = 0;
    Scanner scanner = new Scanner(System.in);
      System.out.println("Please enter an Integer ; ");
      sayi = scanner.nextInt();
      for (int i = 1; i <=sayi; i++){
        int toplam=1;
        if (i%3==0 && i%4==0 ){
          System.out.println(i+", ");
        }

      }

    }
}
