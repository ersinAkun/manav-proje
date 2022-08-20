package TeamProject.manav;

public class Sarkuteri {
    public static String [] urunler={"Kiyma","Tavuk","Pastirma","Sucuk","Salam","Sosis","Kavurma","Et","Füme","Antrikot","But"};
    public static double [] fiyat={3.10,5,2,3,35,120,190,6.10,5.30,5.70,1.50};
    public static String [] index={"00","01","02","03","04","05","06","07","08","09","10"};

    public static void List() {
        System.out.println("No          Urun          Fiyat");

        for (int i = 0; i < index.length; i++) {
            System.out.println(index[i] + " " + urunler[i] + " " + fiyat[i]+" TL");
        }
    }


}
