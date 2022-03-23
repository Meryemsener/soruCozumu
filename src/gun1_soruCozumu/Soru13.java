package gun1_soruCozumu;

import java.util.Scanner;

public class Soru13 {
    public static void main(String[] args) {
        /*  TASK :
		 *  Kullanicidan IT alanini bilgisini alarak console'a
		 *  meslegi = qa ==> Quality Analyst
		             dev ==> Developer
					  ba ==> Busines Analyst
				 	  pm ==> Project Manager
		bilgilileri yazdiriniz
		 */
        Scanner scan=new Scanner(System.in);
        System.out.println("qa\ndev\nba\npm\nLutfen mesleginizi giriniz :");
        String jobTitle=scan.next();

        String qa = "Qualty Analyst";
        String dev = "Developer";
        String ba = "Business Analyst";
        String pm = "Project Manager";

        if(jobTitle.equalsIgnoreCase("qa")){
            System.out.println("Mesleginiz: " + qa);
        }else if(jobTitle.equalsIgnoreCase("ba")){
            System.out.println("Mesleginiz: " + ba);
        }else if(jobTitle.equalsIgnoreCase("pm")){
            System.out.println("Mesleginiz: " + pm);
        }else if(jobTitle.equalsIgnoreCase("dev")){
            System.out.println("Mesleginiz: " + dev);
        }else {
            System.out.println("Hatali secim yaptiniz");
        }


    }
}
