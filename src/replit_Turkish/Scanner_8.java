package replit_Turkish;

import java.util.Scanner;

public class Scanner_8 {
    public static void main(String[] args) {
        /*Kullanıcıdan üç basamaklı bir sayı girmesini
        ve bu sayının basamaklarının toplamını bulmasını isteyin.

            Örnek Çıktı:

            Verilen tamsayının rakamları toplamı 10'dur.*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("uc basamakli bir sayi giriniz");
        int num = scanner.nextInt();//gelen sayi
        int adet=0;//basamak sayisi
        int toplam=0;//basamaklari toplami
        while (num!=0){
            toplam=(num%10)+toplam;
            num/=10;
            ++adet;

        }
        System.out.println("Basamaklari toplami = " +toplam);







    }
}
