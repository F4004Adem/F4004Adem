package J01_Giris;

import java.util.Scanner;

public class C09_ScanType {
    public static void main(String[] args) {
        // Kullanicidan veri alma

        double b ;
        int a;
        Scanner scan = new Scanner(System.in);
        System.out.print("A ve B icin deger giriniz: ");
        b = scan.nextDouble();
        a = scan.nextInt();
        String s = scan.nextLine();
        System.out.println(a);
        System.out.println(b);
        System.out.println(s);



    }// main ends
}
