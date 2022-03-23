package gun1_soruCozumu;

import java.util.Scanner;

public class harfIsteme {
    public static void main(String[] args) {

        //ilk ve son karakteri yazdirin/"java is easy=> jy
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string...");
        String str = scan.nextLine();
        //karakterleri birer birer almak icin iki yolumuz var.
        //1.si charAt(); ile
        char firstChar = str.charAt(0);//ilk harfi verir
        System.out.println(firstChar);

        char lastChar = str.charAt(str.length() - 1);//son karakter

        System.out.println(lastChar);

        //2.si substring ile
        String ilk = str.substring(0, 1);//ilk karakter
        System.out.println(ilk);
        String son = str.substring(str.length() - 1, str.length());//son karakter
        System.out.println(son);

        //iki kelimelik isimlerin ilk harflerini yazdir
        String first = str.substring(0, 1);
        System.out.println(first);

        //bosluk karakterini nasil buluruz
        int boslugunIndexi = str.indexOf(" ") + 1;//ilk bosluktan sonraki ilk harf demek
        String ikinciBasHarf = str.substring(boslugunIndexi, boslugunIndexi + 1);
        System.out.println(ikinciBasHarf);

        //bir karakterin indexini istiyorsak
        //Tarik=>  str.indexOf('T');=>0
        //str.indexOf('ar');=> 1-ilk basladigi indexi yazar sadece
        //str.indexOf('rik');=> 2-ilk basladigi indexi yazar sadece
        //eger o karakter cumlede yoksa index -1 olarak doner


        String karakter1 = "x";//buraya kelime de yazabilirsin
        int result = str.indexOf(karakter1);
        if (result == -1) {
            System.out.println("karakter bulunamadi");
        } else {
            System.out.println("karakter bulundu");
        }

        //ikinci yol, contains() method ile kontrol edilir.boolean verir
        boolean isContain = str.contains("sasirdi");
        if (isContain) {
            System.out.println("karakter bulundu");
        } else {
            System.out.println("karakter bunuamadi");
        }

    }
}
