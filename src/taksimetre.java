import java.util.Scanner;

public class taksimetre {

    public static void main(String[] args)
    {

        //Değişkenleri oluştur.
        double gidilenYol, tutar;

        //Scanner sınıfını tanımla
        Scanner inp = new Scanner(System.in);

        //Kullanıcıdan değerleri al
        System.out.print("Gidlen yol kaç km?: ");
        gidilenYol = inp.nextDouble();

        //Taksimetre tutarını hesapla
        tutar = 10 + gidilenYol * 2.20;

        System.out.print("Ödenecek Tutar:");
        tutar = tutar <= 20 ? 20 : tutar;
        System.out.print(tutar);

    }
}
