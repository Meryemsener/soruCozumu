package gun1_soruCozumu;

import java.util.Scanner;

public class Soru14 {
    public static void main(String[] args) {
        /*
		TASK :
		Kullanicidan  yasini ve kilosunu alaliniz
		18 yasindan kucuk ise kan bagisi yapamaz
		18 yasindann buyuk ve 50 kilo dan hafif ise kan bagisi yapamaz.
		18 yasindan buyuk ve 50 kilodan agir ise kan bagisi yapabilir.
		 */

        Scanner scanner = new Scanner(System.in);
        System.out.println("yasınızı giriniz : ");
        int yas = scanner.nextInt();

        System.out.println("kilonuzu giriniz : ");
        int kilo = scanner.nextInt();

        if (yas > 0 && yas < 18) {
            System.out.println("yası 18'den kucuk olanlar kan bagısı yapamaz");
        } else if (yas >= 18) {
            if (kilo > 0 && kilo < 50) {
                System.out.println("yasınız kan bagısı icin uygun ancak kilonuz yetriz");
            } else if (kilo >= 50) {
                System.out.println("sartlarınız uygun kan bagısı yapabilirsiniz");
            } else {
                System.out.println("kilonuzu hatali girdiniz");
            }
        } else {
            System.out.println("hatalı veri girdiniz");
        }


    }
}
