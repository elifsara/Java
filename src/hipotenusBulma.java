import java.util.Scanner;
public class hipotenusBulma {
    public static void main(String[] args)
    {
        
        //Değikenleri Oluştur.
        int dikKenar1, dikKenar2;
        double hipotenus;
        
        //Scanner sınıfını tanımlama
        Scanner inp = new Scanner(System.in);
        
        //Kullanıcıdan Değerleri al
        System.out.println("1. Dik Kenar Uzunluğunu Giriniz: ");
        dikKenar1 = inp.nextInt();
        
        System.out.println("2. Dik Kenar Uzunluğunu Giriniz: ");
        dikKenar2 = inp.nextInt();
        
        //Hipotenüsü hesapla
        hipotenus = Math.sqrt((dikKenar1*dikKenar1)+(dikKenar2*dikKenar2));
        System.out.println("Hipotenüs: " + hipotenus);
    }
}
