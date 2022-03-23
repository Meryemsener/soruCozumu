package gun1_soruCozumu;

import java.util.Scanner;

public class Soru15 {
    public static void main(String[] args) {
        //TASK :  Kullanıcıdan aldığınız koordinat noktasının hangi
        // bölgede olduğunu yazdıran bir kod yazınız.

        Scanner scan = new Scanner(System.in);
        System.out.println("X ve Y degerlerini giriniz");
        int x = scan.nextInt();
        int y = scan.nextInt();
        if (x>0 && y>0){
            System.out.println("girdiginiz degerler 1. bölgeye ait");
        }else if (x<0 && y>0){
            System.out.println("girdiginiz degerler 2. bölgeye ait");
        }else if (x<0 && y<0){
            System.out.println("girdiginiz degerler 3. bölgeye ait");
        }else if (x>0 && y<0){
            System.out.println("girdiginiz degerler 4. bölgeye ait");
        }else if (x!=0 && y==0){
            System.out.println("girdiginiz degerler x ekseni uzerinde");
        }else if (x==0 && y!=0){
            System.out.println("girdiginiz degerler y ekseni uzerinde");
        }else System.out.println("girdiginiz degerler orjin'dedir");

    }
}
