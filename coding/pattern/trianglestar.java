public class trianglestar {
    public static void main(String[] args) {
        int a = 5;

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            if (i == a - 1) {
                System.out.print("*");
            } else if (i == 0) {
                for (int j = 0; j < 2 * a - 1; j++) {
                    System.out.print("*");
                }
            } else {
                System.out.print("*");
                for (int j = 0; j < 2 * a - 2 * i - 3; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
