import java.util.Scanner;


public class NotOrtalamasi {
    public static void main(String[] args) {

        // Değişken gir Matematik, Fizik, Kimya, Türkçe, Tarih, Müzik
        int  mat , fiz, kim , turkce, tarih , muzık ;

        // Scanner tanımla

        Scanner input = new Scanner(System.in);

        // Kullanıcıdan Değerler al

        System.out.print("Matematik Notunuzu Giriniz :");
        mat = input.nextInt();

        System.out.print("Fizik Notunuzu Giriniz :");
        fiz = input.nextInt();

        System.out.print("Kimya Notunuzu Giriniz :");
        kim = input.nextInt();

        System.out.print("Türkçe Notunuzu Giriniz :");
        turkce = input.nextInt();

        System.out.print("Tarih Notunuzu Giriniz :");
        tarih = input.nextInt();

        System.out.print("Müzik Notunuzu Giriniz :");
        muzık = input.nextInt();

        int toplam = (mat + fiz +kim +turkce + tarih +muzık);
        int sonuc = toplam / 6;
        System.out.println("Ortalamanız:" + sonuc);

        //Boolean koşulu kullanmak

        boolean ortalama =(sonuc >=60);
        String deger = ortalama ? "Sınıfı Geçtiniz" : "Sınıfta Kaldınız";
        System.out.print(deger);






    }
}
