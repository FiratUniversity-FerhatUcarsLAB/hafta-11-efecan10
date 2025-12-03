ad soyad : efecan önal
numara :250541093

    public class Exercise4_5 {

    public static void zoop(String fred, int bob) {
        System.out.println(fred);
        if (bob == 5) {
            ping("not ");
        } else {
            System.out.println("!");
        }
    }

    public static void main(String[] args) {
        int bizz = 5;
        int buzz = 2;
        zoop("just for", bizz);
        clink(2 * buzz);
    }

    public static void clink(int fork) {
        System.out.print("It's ");
        zoop("breakfast ", fork);
    }

    public static void ping(String strangStrung) {
        System.out.println("any " + strangStrung + "more ");
    }
}
/*
OUTPUT:
just for
any not more
It's breakfast
!

STACK & VARIABLES:
1. main method:
   - bizz = 5
   - buzz = 2

2. zoop method (Called twice):
   - 1st call: fred = "just for", bob = 5
   - 2nd call: fred = "breakfast ", bob = 4

3. ping method:
   - strangStrung = "not "

4. clink method:
   - fork = 4
*/
