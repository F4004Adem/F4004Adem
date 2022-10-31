package J04_DongulerVeKararMekanizmalari;

import java.util.Scanner;

public class Pratik02_GirilenSayiyaKadarOlanTekSayilarinToplami {
    public static void main(String[] args) {
       // Java döngüler ile negatif bir değer girilene kadar kullanıcıdan girişleri kabul eden ve
        // girilen değerlerden tek sayıları toplayıp ekrana basan programı yazıyoruz.
     /*   int sayi,total=0, adet=0;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Please enter an Integer ; ");
            sayi = scanner.nextInt();
            if (sayi%2 == 1){
               adet ++;
                total +=sayi;
            }
        } while (sayi>0);
        System.out.println("adet = " + adet);
        System.out.println("total = " + total);  */

        //Ödev
        //Java döngüler ile tek bir sayı girilene kadar kullanıcıdan
        // girişleri kabul eden ve girilen değerlerden
        // çift ve 4'ün katları olan sayıları toplayıp
        // ekrana basan programı yazıyoruz.

        int n,toplam=0, count=0;
        Scanner scan = new Scanner(System.in);
        do {
            System.out.print("Please enter an Integer ; ");
           n = scan.nextInt();
            if (n%4 == 0){
                count ++;
                toplam +=n;
            }
        } while (n%2!=1);
        System.out.println("adet = " + count);
        System.out.println("total = " + toplam);






    }
}
