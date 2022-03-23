package gun1_soruCozumu;

import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class Soru10 {
    public static void main(String[] args) {
        /* TASK :
         * Kullanicidan alacaginiz iki sayiyi yine kullaniciya sectireceginiz
         *  dort islemden biri ile isleme koyup sonucun yazdiriniz
         */
         Scanner scan=new Scanner(System.in);
        System.out.println("toplama icin 1'i, cikarma icin 2'yi, bolme icin 3'u, carpma icin 4'u secin");
       int islemIsareti= scan.nextInt();

        System.out.println("iki tam sayi giriniz");
        int sayi1= scan.nextInt();
        int sayi2= scan.nextInt();

        switch (islemIsareti){
            case 1:
                System.out.println(sayi1+sayi2);break;
            case 2:
                System.out.println(sayi1-sayi2);break;
            case 3:
                System.out.println(sayi1/sayi2);break;
            case 4:
                System.out.println(sayi1*sayi2);break;
                default: System.out.println("hatali giris");
        }
    }
}












/*Scanner scan=new Scanner(System.in);
        System.out.println(" toplama için 1\n çikarma için 2\n bolme için 3\n çarpma için 4");
        int islem=scan.nextInt();
        System.out.println("Lutfen iki tam sayi giriniz");

        double num1=scan.nextDouble();
        double num2=scan.nextDouble();
        if(islem==1){
            System.out.println("toplama işleminin sonucu :" + num1 + " + " + num2 + " = " + (num1 + num2));
        }else if(islem==2){
            System.out.println("cıkarma işleminin sonucu :" + num1 + " - " + num2 + " = " + (num1 - num2));
        }else if(islem==3){
            System.out.println("bolme işleminin sonucu :" + num1 + " / " + num2 + " = " + (num1 / num2));
        }else if(islem==4){
            System.out.println("carpma işleminin sonucu :" + num1 + " x " + num2 + " = " + (num1 * num2));
        }else System.out.println("Hatali secim yaptiniz.Tekrar deneyin");*/