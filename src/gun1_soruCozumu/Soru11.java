package gun1_soruCozumu;

import java.util.Scanner;

public class Soru11 {
    public static void main(String[] args) {
        /*  TASK :
	 *  Kullanicidan 3 tene pozitif  tam sayi alniz.
	 *  bu uc sayinin ucgen olusturma durumunu kontrol ediniz
	    eger ucgen olabiliyor ise, es kenar ucgen olma durumunu da  kontrol edniz.
	    INFO :
	     üçgen olma sarti :herhangi iki kenar toplami diger kenardan büyük, herhangi iki kenar farkı diger kenardan büyük olmali
		 a+b>c>a-b
		 a+c>b>a-c
	     b+c>a>b-c
		a=b=c ise es kenar ucgen
	 */

        int a=12;
        int b=15;
        int c=17;

        if(a==b && b==c){
            System.out.println("eskenar ucgen");

        }else if(a+b>c && c>a-b || a+c>b &&b>a-c || b+c>a && a>b-c){
            System.out.println("ucgen olabilir");

        }else System.out.println("hatali giris");


    }
}









/*Scanner scan = new Scanner(System.in);
        System.out.println("lutfen 3 tam sayi giriniz");

        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        if (a + b > c && a - b < c && a + c > b && a - c < b && b + c > a && b - c < a) {
            if (a == b && a == c) {
                System.out.println("ucgen ve eskenar ucgendir");
            } else {
                System.out.println("ucgen fakat eskenar degil");
            }
        } else {
            System.out.println("ucgen degildir");
        }*/