import java.util.Scanner;
public class ManavKasa {

    public static void main(String[] args){

        //Değişkenleri oluştur.
        double a, e, d, m, p, kasa;

        //Scanner sınfını oluştur.
        Scanner inp = new Scanner(System.in);

        //Kullanıcıdan değerleri al
        System.out.print("Armut kaç kilo?: ");
        a = inp.nextDouble();

        System.out.print("Elma kaç kilo?: ");
        e = inp.nextDouble();

        System.out.print("Domates kaç kilo?: ");
        d = inp.nextDouble();

        System.out.print("Muz kaç kilo?: ");
        m = inp.nextDouble();

        System.out.print("Patlıcan kaç kilo?:");
        p = inp.nextDouble();

        //Kasa tutarını hesapla
        kasa = (a * 2.14) + (e * 3.67) + (d * 1.11) + (m * 0.95) + (p * 5);

        //Tutarı ekrana yazdır.
        System.out.print("Toplam tutar: " + kasa + "TL");

    }
}
