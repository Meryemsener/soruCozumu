package gun1_soruCozumu;

import java.util.Scanner;

public class Soru8 {
    public static void main(String[] args) {
        // Kullanıcı Tarafından Girilen
        // sayının Basamakları Toplamını Bulan Java Programı (while ile)

        int sayi = 456;
        int toplam = 0;
        while (sayi != 0) {
            toplam = (sayi % 10) + toplam;
            sayi /= 10;
        }
        System.out.println(toplam);
    }

}










/* Scanner reader = new Scanner(System.in);
        System.out.println("Bir sayi giriniz:");
        int num=reader.nextInt();
        int adet=0, toplam=0;

        while(num!=0){
            toplam=(num%10)+toplam;
            num/=10;
            ++adet;
        }
        System.out.println("Basamak toplami: "+ toplam);*/