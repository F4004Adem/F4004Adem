package J02_Pratik;

import java.util.Scanner;

public class C01_KDV_Hesaplama {
    public static void main(String[] args) {
        double price, kdVratio=0.18, kdVprice, priceWithKDV;


        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter the price of pruduct : ");
        price= scan.nextDouble();

        kdVprice= price *kdVratio;
        priceWithKDV = price + kdVprice;

        System.out.println("Raw price of product = " + price);
        System.out.println("KDV Ratio = " + kdVratio);
        System.out.println("KDV value = " + kdVprice);
        System.out.println("Total price with KDV = " + priceWithKDV);


    }

}
