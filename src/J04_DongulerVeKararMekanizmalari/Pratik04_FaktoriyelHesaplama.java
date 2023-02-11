package J04_DongulerVeKararMekanizmalari;


import java.util.Scanner;
//Java ile faktöriyel hesaplayan program yazıyoruz.

public class Pratik04_FaktoriyelHesaplama {
    public static void main(String[] args) {
        // n!= 1*2*3*4*....*n
    Scanner scan= new Scanner(System.in);
        System.out.print("Sayi giriniz faktoriyel icin  :");
        int num = scan.nextInt();
        int toplam =1;
        for (int  i=1 ;i <=num ;i++){
            toplam =toplam *i;
        }
        System.out.println("Faktoriyel = " + toplam);




    }

}
