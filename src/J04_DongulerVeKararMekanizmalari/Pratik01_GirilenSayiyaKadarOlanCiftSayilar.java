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

         int sayi,total=0, adet=0;
         double average ;
    Scanner scanner = new Scanner(System.in);
      System.out.println("Please enter an Integer ; ");
      sayi = scanner.nextInt();
      for (int i = 1; i <=sayi; i++){
        if (i%3==0 && i%4==0 ){
            System.out.print(  i+ ", ");
            total +=i;
            adet ++;

        }

      }
        System.out.println("total : "+total);
         average = total/adet ;
        System.out.println("adet = " + adet);
        System.out.println("average = " + average);


    }
}
