import java.util.Scanner;

public class ucgendeAlanHesabi {
    public static void main(String[] args)
    {
        //Değişkenleri Oluştur.
        int a, b, c, cevre;
        double alan;

        //Scanner sınıfını tanımla
        Scanner inp = new Scanner(System.in);

        //Kullanıcıdan değerleri al
        System.out.print("1. Kenar Uzunluğu: ");
        a = inp.nextInt();

        System.out.print("2.Kenar Uzunluğu: ");
        b = inp.nextInt();

        System.out.print("3. Kenar Uzunluğu: ");
        c = inp.nextInt();

        //Üçgenin Çevresini Hesapla
        cevre = a + b + c;

        //U değerini hesapla
        double u = cevre / 2;

        //Üçgenin alanını hesapla
        alan = Math.sqrt(u * (u - a) * (u - b) * (u - c) );

        //Sonucu ekrana yazdır.
        System.out.print("Alan: " + alan);

    }
}
