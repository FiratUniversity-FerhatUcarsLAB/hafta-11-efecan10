ad soyad : efecan önal
numara :250541093

    public class Exercise4_6_Multadd {

    // 1. GOREV: multadd metodunu yazmak
    // Islem: a * b + c
    public static double multadd(double a, double b, double c) {
        return a * b + c;
    }

    // 2. GOREV: expSum metodunu yazmak
    // Formul: x * e^(-x) + kok(1 - e^(-x))
    // Bunu multadd kullanarak yapiyoruz:
    // a = x
    // b = e^(-x)
    // c = kok(1 - e^(-x))
    public static double expSum(double x) {
        double a = x;
        double b = Math.exp(-x);      // e uzeri -x
        double c = Math.sqrt(1 - b);  // kok icinde (1 - e uzeri -x)

        return multadd(a, b, c);
    }

    public static void main(String[] args) {

        // --- TEST 1: Basit Test ---
        System.out.println("Basit test (1*2+3): " + multadd(1.0, 2.0, 3.0));

        // --- TEST 2: Trigonometri ---
        // Istenen: sin(pi/4) + (cos(pi/4) / 2)
        // multadd mantigina oturtalim: a * b + c
        // a = cos(pi/4)
        // b = 0.5 (yani 1/2 ile carpmak)
        // c = sin(pi/4)
        // Boylece: cos * 0.5 + sin olur.
        double a1 = Math.cos(Math.PI / 4.0);
        double b1 = 0.5;
        double c1 = Math.sin(Math.PI / 4.0);
        double resultTrig = multadd(a1, b1, c1);
        System.out.println("Trigonometri sonucu: " + resultTrig);

        // --- TEST 3: Logaritma ---
        // Istenen: log(10) + log(20)
        // multadd mantigi: a * b + c
        // a = 1.0
        // b = log(10)
        // c = log(20)
        // Not: Java'da Math.log -> dogal logaritma (ln), Math.log10 -> log taban 10
        double a2 = 1.0;
        double b2 = Math.log10(10);
        double c2 = Math.log10(20);
        double resultLog = multadd(a2, b2, c2);
        System.out.println("Logaritma sonucu: " + resultLog);

        // --- TEST 4: expSum Metodu ---
        // x = 2 olsun ornek olarak
        System.out.println("expSum(2) sonucu: " + expSum(2.0));
    }
}
