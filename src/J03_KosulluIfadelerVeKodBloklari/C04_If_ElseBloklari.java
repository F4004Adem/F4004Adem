package J03_KosulluIfadelerVeKodBloklari;

public class C04_If_ElseBloklari {
    public static void main(String[] args) {
double creditRatio=0.5;
int age = 44;

        if(age < 50) {
            // personel kayıtlarını getir
        }


        if(creditRatio > 0.7) {
            System.out.println("Kurumsal müşteri tipinde kredi");
        }
        else {
            System.out.println("Standart müşteri tipinde kredi");
        }

int ortalama = 50;

        if(ortalama >= 50){
            System.out.println("Dersi Geçtiniz");
        }else{
            System.out.println("Dersten Kaldınız");
        }

int i = 15;

        if(i==10){
            System.out.println("i nin degeri 10'dur.");
        }
        else if(i<10){
            System.out.println("i nin degeri 10'dan kücüktür.");
        }
        else{
            System.out.println("i nin degeri 10'dan farklıdır ve 10'dan kücük degildir.");
        }


        float saltRatio = 0.9f;
        if(saltRatio >= 0.8) {
            System.out.println("yüksek derecede tuzlu");
        }
        else if(0.5 < saltRatio && saltRatio < 0.8 ) {
            System.out.println("orta derecede tuzlu");
        }
        else {
            System.out.println("düşük derecede tuzli");}




        // NESTED IF
        int age1=25;
        int weight=48;

        if(age>=18){

            if(weight>=48){
                System.out.println("Kan verebilirsiniz");
            }
            else{
                System.out.println("Kan veremezsiniz");
            }

        } else{
            System.out.println("Kan verebilmek için yaşınız 18'den büyük olmalıdır.");
        }
        //Sizce yukarıda yazdığımız kodun Console çıktısı nedir ?

             //   Kan verebilirsiniz.



    }

}
