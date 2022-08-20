package TeamProject.manav;

import java.util.Scanner;

public class Odeme {

    public static void odeme () {
        Scanner scan=new Scanner(System.in);

        System.out.println("Kartin uzerindeki isim: ");
        String isim=scan.nextLine();
        String kartNo;

        do {
            System.out.println("Kart numarasi: ");
            kartNo=scan.next();
            if (kartNo.length()!=16) {
                System.out.println("Kart numarasi 16 haneli olmalidir!");
            }

        } while (kartNo.length()!=16);

        scan.nextLine(); // dummy hata cozumu

        System.out.println("Son Kullanma Tarihi (aa/yy): ");
        String kartTarihi1=scan.nextLine();


        System.out.println("CVC kodu: ");
        int cvcNo=scan.nextInt();

        System.out.println("Onay kodunuzu giriniz: ");
        int onayKodu=scan.nextInt();

        System.out.println("Odemeniz tamamlanmistir. Keyifli gunler dileriz... ");


    }
}