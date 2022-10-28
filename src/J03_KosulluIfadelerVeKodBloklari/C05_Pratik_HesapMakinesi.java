package J03_KosulluIfadelerVeKodBloklari;

import java.util.Scanner;
/*
 hesap makinesini switch-case kullanarak yapınız.
 */
public class C05_Pratik_HesapMakinesi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen ilk sayiyi giriniz ");
        int n1 = input.nextInt();
        System.out.println("Lutfen ikinci sayiyi giriniz ");
        int n2 = input.nextInt();
        System.out.println(" Lutfen islem seciniz \nToplama->1, \nCikarma->2, \nCarpma->3,  \nBolme->4 ");
       int secim = input.nextInt();
        switch (secim) {
            case 1: System.out.println(" Toplam =  " +(n1 + n2));
                break;
            case 2:System.out.println(" Cikarma =  " +(n1 - n2));
                break;
            case 3:System.out.println(" Carpma =  " +(n1 * n2));
                break;
            case 4:
                if (n2==0) {
                    System.out.println("Bir sayi 'a bolunemez");
                } else {
                    System.out.println(" Bolme =  " + (n1 / n2));
                }
                break;

            default:System.out.println(" Hatali giris yaptiniz ");

        }





    }
}
