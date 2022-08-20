package TeamProject.manav;

public class Market {
    public static String [] urunler={"Cikolata","Nutella","Sakiz","Ekmek","Yumurta","Zeytin","Peynir","Cips","Makarna","Cay","Seker"};
    public static double [] fiyat={4.10,8,2,45,55,20,10,6.05,5.80,6.70,2};
    public static String [] index={"00","01","02","03","04","05","06","07","08","09","10"};


    public static void List() {
        System.out.println("No          Urun          Fiyat");

        for (int i = 0; i < index.length; i++) {
            System.out.println(index[i] + " " + urunler[i] + " " + fiyat[i]+" TL");
        }
    }

}
