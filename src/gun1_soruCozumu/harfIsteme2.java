package gun1_soruCozumu;

public class harfIsteme2 {
    public static void main(String[] args) {
        String str = "omer tarik";
        //String newStr= str.concat("!..");//eklemek istedigini concat ile eklersin
        //bunu '+' da kullanabilirsin ama o zaman concat() methodu yaratilmis olmaz
        //birden fazla concat ekleyebilirsin
        //String newStr= str.concat("!..").concat("wooouw");
        String newStr = str.concat("!...").concat("wooouw");
        System.out.println(newStr);

        boolean hangisiyleBitiyor = str.endsWith("n");//str.endsWith yazinca methodun basina boolean mi, string mi gelmeli intellij sana soyluyor
        System.out.println(hangisiyleBitiyor);//cumle n ile bitmiyorsa false doner

        boolean baslangicHarfi = str.startsWith("o");
        System.out.println(baslangicHarfi);
        //bastaki karakterleri atla ve  5. karakter t mi kontrol et
        boolean isTheFortf = str.startsWith("t", 5);
        System.out.println(isTheFortf);


    }
}
