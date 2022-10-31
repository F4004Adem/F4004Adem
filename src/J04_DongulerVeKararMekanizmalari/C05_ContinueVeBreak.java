package J04_DongulerVeKararMekanizmalari;

public class C05_ContinueVeBreak {
    public static void main(String[] args) {

/*
Continue Deyimi
Java'da "continue" deyimi , döngü içinde bir koşul oluştuğunda o döngüyü tamamlamadan bir
sonraki kademeye geçmeye yarar.
*/
int a = 0;
while (a < 10) {
  a++;
  if (a == 5) {
    continue;
  }
  System.out.println(a);
}/*
Örnekte görüldüğü gibi eğer i değişkeni 5 sayısına eşit olduysa, o kod bloğundan
 sonraki kodlar çalışmayıp döngü bir sonraki adıma geçiş yapacaktır.

Break Deyimi
Buraya kadar gördüğümüz bütün döngüler belirlediğimiz bir koşula göre kontrol
ediliyor ve bu koşul sağlandığı sürece çalışıyordu. Bazı durumlarda, döngü koşulu
sağlansa bile başka bir nedenden ötürü döngüyü sonlandırmak isteyebiliriz. Bu tarz
 durumlarda break deyimini kullanırız. Bu deyim, içinde kullanıldığı döngüyü anında sonlandırır.
*/
for (int i =0; i < 10; i++) {
  if (i == 5) {
    break;
  }
  System.out.println(i);
}/*
Örnekte görüldüğü üzere döngü içinde ki koşul tamamlanmadan i değişkeni 5 değerine ulaştığında
 "break" komutu ile döngümüzü bitirebiliriz.
 */

    }
}
