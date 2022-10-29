package J03_KosulluIfadelerVeKodBloklari;

import java.util.Scanner;

/*Uçak Bileti Fiyatı Hesaplama
Java ile mesafeye ve şartlara göre uçak bileti fiyatı hesaplayan programı yapın. Kullanıcıdan Mesafe (KM),
yaşı ve yolculuk tipi (Tek Yön, Gidiş-Dönüş) bilgilerini alın. Mesafe başına ücret 0,10 TL / km olarak alın.
 İlk olarak uçuşun toplam fiyatını hesaplayın ve sonrasında ki koşullara göre müşteriye aşağıdaki indirimleri uygulayın ;

Kullanıcıdan alınan değerler geçerli (mesafe ve yaş değerleri pozitif sayı, yolculuk tipi ise 1 veya 2) olmalıdır.
 Aksi takdirde kullanıcıya "Hatalı Veri Girdiniz !" şeklinde bir uyarı verilmelidir.
Kişi 12 yaşından küçükse bilet fiyatı üzerinden %50 indirim uygulanır.
Kişi 12-24 yaşları arasında ise bilet fiyatı üzerinden %10 indirim uygulanır.
Kişi 65 yaşından büyük ise bilet fiyatı üzerinden %30 indirim uygulanır.
Kişi "Yolculuk Tipini" gidiş dönüş seçmiş ise bilet fiyatı üzerinden %20 indirim uygulanır.
İpucu
Normal Tutar = Mesafe * 0.10 = 1500 * 0.10 = 150 TL
Yaş İndirimi = Normal Tutar * Yaş İndirim Oranı = 150 * 0.10= 15 TL
İndirimli Tutar = Normal Tutar – Yaş İndirimi = 150 – 15 = 135 TL
Gidiş Dönüş Bilet İndirimi = İndirimli Tutar * 0.20 = 135 * 0.20 = 27 TL
Toplam Tutar = (135-27)* 2 = 216 TL

Senaryo 1
Mesafeyi km türünden giriniz : 1500
Yaşınızı giriniz : 20
Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ): 2
Toplam Tutar = 216 TL

Senaryo 2
Mesafeyi km türünden giriniz : -500
Yaşınızı giriniz : 1
Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ): 77

Hatalı Veri Girdiniz !
Senaryo 3
Mesafeyi km türünden giriniz : 200
Yaşınızı giriniz : 35
Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ): 1

Toplam Tutar = 20.0 TL
 */
public class C11_Pratik_UcakBiletiFiyatiHesaplama {
    public static void main(String[] args) {
        int mesafe = 0;
        int yas;
        int yolculikTipi;
        double kmBrim = 0.10;
        double normal = 1;
        double indirim12ve24 = 0.9;
        double indirimKucuk12 = 0.5;
        double indirim65uzeri = 0.8;
        double ciftYon = 0.8 * 2;
        double total = 0;
        System.out.println("****** Patika Hava Yollarina Hos Geldiniz *****");
        Scanner scan = new Scanner(System.in);
        System.out.print("Gideceginiz Mesafeyi Giriniz Litfen : ");
        mesafe = scan.nextInt();
        System.out.print("Yasinizi Giriniz Lutfen : ");
        yas = scan.nextInt();
        System.out.print("Yolculuk Tipini Giriniz : 1->Tek Yon   2-> Cift Yon =  ");
        yolculikTipi = scan.nextInt();
        if (mesafe > 0 && yas > 0 && yolculikTipi > 0 && yolculikTipi < 3) {
            if (yolculikTipi == 1) {
                if (yas < 12) {
                    total = (mesafe * kmBrim) * indirimKucuk12;
                    System.out.print("BiletinizTek yon  Toplam  = " + total + " TL' dir. \n Patika hava Yollari Iyi Yolculuklar Diler");
                } else if (yas < 24) {
                    total = (mesafe * kmBrim) * indirim12ve24;
                    System.out.print("BiletinizTek yon  Toplam  = " + total + " TL' dir. \n Patika hava Yollari Iyi Yolculuklar Diler");

                } else if (65 <yas) {
                    total = (mesafe * kmBrim) * indirim65uzeri;
                    System.out.print("BiletinizTek yon  Toplam  = " + total + " TL' dir. \n Patika hava Yollari Iyi Yolculuklar Diler");
                } else {
                    total = (mesafe * kmBrim) * normal;
                    System.out.print("BiletinizTek yon  Toplam  = " + total + " TL' dir. \n Patika hava Yollari Iyi Yolculuklar Diler");
                }
            } else {
                if (yas < 12) {
                    total = ((mesafe * kmBrim) * indirimKucuk12)*ciftYon;
                    System.out.print("BiletinizTek yon  Toplam  = " + total + " TL' dir. \n Patika hava Yollari Iyi Yolculuklar Diler");
                } else if (yas < 24) {
                    total = ((mesafe * kmBrim) * indirim12ve24)*ciftYon;
                    System.out.print("BiletinizTek yon  Toplam  = " + total + " TL' dir. \n Patika hava Yollari Iyi Yolculuklar Diler");
                } else if (65 < yas) {
                    total = ((mesafe * kmBrim) * indirim65uzeri)*ciftYon;
                    System.out.print("BiletinizTek yon  Toplam  = " + total + " TL' dir. \n Patika hava Yollari Iyi Yolculuklar Diler");
                } else {
                    total = ((mesafe * kmBrim) * normal)*ciftYon;
                    System.out.print("BiletinizTek yon  Toplam  = " + total + " TL' dir. \n Patika hava Yollari Iyi Yolculuklar Diler");
                }
            }
        } else {
            System.out.println("Hatali Veri Girdiniz");

        }


    }
}
