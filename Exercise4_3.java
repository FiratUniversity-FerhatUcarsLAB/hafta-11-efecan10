ad soyad : efecan önal
numara :250541093

    public class Exercise4_3 {

    public static void zoop() {
        baffle();
        System.out.print("You wugga ");
        baffle();
    }

    public static void main(String[] args) {
        System.out.print("No, I ");
        zoop();
        System.out.print("I ");
        baffle();
    }

    public static void baffle() {
        System.out.print("wug");
        ping();
    }

    public static void ping() {
        System.out.println(".");
    }
}
/* ===================================================================
CEVAPLAR
===================================================================

SORU 1: STACK DIAGRAM (Ping ilk kez cagrilinca)
-----------------------------------------------
| ping (args: yok)            |  <-- Su an calisan (Active)
|-----------------------------|
| baffle (args: yok)          |
|-----------------------------|
| zoop (args: yok)            |
|-----------------------------|
| main (args: String[] args)  |
|-----------------------------|


SORU 2: CIKTI (OUTPUT)
-----------------------------------------------
No, I wug.
You wugga wug.
I wug.

*/
