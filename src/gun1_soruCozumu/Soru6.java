package gun1_soruCozumu;

import java.util.Scanner;

public class Soru6 {
    public static void main(String[] args) {
        //Kullanıcının Girdiği Sayının Negatif mi, Pozitif mi Olduğunu Bulan Java Programı

        int sayi= 12;
        if(sayi<0){
            System.out.println("sayi negatif");
        }else if(sayi>0){
            System.out.println("sayi pozitif");

        }else System.out.println("hatali giris");

    }
}

















/*Scanner reader = new Scanner(System.in);
        System.out.println("Bir sayi giriniz:");
        double sayi = reader.nextInt();

        if (sayi < 0) {
            System.out.println(sayi + "  Negatiftir.");
        } else if (sayi > 0) {
            System.out.println(sayi + " Pozitifitr.");


        } else System.out.println(sayi + " sifirdir.");*/