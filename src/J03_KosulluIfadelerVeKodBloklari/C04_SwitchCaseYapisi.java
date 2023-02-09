package J03_KosulluIfadelerVeKodBloklari;

import java.util.Scanner;

public class C04_SwitchCaseYapisi {
    public static void main(String[] args) {
        int day =2;
        switch(day) {
            case 1:
                System.out.println(" Bugun = Pazartesi ");
                // değer x'e eşitse bu kod bloğu çalışacak
                break;
            case 2:System.out.println(" Bugun = Sali ");
                // değer y'ye eşitse bu kod bloğu çalışacak
                break;
            case 3:System.out.println(" Bugun = Carsamba ");
                // değer x'e eşitse bu kod bloğu çalışacak
                break;
            case 4:System.out.println(" Bugun = Persembe ");
                // değer y'ye eşitse bu kod bloğu çalışacak
                break;
            case 5:System.out.println(" Bugun = Cuma ");
                // değer x'e eşitse bu kod bloğu çalışacak
                break;
            case 6:System.out.println(" Bugun = Cumartesi ");
                // değer y'ye eşitse bu kod bloğu çalışacak
                break;
            case 7:System.out.println(" Bugun = Pazar ");
                // değer x'e eşitse bu kod bloğu çalışacak
                break;

            default:System.out.println(" Hatali giris yaptiniz ");
                // değer hiç bir şeye eşit değilse bu kod bloğu çalışacak
        }


        // Kullanicidan Alma ile oluyor

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen gunu numara olarak giriniz ");
        int value = input.nextInt();
        switch (value) {
            case 1:
                System.out.println(" Bugun = Pazartesi ");
                // değer x'e eşitse bu kod bloğu çalışacak
                break;
            case 2:System.out.println(" Bugun = Sali ");
                // değer y'ye eşitse bu kod bloğu çalışacak
                break;
            case 3:System.out.println(" Bugun = Carsamba ");
                // değer x'e eşitse bu kod bloğu çalışacak
                break;
            case 4:System.out.println(" Bugun = Persembe ");
                // değer y'ye eşitse bu kod bloğu çalışacak
                break;
            case 5:System.out.println(" Bugun = Cuma ");
                // değer x'e eşitse bu kod bloğu çalışacak
                break;
            case 6:System.out.println(" Bugun = Cumartesi ");
                // değer y'ye eşitse bu kod bloğu çalışacak
                break;
            case 7:System.out.println(" Bugun = Pazar ");
                // değer x'e eşitse bu kod bloğu çalışacak
                break;

            default:System.out.println(" Hatali giris yaptiniz ");
                // değer hiç bir şeye eşit değilse bu kod bloğu çalışacak
        }


        int points=6;
        switch(points)
        {
            case 6: ;
            case 7: System.out.println("Java");break;
            case 8: ;
            case 9: System.out.println("101");break;
            case 10: System.out.println("Patika"); break;
            default: System.out.println("Dev");
        }



    }
}
