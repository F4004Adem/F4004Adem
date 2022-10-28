package J03_KosulluIfadelerVeKodBloklari;

import java.util.Scanner;
/*
Koç Burcu : 21 Mart - 20 Nisan
Boğa Burcu : 21 Nisan - 21 Mayıs
İkizler Burcu : 22 Mayıs - 22 Haziran
Yengeç Burcu : 23 Haziran - 22 Temmuz
Aslan Burcu : 23 Temmuz - 22 Ağustos
Başak Burcu : 23 Ağustos - 22 Eylül
Terazi Burcu : 23 Eylül - 22 Ekim
Akrep Burcu : 23 Ekim - 21 Kasım
Yay Burcu : 22 Kasım - 21 Aralık
Oğlak Burcu : 22 Aralık - 21 Ocak
Kova Burcu : 22 Ocak - 19 Şubat
Balık Burcu : 20 Şubat - 20 Mart
Aynı örneği switch-case kullanmadan yapınız.
 */
public class C10_Pratik_BurcBulanProgram {
    public static void main(String[] args) {
       int month , day;
       String zodiak = " ";
       boolean isEror = false;
        Scanner scan = new Scanner(System.in);
        System.out.print("Dogdugunuz ayi sayi olarak giriniz : ");
        month = scan.nextInt();
        System.out.print("Dogdugunuz gunu giriniz : ");
        day = scan.nextInt();
        if (month==1){
            if (day >=1 && day <= 31){
                if (day <22){zodiak ="Oglak";
                }else{zodiak ="Kova";
                }
            }else {isEror = true;
            }
        }else if (month==2){
            if (day >=1 && day <= 28){
                if (day <20){zodiak ="Kova";
                }else{zodiak ="Balik";
                }
            }else {isEror = true;
            }
        }else if (month==3){
            if (day >=1 && day <= 31){
                if (day <21){zodiak ="Balik";
                }else{zodiak ="Koc";
                }
            }else {isEror = true;
            }
        }else if (month==4){
            if (day >=1 && day <= 30){
                if (day <21){zodiak ="Koc";
                }else{zodiak ="Boga";
                }
            }else {isEror = true;
            }
        }else if (month==5){
            if (day >=1 && day <= 31){
                if (day <22){zodiak ="Boga";
                }else{zodiak ="Ikizler";
                }
            }else {isEror = true;
            }
        }else if (month==6){
            if (day >=1 && day <= 30){
                if (day <23){zodiak ="Ikizler";
                }else{zodiak ="Yengec";
                }
            }else {isEror = true;
            }
        }else if (month==7){
            if (day >=1 && day <= 31){
                if (day <23){
                    zodiak ="Yengec";
                }else{zodiak ="Aslan";
                }
            }else {isEror = true;
            }
        }else if (month==8){
            if (day >=1 && day <= 31){
                if (day <23){zodiak ="Aslan";
                }else{zodiak ="Basak";
                }
            }else {isEror = true;
            }
        }else if (month==9){
            if (day >=1 && day <= 30){
                if (day <23){zodiak ="Basak";
                }else{zodiak ="Terazi";
                }
            }else {isEror = true;
            }
        }else if (month==10){
            if (day >=1 && day <= 31){
                if (day <23){zodiak ="Terazi";
                }else{zodiak ="Akrep";
                }
            }else {isEror = true;
            }
        }else if (month==11){
            if (day >=1 && day <= 30){
                if (day <22){zodiak =" Akrep";
                }else{zodiak ="Yay";
                }
            }else {isEror = true;
            }
        }else if (month==12){
            if (day >=1 && day <= 31){
                if (day <22){zodiak ="Yay";
                }else{zodiak ="Oglak";
                }
            }else {isEror = true;
            }
        }
       if (isEror){
           System.out.println("Hatali Giris yaptiniz = ");
       }else {
           System.out.println("Burcunuz = " + zodiak);
       }
    }
}
