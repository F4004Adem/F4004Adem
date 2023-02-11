package J04_DongulerVeKararMekanizmalari;

import java.util.Scanner;

//Java ile Combination  hesaplayan program yazıyoruz.
public class Pratik04_CombinationHesaplama {

    public static void main(String[] args) {
        // C(n,r) = n! / (r! * (n-r)!)
        int n,r, combination, nTotal=1, rTotal=1,  nMinusR=1;
        Scanner scan= new Scanner(System.in);
        System.out.print("Number of object (n)  :");
        n = scan.nextInt();
        System.out.print("Number of choosing object (r)  :");
        r = scan.nextInt();
        int toplam =1;
        for (int  i=1 ;i <=n ;i++){
           nTotal *=i;
        }

       for (int j=1 ; j <=r ;j++){
           rTotal *=j;
       }
        for (int k =1 ; k<=(n-r) ; k++){
            nMinusR *=k;
        }
        combination =nTotal /(nTotal*nMinusR);
        System.out.println("combination C ("+n+","+r+") = " + combination);

    }

}
