package gun1_soruCozumu;


import java.util.Scanner;

public class q11SoruCozumu {
    /*
Bakıye (başlangıç bakıyesi 1000 tl) öğrenme, para yatırma
ve cekme, çıkış işlemlerinin yapıldıgı bir
ATM app. method create ediniz
*/
    static int bakiye = 1000;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("MENU :\n Bakiye Sorgulama: 1\n Para Cekme : 2\n Para Yatirma : 3\n Cikis : 4 ");

        secim();

    }

    private static void secim() {
        System.out.println("Yapacaginiz islemi seciniz : ");
        int secim = sc.nextInt();
        switch (secim) {
            case 1:
                bakiyeSorgulama();
            case 2:
                paraCekme();
            case 3:
                paraYatirma();
            case 4:
                cikis();
                break;
        }

    }


    private static void paraYatirma() {
        System.out.println("Yatirmak istediginiz miktari giriniz : ");
        int yatirilacakMiktar = sc.nextInt();
        if (yatirilacakMiktar > bakiye) {
            System.out.println("Paraniz hesaba yatirildi");
        } else {
            bakiye += yatirilacakMiktar;
            System.out.println("bekiyeniz " + bakiye + " tl dir");
        }
        System.out.println("isleme devam etmek istiyorsaniz 1\n islemi devam etmek istemiyorsaniz 2\n");
        int karar = sc.nextInt();
        if (karar == 1) {
            secim();
        } else cikis();
    }

    private static void paraCekme() {
        System.out.println("Cekmek istediginiz miktari giriniz : ");
        int cekilecekMiktar = sc.nextInt();
        if (cekilecekMiktar > bakiye) {
            System.out.println("Bakiyenizden fazla miktar girisi yaptiniz");
        } else {
            bakiye -= cekilecekMiktar;
            System.out.println(cekilecekMiktar + " tl para cektiniz");
        }
        System.out.println("isleme devam etmek istiyorsaniz 1\n islemi devam etmek istemiyorsaniz 2\n");
        int karar = sc.nextInt();
        if (karar == 1) {
            secim();
        } else cikis();
    }

    private static void bakiyeSorgulama() {
        System.out.println("Bakiyeniz : " + bakiye);
        System.out.println("isleme devam etmek istiyorsaniz 1\n islemi devam etmek istemiyorsaniz 2\n");
        int karar = sc.nextInt();
        if (karar == 1) {
            secim();
        } else cikis();

    }

    private static void cikis() {
        System.out.println("islem basariyla sonlandirilmistir");

    }

}


