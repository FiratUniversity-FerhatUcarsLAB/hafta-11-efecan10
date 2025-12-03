ad soyad : efecan önal
numara :250541093

  public class Exercise4_2 {

    // Main her zaman başlangıç noktasıdır (1)
    public static void main(String[] args) {                 // 1
        zippo("rattle", 13);                                 // 2
    }                                                        // 17

    public static void baffle(String blimp) {                // 7
        System.out.println(blimp);                           // 8
        zippo("ping", -5);                                   // 9
    }                                                        // 14

    // Bu metod 2 kez çağrıldığı için giriş satırına iki numara verdik (3 ve 10)
    public static void zippo(String quince, int flag) {      // 3, 10
        if (flag < 0) {                                      // 4, 11
            System.out.println(quince + " zoop");            // 12
        } else {                                             //
            System.out.println("ik");                        // 5
            baffle(quince);                                  // 6
            System.out.println("boo-wa-ha-ha");              // 15
        }
    }                                                        // 13, 16
}
