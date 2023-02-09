package J02_TemelKavramlarPratik;
import java.util.Scanner;
public class C05_DaireninAlanCevreHesaplama {
    public static void main(String[] args) {
        int r ;
        double pi= 3.14;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter radius  :");
        r = scanner.nextInt();
        double perimeter = 2*pi*r;
        double area =r*r*pi;
        System.out.println("Circle  area      = " + area);
        System.out.println("Circle  perimeter = " + perimeter);

    }
}
