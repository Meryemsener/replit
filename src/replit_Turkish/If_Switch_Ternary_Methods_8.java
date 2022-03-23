package replit_Turkish;

import java.util.Scanner;

public class If_Switch_Ternary_Methods_8 {
    public static void main(String[] args) {
        /*Kullanıcıdan bir isim girmesini isteyin ve son 2 harfinin 3 kopyasından oluşan yeni bir String yazdırın

Kullanicidan alinan isim uzunluğu en az 2 olacaktır.

INPUT : Mustafa

OUTPUT : fafafa*/


        //BUNU COZEMEDIN



        Scanner scan=new Scanner(System.in);
        System.out.println("Isim giriniz");
        String isim = scan.nextLine();
        if(isim.length()==2 ){
            System.out.println(isim.substring(isim.length()-1)+isim.substring(isim.length()));
        }
    }
        }



