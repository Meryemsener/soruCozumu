package gun1_soruCozumu;

import java.util.Scanner;

public class Soru16 {
    public static void main(String[] args) {
        /* TASK :
		 * Kullanicidan 1 harf (karakter) aliniz ve bunun buyuk harf, kucuk harf yada
		   hatali giris seklinde code create ediniz
		 */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir karakter giriniz");
        char karakter=scan.next().charAt(0);

        if(karakter>= 'a' && karakter<='z'){
            System.out.println("kucuk harf");
        }else if(karakter>='A' && karakter<='Z'){
            System.out.println("buyuk harf");
        }else{
            System.out.println("hatali giris yaptiniz");
        }


    }
}
