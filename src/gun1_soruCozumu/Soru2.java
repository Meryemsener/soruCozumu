package gun1_soruCozumu;

import java.util.Random;

public class Soru2 {
    public static void main(String[] args) {

        /*Aşağıdaki görüntüyü konsol ekranına yazdıran algoritmayı tasarlayınız.
         *
         * *
         * * *
         * * * *
         * * * * *
         * * * * * *
         * * * * * * *
         * * * * * * * *
         * * * * * * * * *
         * * * * * * * * * *     */

        int input=10;
        for (int i=0; i<=input; i++) {
            System.out.print(" ");
            for(int j=0; j<i; j++) {


            System.out.print(" * ");

            }
            System.out.println(" ");
        }





    }
}



/*int uzunluk = 10;
        for (int i = 0; i < uzunluk; i++) {
            System.out.print("");
            for (int j = 0; j < i; j++) {
                System.out.print("*");

            }
            System.out.println("");
        }
*/