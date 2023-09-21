public class dimond {
    public static void main(String[] args) {
        int a = 5;

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < (a - i - 1); j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < (2 * i + 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        int b = a - 1;
        for (int i = 0; i < b; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < b * 2 - i * 2 - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}