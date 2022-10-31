package J04_DongulerVeKararMekanizmalari;

import java.util.Scanner;

public class C04_ForVsWhileLoop {
    public static void main(String[] args) {

/*
For ve While Döngüsü Arasındaki Farklar
Java’da for, while ve do-while olmak üzere 3 adet döngü deyimi bulunmaktadır.
 Birbirinden farklı bu döngülerden hangisini kullanacağız ?

Hiç bir algoritmada hangi döngünün kullanılması gerektiği ile ilgili kesin bir yargı ve kural
söz konusu değildir. Bu döngüler uygun şekilde tasarlandıkları sürece aynı işi yapabilirler.
 Ama genellikle, kaç kere döneceği belli olmayan, koşulun bir girdiye göre denetlendiği
  durumlarda While ya da do-while döngüsü kullanılırken, diziler gibi, tekrar sayısı belirli
  olan durumlarda ise for döngüsü kullanılması tercih edilir. Ama yine bu yazılımcının
  kendisine bağlıdır.
 */
    // ornek; sonucu bilinmeyen islemler icin while ve do while daha avantajli
        Scanner scan = new Scanner(System.in);
        int sayi;
       for (boolean run =true; run;){
            sayi = scan.nextInt();
            if  (sayi <0){
                run = false;
            }
        }


        System.out.println("sayi Giriniz");
        sayi = scan.nextInt();
        while (sayi > 0) {

            System.out.println("sayi Giriniz");
            sayi = scan.nextInt();
        }


        do {
            System.out.println("sayi Giriniz");
            sayi = scan.nextInt();
        } while (sayi > 0);

//   baska bir ornek;    sonucu belli olan islemler icin for avantajli

        for (int i = 2; i <= 10; i++) {// iki satirda islem tamam
            System.out.print(i +", ");
        }
       //**********************************************
        int i = 1;
        while (i <= 10) { // dort satir islem ve daha karmasik
            System.out.print(i +", ");
            i++;
        }


    }
}
