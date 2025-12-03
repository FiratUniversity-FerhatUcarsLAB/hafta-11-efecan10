ad soyad : efecan önal
numara :250541093
import java.util.Scanner;

public class TarihYazdirma {

    // Amerikan tarih formatını yazdıran metot: Ay Gün, Yıl
    public static void printAmerican(String day, int date, String month, int year) {
        System.out.println(day + ", " + month + " " + date + ", " + year);
    }

    // Avrupa tarih formatını yazdıran metot: Gün Ay Yıl
    public static void printEuropean(String day, int date, String month, int year) {
        System.out.println(day + " " + date + " " + month + " " + year);
    }

    public static void main(String[] args) {
        String day = "Monday";
        String month = "July";
        int date = 22;
        int year = 2019;

        printAmerican(day, date, month, year);
        printEuropean(day, date, month, year);

        Scanner scanner = new Scanner(System.in);

        try {
            // Kullanıcıdan bilgi isteme
            System.out.print("Haftanın gününü girin (ör: Tuesday): ");
            String userDay = scanner.nextLine();

            System.out.print("Ay adını girin (ör: November): ");
            String userMonth = scanner.nextLine();

            System.out.print("Ayın kaçıncı günü olduğunu girin (ör: 14): ");
            int userDate = scanner.nextInt();

            System.out.print("Yılı girin (ör: 2025): ");
            int userYear = scanner.nextInt();

            // Kullanıcı girdileriyle metot çağrıları
            printAmerican(userDay, userDate, userMonth, userYear);
            printEuropean(userDay, userDate, userMonth, userYear);

        } catch (java.util.InputMismatchException e) {
            System.err.println("Hata: Lütfen tarih ve yıl için geçerli bir sayı girin.");
        } finally {
            scanner.close();
        }
    }
}    

çıktı 
    Monday, July 22, 2019
Monday 22 July 2019
Haftanın gününü girin (ör: Tuesday): Tuesday
Ay adını girin (ör: November): November
Ayın kaçıncı günü olduğunu girin (ör: 14): 14
Yılı girin (ör: 2025): 2025
Tuesday, November 14, 2025
Tuesday 14 November 2025
