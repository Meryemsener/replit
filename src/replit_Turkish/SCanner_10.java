package replit_Turkish;

public class SCanner_10 {
    public static void main(String[] args) {
        /*Kullanıcıdan dakika girmesini isteyin, Dakikaları birkaç yıl ve gün sayısına dönüştürmek için bir Java programı yazın.

            INPUT: Dakika sayısı: 3456789

            OUTPUT : 3456789 dakika yaklaşık 6 yıl 210 gündür*/
        int dakika=3456789;
        int gun=3456789/60/24;
        //int yil=
        System.out.println(dakika +" dakika yaklasik "+((gun-(gun%365))/365 + " yil " +gun%360)+ " gundur ");




    }
}
