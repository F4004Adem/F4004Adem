package J02_TemelKavramlarPratik;

import java.util.Scanner;

public class C03_DikUcgenHipotenusHesaplama {
    public static void main(String[] args) {
        int a, b;
        double c;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter 1st edge  : ");
        a = scanner.nextInt();
        System.out.print("Enter 2nd edge  : ");
        b = scanner.nextInt();

        c = Math.sqrt(a * a + b * b);
        System.out.println("Hypotonus = " + c);

    }
}
