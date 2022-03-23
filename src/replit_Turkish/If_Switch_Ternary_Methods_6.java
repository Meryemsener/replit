package replit_Turkish;

import java.util.Scanner;

public class If_Switch_Ternary_Methods_6 {
    public static void main(String[] args) {
         /*Kullanıcıdan bir isim yazmasını isteyin,
         adın uzunluğu 3 olmalıdır. Ardından, adın aynı karakterlere
         sahip olup olmadığını kontrol edin.
        Eger aynı karakterlere sahipse

       "isim ayni karakterlere sahiptir." yazdirin.

       Eger ayni kaakterlere sahip degilse

       "Dizenin benzersiz karakterleri var" yazdirin.

       Ternary kullanin.*/

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfe isim yaziniz");
        String isim= scan.next();
        if(isim.length()==3){
            if(isim.charAt(0)==isim.charAt(1) && isim.charAt(1)==isim.charAt(2)){
                System.out.println("isim ayni karakterlere sahiptir.");
            }else System.out.println( "Dizenin benzersiz karakterleri var");
        }else System.out.println("isim 3 harften fazladir");

        System.out.println("******************TERNARY**************");
        System.out.println((isim.length()==3)&&(isim.charAt(0)==isim.charAt(1) && isim.charAt(1)==isim.charAt(2))?"isim ayni karakterlere sahiptir.":"Dizenin benzersiz karakterleri var");
    }
}
