package J02_TemelKavramlarPratik;

import java.util.Scanner;

public class C04_TaksimetreHesaplama {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter distance you will travel to : ");
       int distanceKM = scanner.nextInt();
       double perKm=2.20;
       double total = 0;
       int startingPrice =10;
        total+=(distanceKM*perKm)+startingPrice;
        total =(total<20)? 20 :total;
        System.out.print("total price = " + total + "  TL");





    }
}
