public class Nested {
    public static void main(String []args) {
        int i, j;
        for (i = 1; i < 5; i++) {
            /*for (j = 5; j > i; j--) {
                System.out.print(" ");
            }*/
            for (j = 1; j < i; j++) {
                System.out.print(5);
            }
            System.out.println();
        }
        for (i = 1; i < 5; i++) {
            /*for (j = 1; j < i; j++) {
                System.out.print(" ");
            }*/
            for (j = 5; j > i; j--) {
                System.out.print(5);
            }
            System.out.print("\n");
        }
    }
}