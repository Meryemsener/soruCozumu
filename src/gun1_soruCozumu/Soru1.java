package gun1_soruCozumu;

import java.util.Scanner;

public class Soru1 {
    public static void main(String[] args) {
        /*Soru1: String tipinde sabit bir şifre
        değişkeni oluşturun. Örneğin: String password = “12345”; gibi.
        Ardından, kullanıcıdan klavyeden bir şifre girmesini isteyin.
        Girilen şifre ile değişkende tuttuğunuz değeri kıyaslayın.
         Eğer, iki değer birbirine eşitse ekrana “Giriş Başarılı!”,
         değilse “Giriş Başarısız” yazdırın.

         */

        String sifre="12345";
        Scanner scan=new Scanner(System.in);
        System.out.println("Sifre giriniz");
        String kullaniciSifre= scan.next();
       /* if(sifre.equals(kullaniciSifre)){
            System.out.println("Giriş Başarılı!");

        }else System.out.println("Giriş Başarısız");*/

//ternary ile cozme

        System.out.println((sifre.equals(kullaniciSifre) ? "Giriş Başarılı!" : "Giriş Başarısız"));




    }
}























/*
    String sifre = "12345";
    Scanner scan=new Scanner(System.in);
        System.out.println("Bir sifre giriniz");
                String kullaniciSifre = scan.next();

                if (kullaniciSifre.equals(sifre)){
                System.out.println("Giris basarili");

                }else System.out.println("Giris basarisiz");*/
