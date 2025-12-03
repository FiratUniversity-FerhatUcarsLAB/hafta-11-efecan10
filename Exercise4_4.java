ad soyad : efecan önal
numara :250541093

    public class Exercise4_4 {

    public static int getNumber() {
        return 42;
    }

    public static void sayHello() {
        System.out.println("hello");
    }

    public static void main(String[] args) {

        // 1) Donus degerini kullanmayin -> ne oluyor?
        getNumber();
        // CEVAP 1: Kod hatasiz calisir (Compiles and runs fine).
        // Metot gorevini yapar ama donen 42 degeri havada kalir (bosa gider),
        // cunku bir degiskene atamadik veya ekrana yazdirmadik.


        // 2) void metodu ifade icinde kullanin -> ne oluyor?
        // System.out.println(sayHello() + 7);
        // CEVAP 2: Bu satir acilirsa DERLEME HATASI verir (Compiler Error).
        // Cunku 'void' metotlar geriye bir sayi veya deger dondurmez.
        // Hata: "operator + cannot be applied to void" (Void ile sayi toplanamaz).
    }
}
