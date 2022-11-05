package J04_DongulerVeKararMekanizmalari;

import java.util.Scanner;

public class Pratik05_UsluSayiHesaplayanProgram {
    public static void main(String[] args) {
/*
Java ile kullanıcının girdiği değerler ile üslü sayı hesaplayan
programı "For Döngüsü" kullanarak yapınız.
 */
                int n,k, total=1;
        Scanner scan = new Scanner(System.in);
        System.out.print("Ussu alinacak sayi giriniz  ;");
        n = scan.nextInt();
        System.out.print("Us kuvveti olacak sayi giriniz  ;");
        k = scan.nextInt();


        for (int i =1 ; i<=k ; i ++) {
            total *=n;
        }
        System.out.println("total = " + total);

    }
}
