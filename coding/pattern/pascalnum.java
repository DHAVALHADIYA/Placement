public class pascalnum {
    public static void main(String[] args) {
        int a = 5;

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a - i - 1; j++) {
                System.out.print(" ");
            }

            if (i == 0) {
                System.out.print("1");
            } else if (i == 1) {
                System.out.print("1 ");
                System.out.print("1 ");
            }else{

            }
            System.out.println();
        }
    }
}
