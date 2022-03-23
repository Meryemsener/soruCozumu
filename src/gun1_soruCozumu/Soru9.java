package gun1_soruCozumu;

import java.util.Scanner;

public class Soru9 {
    public static void main(String[] args) {
        //While Döngüsü ile Faktöriyel Hesaplama

        int sayi=5;
        int faktoryel=1;
        while(sayi>=1){
            faktoryel=faktoryel*sayi;
            sayi--;
        }
        System.out.println(faktoryel);
    }
}












/*Scanner reader = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        int num=reader.nextInt();
        int sayac=num;
        long faktoryel=1;

        while(sayac>1){
            faktoryel*=sayac;
            sayac--;

        }
        System.out.printf("%d Sayısının Faktöriyeli = %d \n", num, faktoryel);*/