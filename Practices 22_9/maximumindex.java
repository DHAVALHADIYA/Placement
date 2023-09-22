public class maximumindex {
    public static void main(String[] args) {

        int[] arr = { 34, 8, 10, 3, 2, 80, 30, 33, 1 };
        int diff = 0;
        for (int i = 0; i < arr.length; i++) {
            int last = 0;
            int diff_i_j = 0;
            for (int j = arr.length - 1; j >= 0; j--) {
                if (arr[i] < arr[j]) {
                    last = j;
                    break;
                }
            }
            diff_i_j = last - i;
            if (diff_i_j > diff) {
                diff = diff_i_j;
            }

        }

        System.out.println(diff);
    }
}