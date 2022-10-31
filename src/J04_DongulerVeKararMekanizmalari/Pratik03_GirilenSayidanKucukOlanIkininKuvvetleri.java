package J04_DongulerVeKararMekanizmalari;

import java.util.Scanner;

public class Pratik03_GirilenSayidanKucukOlanIkininKuvvetleri {
    public static void main(String[] args) {
        //Java döngüler ile girilen sayıya kadar olan
        // 2'nin kuvvetlerini ekrana yazdıran
        // programı yazıyoruz.
        int n;
            Scanner scan = new Scanner(System.in);
            System.out.print("Please enter an Integer ; ");
            n = scan.nextInt();
            for(int i=1 ;i<=n ;i*=2){// diger sayilarin kuvveti icin
                // i*=2 ifadedeki 2 rakami degistirilip istenen sayi konulur
                System.out.print(i+ ", ");
            }







    }
}
