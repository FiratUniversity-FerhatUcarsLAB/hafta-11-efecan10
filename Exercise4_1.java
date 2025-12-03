ad soyad : efecan önal
numara :250541093

    public class Exercise4_1 {

    public static void printAmerican(String day,String month ,int date , int year) {
        System.out.println(day+", "+month+" "+date+", "+year);
    }
    public static void printEuropean(int date, String month , int year,String day) {
        System.out.println(date+" "+month+" "+year+", "+day);
    }
    public static void main(String[] args) {
        printAmerican("Monday","July",22,2019);
        printEuropean(22,"July",2019,"Monday");
    }
}
