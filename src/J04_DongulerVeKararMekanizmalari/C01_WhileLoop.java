package J04_DongulerVeKararMekanizmalari;

import java.util.Scanner;

public class C01_WhileLoop {
    public static void main(String[] args) {
/*While Döngüsü
While döngüsü Java'nın temel yapı taşlarından bir tanesidir. While terimini yazdıktan sonra yanına bir parantez
açılıp kapatılır ve bu parantezler arasına boolean bir değer girilir. Sonrasında bir süslü parantez açılıp
 kapatılır ve bunun içine kod bloğu yazılır. Bu parantezler içindeki değer doğru(true) olduğu sürece döngü
  dönmeye devam eder ve kod bloğu çalışır.
Burada belirtilen koşul, boolean bir ifadedir. Bu koşul true olduğu sürece döngü devam eder.
Koşul false olursa döngü sonlanır. Koşul ifadesi parantez içine yazılır. Eğer döngüye girecek k
od tek satırdan oluşuyorsa blok açmaya gerek yoktur; fakat birden fazla satırdan oluşuyorsa mutlaka blok açılmalıdır.
while(kosul){
            //kod bloğu
        }
 */

        int i = 1;
        while (i <= 5) {
            System.out.print(i + ',');
            i++;
        }

        int left = 100, right = 200;
        while (++left < --right);
        System.out.println("100 ile 200'ün ortası: " + left);

        Scanner scanner = new Scanner(System.in);
        String customerPassword = "12345";
        boolean passwordSuccessfull = false;

        while(!passwordSuccessfull) {

            System.out.println("Hesap şifrenizi giriniz:");
            String typedPassword = scanner.next();

            if(customerPassword.contentEquals(typedPassword)) {
                passwordSuccessfull = true;
                System.out.println("Sisteme başarılı giriş yaptınız!");
            }
        }

    }
}
