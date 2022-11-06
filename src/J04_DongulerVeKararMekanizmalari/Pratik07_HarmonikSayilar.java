package J04_DongulerVeKararMekanizmalari;

import java.util.Scanner;

public class Pratik07_HarmonikSayilar {
    public static void main(String[] args) {
/*
 Java ile girilen sayının harmonik serisini bulan program yazacağız.

Harmonik Seri Formülü :
 */
        Scanner input = new Scanner(System.in);
        int sayi;
        double harm = 0, unit = 0;
        System.out.println("Sayınızı giriniz :");
        sayi = input.nextInt();
        for (double i = 1; i <=sayi; i++ ) {
            unit = (1.0 / i);
            harm += unit;
        }
        System.out.println(harm);



    }
}
