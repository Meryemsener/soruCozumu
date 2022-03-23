package gun1_soruCozumu;

import java.util.Scanner;

public class q4 {
    public static void main(String[] args) {
        /* TASK :
        Kullanıcıdan 5 adet sayı isteyiniz
        Bu sayılardan 5 ile 10 arasındakiler hariç, diğerlerinin toplamını bulunuz.
        */
        Scanner sc=new Scanner(System.in);

        int toplam=0;
        for(int i=1;i<=5;i++){ // 5 kez sayı isteme  kontrolu

            System.out.print("Bir sayı giriniz : ");
            int sayi=sc.nextInt();

            if (sayi>5 && sayi<10) // 5 ile 10 arası-> 6,7,8,9
            {
                System.out.println("girdiğiniz sayı 5 ile 10 arası olduğundan isleme girmeyecek");
                continue;
            }

            toplam+=sayi;
        }

        System.out.println("girdiginiz sayilarin toplamı :" + toplam);
    }
}
