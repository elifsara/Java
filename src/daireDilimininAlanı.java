import java.util.Scanner;
public class daireDilimininAlanı {
    public static void main(String[] args) {

        //Değişkenleri oluştur.
        int r, a;
        double pi = 3.14, alan;

        //Scanner sınıfını tanımla
        Scanner inp = new Scanner(System.in);

        //Kullanıcıdan değerleri al
        System.out.print("Daire diliminin yarıçap uzunluğu: ");
        r = inp.nextInt();

        System.out.print("Darie diliminin merkez açısı: ");
        a = inp.nextInt();

        //Darie diliminin alanını hesapla
        alan = (pi * ( r * r ) * a ) / 360;
        System.out.print("Darie diliminin alanı: " + alan);


    }
}
