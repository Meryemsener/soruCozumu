package gun1_soruCozumu;

import static java.util.Collections.replaceAll;

public class StringManForLoop {
    public static void main(String[] args) {
        String str = "Is Ali 13 years old?  I think ! he is between 15-16.";
        //1. butun bosluklari sil, replace yaparken ikisi de strin ya da ikisi de char olmali
        String nosSpace = str.replaceAll(" ", "");
        System.out.println(nosSpace);
        //2-butun numaralari  * ile degistir  \

        String noDigit = str.replace("13", "**").replace("15", "**");
        System.out.println(noDigit);
        //bu kod dinamik ve dogru bir kod olmaz. Cunku ali'nin yasini 20 yaparsak kod calismaz
       //buna 'hard coding' denir.Bu bir hatadir. Tavsiye edilmez


        //replaceAll'in icine  "[0-9]"=> bu araligi
        // "[A-Z]"=>buyuk harfleri
        //"[0-9]"=>tum sayilar
        // "[a-z]" =>kucuk harfleri
        // "[A-Za-z]"=>buyuk kucuk tum harf
        //"[0-9A-Za-z]"=> tum sayi ve rakamlai, kucuk buyuk harfleri
        //  "[^0-9]" => rakam haric
        //"[^a-z]" => kucuk harf  haric
        //"[^A-Z]" => buyuk harf  haric
        //"[^A-Za-z]" => buyuk kucuk butun harf haric haric
        //"[^0-9A-Za-z]" => rakam, kucuk buyk harf haric

        //2.yol
        String sayilariDegistir=str.replaceAll("[0-9]", "*");
        System.out.println(sayilariDegistir);

        //tum harfleri degistir
        String harfleriDegistir=str.replaceAll("[A-Za-z]", "*");
        System.out.println(harfleriDegistir);

        //harf haric gerisini ? ile degistir
        String harfHaricGerisiniSoruIsaretiYap=str.replaceAll("[^A-Za-z]","?");
        System.out.println(harfHaricGerisiniSoruIsaretiYap);

        //rakam haric butun karakterleri * ile degistir
        String yildizlaDegistir=str.replaceAll("[^0-9]","*");
        System.out.println(yildizlaDegistir);

        //bosluk haric butun karakterleri * ile degistir
        String boslukHAric=str.replaceAll("[^ ]","*");
        System.out.println(boslukHAric);
        /*
        kisa yollari
        1-\\s bosluk
        2-\\S bosluk haric
        3-\\d rakamlar
        4-\\D rakam haric
        5-\\w A-Z a-z 0-9
        6-\\W A-Z a-z 0-9 haric
        7-\\p{Punct} punctuations marks yani noktalama isaretleri
        8



         */
        //bosluk harici kac karakter kullanilmisitr
        int boslukHaricKarakterSayisi=str.replaceAll("\\s", "").length();
        System.out.println(boslukHaricKarakterSayisi);

        //kac rakam kullanilmis
        int rakamSayisi=str.replaceAll("\\D","" ).length();
        System.out.println(rakamSayisi);

        //kac harf kullanilmis

        int harfSayisi=str.replaceAll("[^A-Za-z]","" ).length();
        System.out.println(harfSayisi);

        //kac noktalama isareti oldugunu ogrenmek icin once noktalama isaretlerinin yerini boslukla
        //degistiririsz, sonra da bosluk sayisini aliriz
        int toplamKarakter=str.length();
          int noktalamayiHiclikleDegistir=str.replaceAll("\\p{Punct}","").length();
          int noktalamaIsaretiSayisi=toplamKarakter-noktalamayiHiclikleDegistir;
        System.out.println(noktalamaIsaretiSayisi);





    }
}
