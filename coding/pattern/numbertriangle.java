public class numbertriangle {
    public static void main(String[] args) {
        int a = 5;
        int count = 1;

        for (int i = 0; i < a; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(count + " ");
                count++;
            }
            System.out.println();
        }
    }
}
