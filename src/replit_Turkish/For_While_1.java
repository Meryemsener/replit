package replit_Turkish;

import java.util.Scanner;

public class For_While_1 {
    public static void main(String[] args) {
        /*Kullanıcıdan bir isim ve bir karakter girmesini isteyin,
         ardından döngüleri kullanarak karakterin isimde kaç kez tekrarlandığını kontrol edin.

char ch1= 'a' ;

	String name =“John came late"

	Expected Output:


Number of a = 2*/

        Scanner sc = new Scanner(System.in);
        System.out.println("isim giriniz");

        String isim = sc.next();
        System.out.println("Bir harf giriniz");
        char harf = sc.next().charAt(0);

        int toplam = 0;
        for (int i = 0; i < isim.length(); i++) {
            if (harf == isim.charAt(i)) {
                toplam++;
            }

        }
        System.out.println(toplam);

    }
}
