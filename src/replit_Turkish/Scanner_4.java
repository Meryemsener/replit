package replit_Turkish;

import java.util.Scanner;

public class Scanner_4 {
    public static void main(String[] args) {
        /*Kullanıcıya günde ne kadar çay içtiğini ve
        ne kadar şeker kullandığını sorun.
        Yılda kaç kg şeker kullandığını hesaplayın ve yazdırın.

1 şeker = 1.7 gr

Örnek Çıktı:

Yılda 12.41 kg şeker kullanıyor.*/
        Scanner scan=new Scanner(System.in);
        System.out.println("gunde kac bardak cay isersiniz ?");
        int bardak=scan.nextInt();
        System.out.println("kac seker kullanirsiniz?");
        int seker=scan.nextInt();
        System.out.println("Yilda "+365*bardak*seker*(1.7)/1000 + " kg seker kullaniyorsunuz");


    }
}
