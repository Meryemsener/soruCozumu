package gun1_soruCozumu;

import java.util.Scanner;

public class Dilek {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("harf giriniz :");
        String harf = scan.next();

        String sesliHarfler = "aeiou"; //inglizce karakterleri aldim sadece, karisiklik olmasin diye..
        if (!(harf.charAt(0) >= 'a' && harf.charAt(0) <= 'z' || harf.charAt(0) >= 'A' && harf.charAt(0) <= 'A')) {
            System.out.println("hatali giris");
        } else {

            for (int i = 0; i < sesliHarfler.length(); i++) {
                if(harf.length()>1){
                    System.out.println("birden fazla deger girdiniz");break;
                }
                else if (sesliHarfler.contains(harf)) {  //sesli harfler girilen kelimenin ilk karakterini iceriyor mu?
                    //kullanici kelime girse bile ilk karaktere baksin..
                    System.out.println("sesli harf");
                    break;
                    //sesli harfi bulunca aramaya devam etmesin, donguyu kirsin..
                } else {
                    System.out.println("sessiz harf");
                    break;

                }
            }
        }
    }
}






