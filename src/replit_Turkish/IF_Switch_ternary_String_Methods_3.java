package replit_Turkish;

import javax.crypto.spec.PSource;

public class IF_Switch_ternary_String_Methods_3 {
    public static void main(String[] args) {
        /*Verilen iki sayının (sıfırdan büyük veya sıfıra eşit)
         toplamını hesaplayan ve yazdıran bir Java programı yazın.
          Verilen tamsayılar veya toplam 10'dan fazla basamakli olursa, "OverFlow" yazdırın.

Ornek:
INPUT :
25
46
OUTPUT :Numaralarin Toplami:
71
*/
        int a = 40443434;
        int b = 47000000;
        if (a+b>0 && a+b<999999999) {
            System.out.println("OverFlow");

        } else if ((a + b > 999999999)){
            System.out.println("Numaralarin Toplami: " + a + b);
        }

    }
}