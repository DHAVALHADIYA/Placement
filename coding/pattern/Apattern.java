public class Apattern {
    public static void main(String[] args) {

        int a = 5;

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a - i - 1; j++) {
                System.out.print(" ");
            }

            if (i == 0) {
                System.out.print("*");
            } else if (i == a / 2) {
                for (int j = 0; j < a / 2 + 1; j++) {
                    System.out.print("* ");
                }
            } else {
                System.out.print("*");
                for (int j = 0; j < 2 * i - 1; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
