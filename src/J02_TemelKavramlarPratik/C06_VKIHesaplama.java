package J02_TemelKavramlarPratik;

import java.util.Scanner;

public class C06_VKIHesaplama {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Lutfen Boyunuzu giriniz metre cinsinden : ");
        double boy = scanner.nextDouble();
        System.out.print("Lutfen kilonuzu giriniz kg cinsinden :");
        double kilo = scanner.nextDouble();
        double VKI = kilo/(boy * boy);
                if (VKI<20){
                    System.out.println("cok zayifsiniz \nVKI= " + VKI);
                }else if (20<=VKI && VKI<25){
                    System.out.println("ideal kilodasiniz \nVKI= " + VKI);
                }else if (25<=VKI && VKI<30){
                    System.out.println("cok kilolusunuz \nVKI= " + VKI);
                }else
                    System.out.println("obezitesiniz  \nVKI= " + VKI);

    }
}
