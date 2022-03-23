package gun1_soruCozumu;

import java.util.Scanner;

public class Soru17 {
    public static void main(String[] args) {
        /*
         * TASK :
         * Kullanicidan aldigi urunun adedini ve liste fiyatini alin, kullaniciya
         * musteri karti olup olmadigini sorun
         * Musteri karti varsa ve 10 urunden fazla alirsa %20, yoksa %15 indirim yapin
         * Musteri karti yoksa ve 10 urunden fazla alirsa %15, 10 urunden az
         * alirsa %10 indirim yapan code create ediniz.
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen aldiginiz urunun adedini giriniz");
        int urunAdedi= scan.nextInt();

        System.out.println("lutfen urun liste fiyatini giriniz");
        double fiyat=scan.nextDouble();
        double toplamFiyat;

        System.out.println("Musteri kartiniz var mi? varsa Y yoksa N yaziniz");
        char kart=scan.next().toLowerCase().charAt(0);

        if(kart=='y'){
            if(urunAdedi>10) {
                fiyat *= 0.8;
                toplamFiyat = fiyat * urunAdedi;
                System.out.println("%20 indirim hakki kazandiniz. Toplam odemeniz gereken miktar: "
                        + toplamFiyat);

            }else{
                fiyat*=0.85;
                toplamFiyat=fiyat*urunAdedi;
                System.out.println("%15 indirim hakki kazandiniz. Toplam odemeniz gereken miktar: "
                        + toplamFiyat);
            }
        }else if(kart=='N') {
            if (urunAdedi > 10) {
                fiyat *= 0.85;
                toplamFiyat = fiyat * urunAdedi;
                System.out.println("%15 indirim hakki kazandiniz. Toplam odemeniz gereken miktar: "
                        + toplamFiyat);
            } else {
                fiyat = fiyat - fiyat * 10 / 100;
                toplamFiyat = fiyat * urunAdedi;
                System.out.println("%10 indirim hakki kazandiniz. Toplam odemeniz gereken miktar: " + toplamFiyat);
            }

        }else{
            System.out.println("yalnis giris yaptiniz. Terkar deneyiniz");
        }


    }
}
