package TeamProject.manav;

import java.util.Arrays;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double sepetToplam=0;
        double toplam=0;
        String urunIsmi="";
        double fiyat=0;
        int tercih;
        int index;
        String urun;
        double miktar;
        String cevap;
        String sepet="";
        do {
            System.out.println("Hangi kategoride alisveris yapacaksiniz? ");
            System.out.println("        1 manav\n" +
                    "        2 sarkuteri \n" +
                    "        3 market ");


            do {
                tercih = scan.nextInt();
                if (tercih > 3 || tercih <= 0) {
                    System.out.println("Lutfen gecerli bir sayi giriniz! ");
                }
            } while (!(tercih > 0 && tercih <= 3));

            switch (tercih) {
                case 1:
                    Manav.List();
                    break;
                case 2:
                    Sarkuteri.List();
                    break;
                case 3:
                    Market.List();
                    break;
            }

            System.out.println("Lutfen listeden iki rakamli urun numarasi giriniz: ");


            do {
                urun = scan.next();
                if (urun.contains("\\D") || Arrays.binarySearch(Manav.index, urun) < 0) {
                    System.out.println("Gecerli bir urun numarasi giriniz!");
                } else break;

            } while (true);

            index = Integer.parseInt(urun);
            System.out.println("Kac kg/adet istiyorsunuz? ");
            miktar = scan.nextDouble();


            switch (tercih) {
                case 1:
                    urunIsmi = Manav.urunler[index];
                    fiyat = Manav.fiyat[index];
                    break;
                case 2:
                    urunIsmi = Sarkuteri.urunler[index];
                    fiyat = Sarkuteri.fiyat[index];
                    break;
                case 3:
                    urunIsmi = Market.urunler[index];
                    fiyat = Market.fiyat[index];
                    break;
            }


            toplam = (fiyat * miktar);
            sepetToplam+=toplam;
            sepet=urunIsmi+ " x " + miktar + " = "+toplam + " TL \n" + sepet;


            System.out.print(sepet);
            System.out.println("Sepet Toplam: " +sepetToplam);
            System.out.println("Alisverise devam etmek istiyor musunuz? Evet/Hayir");
            cevap = scan.next().toLowerCase();


        } while (cevap.equals("evet"));
        sepet+="Urunlerin Genel Toplami: "+ sepetToplam;
        System.out.println(sepet);

        System.out.println("Odenecek tutar: "+sepetToplam);

        Odeme.odeme();




    }

}
