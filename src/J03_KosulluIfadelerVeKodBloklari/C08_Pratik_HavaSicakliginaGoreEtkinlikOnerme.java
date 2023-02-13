package J03_KosulluIfadelerVeKodBloklari;

import java.util.Scanner;
/*
Koşullar :
Sıcaklık 5'dan küçük ise "Kayak" yapmayı öner.
Sıcaklık 5 ve 15 arasında ise "Sinema" etkinliğini öner.
Sıcaklık 10 ve 25 arasında ise "Piknik" etkinliğini öner.
Sıcaklık 25'ten büyük ise "Yüzme" etkinliğini öner.
 */
public class C08_Pratik_HavaSicakliginaGoreEtkinlikOnerme {

    public static void main(String[] args) {

       int temperature ;
        Scanner scan = new Scanner(System.in);
        System.out.print("Sicaklik Giriniz : ");
        temperature = scan.nextInt();
        if (temperature <5) {
            System.out.println("Kayak Yapabilirsiniz ;");
        }else if (temperature <=25){
            if (temperature <= 15){
                System.out.println("Sinemaya Gidebilirsiniz :");
            }
            if (temperature>=10){
                System.out.println("Piknik Yapabilirsiniz ;");
            }
        }else {
            System.out.println("Yuzmeye Gidebilirsiniz :");
        }

    }
}
