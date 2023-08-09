import java.util.Scanner;
public class vucutKitleIndeksi {

    public static void main(String[] args){

        //Değişkenleri oluştur
        double boy, kilo, vkIndeksi;

        //Scanner sınıfını tanımla
        Scanner inp = new Scanner(System.in);

        //Kullanıcıdan verileri al
        System.out.print("Boyunuzu giriniz(m): ");
        boy = inp.nextDouble();

        System.out.print("Kilonuzu giriniz(kg): ");
        kilo = inp.nextDouble();

        //VKİndeksini hesapla
        vkIndeksi = kilo / ( boy * boy );

        //Sonucu ekrana yazdır
        System.out.print("Vücut Kitle Endeksiniz: " + vkIndeksi);

    }
}
