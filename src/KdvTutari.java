import java.util.Scanner;
class KdvTutari {
    public static void main(String[] args)
    {
        //Değişkenleri oluştur
        float  kdvsizFiyat;

        //Scanner sınfını tanımlama
        Scanner inp = new Scanner(System.in);

        //Kullanıcıdan Değer al
        System.out.println("KDV'siz Fiyat: ");
        kdvsizFiyat = inp.nextFloat();

        //KDV Tutarını hesapla
        double kdvTutari = kdvsizFiyat <= 1000 ? kdvsizFiyat * 0.18 : kdvsizFiyat * 0.08;
        double kdvliFiyat = kdvsizFiyat + kdvTutari;
        System.out.println("KDV'li Fiyat: " + kdvliFiyat);
        System.out.println("KDV Tutarı: " + kdvTutari);

    }
}