package replit_Turkish;

import java.util.Scanner;

public class SYSO_3 {
    public static void main(String[] args) {
        /*Verilen integer sayilarin Toplamini, carpimini, cikarma islemini ve bolme islemini yapan java kodunu yaziniz.

        num1=100;

        num2=25;

        Ornek Cikti:

        125

        2500

        75

        4*/
        Scanner scan = new Scanner(System.in);
        System.out.println("iki sayi giriniz");
        int a= scan.nextInt();
        int b= scan.nextInt();
//int b=scan.nextInt();

        System.out.println("toplama icin 1, cikarma icin 2, carpma icin 3, bolme icin 4 yazin" );
        int islem=scan.nextInt();
        switch(islem){
            case 1:
                System.out.println("iki sayinin tolmai = "+ (a+b));break;
            case 2:
                System.out.println("iki sayinin farki = " + (a-b));break;
            case 3:
                System.out.println("iki sayinin carpimi = " + (a*b));break;
            case 4:
                System.out.println("iki sayinin carpimi = " + (a*b));break;
            default:System.out.println("hatali giris");break;
        }

    }
}
