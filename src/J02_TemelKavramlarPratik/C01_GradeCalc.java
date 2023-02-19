package J02_TemelKavramlarPratik;

import java.util.Scanner;

public class C01_GradeCalc {
    public static void main(String[] args) {

        int math, physics, chemistry, history, music;

        Scanner scan = new Scanner(System.in);
        //Kullanicidandegerler alinabilinir
        System.out.print("Please enter your Math grade ");
        math = scan.nextInt();

        System.out.print("Please enter your Physics grade ");
        physics = scan.nextInt();

        System.out.print("Please enter your Chemistry grade");
        chemistry = scan.nextInt();

        System.out.print("Please enter your History grade ");
        history = scan.nextInt();

        System.out.print("Please enter your Music grade ");
        music = scan.nextInt();

        double toplam = (math + physics + chemistry + history +music);
        double result = toplam/5.0;
        System.out.println(result);
        System.out.println("Did you Pass = " + (result>=60));
        System.out.println( (result>=60)? "Congratulation You Passed" : "I'm Sorry but You Failed");


    }
}
