package J03_KosulluIfadelerVeKodBloklari;

import java.util.Scanner;

public class C07_Pratik_SinifiGecmeDurumu {
    public static void main(String[] args) {
       int maths , physics, chemistry, turkish, music;
        Scanner scan = new Scanner(System.in);
        System.out.print("Matematik Notnuz : ");
        maths = scan.nextInt();
        System.out.print("Fizik Notnuz : ");
        physics = scan.nextInt();
        System.out.print("Kimya Notnuz : ");
        chemistry = scan.nextInt();
        System.out.print("Turkce Notnuz : ");
        turkish = scan.nextInt();
        System.out.print("Muzik Notnuz : ");
        music = scan.nextInt();
        double avarage =(maths + physics + chemistry + turkish + music)/5;
        if (avarage<55 ) {
            System.out.println("Sinifta Kaldiniz. Seneye Gorusmek uzere");
        }else {
            System.out.println("Tebrikler!!! Sinifi Gectiniz");

        }System.out.println("Ortalamaniz = " + avarage);
    }
}
