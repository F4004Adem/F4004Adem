package J04_DongulerVeKararMekanizmalari;

import java.util.Scanner;

public class Pratik08_YildizlarIleUcgenYapimi {
    public static void main(String[] args) {
/*Java'da döngüler kullanılarak yıldızlar ile üçgen yapıyoruz.

     *
    ***
   *****
  *******
 *********
***********
 */
        Scanner klavye = new Scanner(System.in);
        System.out.println("Bir Sayı Giriniz :");
        int n = klavye.nextInt();

        for (int i = 0; i <= n ; i++) {
            for (int j = 0; j < (n - i); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i + 1); k++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }




//Ödev
//Java'da döngüler kullanarak yıldızlar ile elmas yapınız.
    }
}
