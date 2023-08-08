import java.util.Scanner;

public class NotOrtalamasi {
    public static void main(String[] args){
        // Değişkenleri oluştur.
        int mat, fizik, kimya, turkce, tarih, muzik;

        //scanner sınıfını tanımlama
        Scanner inp = new Scanner(System.in);

        // Kullanıcıdan değeleri al
        System.out.print("Matematik Notunuz: ");
        mat = inp.nextInt();

        System.out.print("Fizik Notunuz: ");
        fizik = inp.nextInt();

        System.out.print("Kimya Notunuz: ");
        kimya = inp.nextInt();

        System.out.print("Türkçe Notunuz: ");
        turkce = inp.nextInt();

        System.out.print("Tarih Notunuz: ");
        tarih = inp.nextInt();

        System.out.print("Müzik Notunuz: ");
        muzik = inp.nextInt();

        int toplam = (mat + fizik + kimya + turkce + tarih + muzik);
        double ortalama = toplam / 6.0;
        System.out.println("Ortalamanız: " + ortalama);

        String sonuc = ortalama >= 60 ? "Geçti" : "Kaldı";
        System.out.println(sonuc);
    }
}
