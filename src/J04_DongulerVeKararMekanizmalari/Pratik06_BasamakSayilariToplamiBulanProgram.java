package J04_DongulerVeKararMekanizmalari;

import java.util.Scanner;

public class Pratik06_BasamakSayilariToplamiBulanProgram {
    public static void main(String[] args) {
/*
Ödev
Bir sayının basamak sayılarının toplamını hesaplayan program yazınız.
Örnek : 1643 = 1 + 6 + 4 + 3 = 14
 */
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı Giriniz :");
        int number = input.nextInt();
        int tempNumber = number;
        int basValue;
        int bastoplam=0;

        while (tempNumber != 0) {
            basValue = tempNumber % 10;
            tempNumber /= 10;
                bastoplam += basValue;
        } System.out.println("result = " + bastoplam);








    }
}
