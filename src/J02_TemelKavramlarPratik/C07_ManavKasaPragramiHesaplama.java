package J02_TemelKavramlarPratik;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class C07_ManavKasaPragramiHesaplama {
    public static void main(String[] args) {
        ArrayList<String> manav = new ArrayList<>(Arrays.asList(
                "Elma (0)","Armut(1)","Çilek(2)","Erik(3)","Patlıcan(4)"));
        ArrayList<Integer>fiyat= new ArrayList<>(Arrays.asList(15,20,30,60,15));
        int toplam=0;
        while (true){
            Scanner sc = new Scanner(System.in);
            System.out.println(
              "\"Elma (0)\",\"Armut(1)\",\"Çilek(2)\",\"Erik(3)\",\"Patlıcan(4)\"lütfen ürün seçiniz");
            int ürün=sc.nextInt();
            System.out.println("kaç kg istersiniz");
            double kg=sc.nextDouble();
            toplam+=fiyat.get(ürün)*kg;
            System.out.println(
              "Alışverişe devam etmek istiyorsanız (1) çıkış yapmak istiyorsanız(0) giriniz");
            int karar = sc.nextInt();
            if (karar==0)
                break;
        }System.out.println("toplam ödemeniz gereken tutar"+toplam);
    }






}

