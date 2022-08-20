package TeamProject.manav;

public class Manav {

    public static String[] urunler = {"Domates", "Patates", "Biber", "Sogan", "Havuc", "Elma", "Muz", "Cilek", "Kavun", "Uzum", "Limon"};
    public static double[] fiyat = {2.10, 3.20, 1.5, 2.30, 3.10, 1.20, 1.90, 6.10, 4.30, 2.70, 0.50};
    public static String[] index = {"00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10"};

    public static void List() {
        System.out.println("No          Urun          Fiyat");

        for (int i = 0; i < index.length; i++) {
            System.out.println(index[i] + " " + urunler[i] + " " + fiyat[i]+" TL");
        }
    }

}