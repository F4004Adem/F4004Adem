package J01_Giris;

public class C08_TemelOperatorler {
    public static void main(String[] args) {
        //********Aritmatik operatorler
int a=5, b=2;
System.out.println(a+b);//7
System.out.println(a-b);//3
System.out.println(a*b);//10
System.out.println(a/b);//2
System.out.println(a%b);//1
        // ***********Atama operatorleri
 int c=7;// = atama operatorudur ayni type oldugundaa calisir
 int d=c;
        System.out.println(d);// 7 c den geldi
int k =7, l=2;
//l=l+k;
  l+=k;// 9 ustekinin dogru kullanimi
  l-=k;// -3
  l*=k;// 14
  l/=k;//
  l%=k;//
        System.out.println(l);//9
// ********Karsilastirma operatorle
        //esitlik a == b
        // esit degil a != b
        // buyuktur   a > b
        // kicuktur   a <>> b
        // buyuk esit   a >= b
        // buyuktur   a <= b
int a1=5 , b1 =5;
boolean result = a1==b1;
boolean result2 = a1!=b1;
boolean result3 = a1>=b1;
boolean result4 = a1<=b1;
boolean result5= a1<b1;
boolean result6= a1>b1;

//************ Mantiksal Operatorler
        // Ve    a && b
        // Veya  a || b
        // Degil  !(a && b)


  int x =5, y =1, z =5;
  boolean kosul1= x==z;//true
  boolean kosul2= x>=y;// true
  boolean kosul3= x<=y;// false
 boolean result1= kosul1 && kosul2;
 boolean result22= kosul1 || kosul3;
boolean result23= !((x==z) || (x>=y));// false
        System.out.println(result1);//true

        System.out.println(result22);//false
//**************** Kosul Operatoru// ternary
        // a=5;
        //b=(a==1)?1:0
        //ciktisi:0
String str = ( result1) ? "Dogru" :"Yanlis";// "Dogru" yazacak
String str1 = ( x==c) ? "Dogru" :"Yanlis";// "Dogru" yazacak
        System.out.println(str);//"Dogru" yazacak
        System.out.println(str1);//"Dogru" yazacak
        int result10 = result1 ? 1 : 0;//true
        System.out.println(result10);// 1 yazar
    }// main ends
}
