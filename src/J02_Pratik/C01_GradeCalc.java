package J02_Pratik;

import java.util.Scanner;

public class C01_GradeCalc {
    public static void main(String[] args) {
// Degiskenler
        int mat, fizik, kimya,turkce, tarih, muzik;

        // Scanner sinifimizi tanimladik
        Scanner scan = new Scanner(System.in);

        //Kullanicidandegerler alinabilinir
        System.out.print("Matematik Notunuz ");
        mat = scan.nextInt();


        System.out.print("Fizik Notunuz ");
        fizik = scan.nextInt();


        System.out.print("Kimya Notunuz ");
        kimya = scan.nextInt();


        System.out.print("Turkce Notunuz ");
        turkce = scan.nextInt();

        System.out.print("Tarih Notunuz ");
        tarih = scan.nextInt();

        System.out.print("Muzik Notunuz ");
        muzik = scan.nextInt();

        double toplam = (mat+fizik+kimya+turkce+tarih+muzik);
        double sonuc = toplam/6.0;
        System.out.println(sonuc);
        System.out.println("Gecti = " + (sonuc>=60));
        System.out.println( (sonuc>=60)? "Gecti" : "Kaldi");


    }
}
