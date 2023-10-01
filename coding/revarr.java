public class revarr {
    public static void main(String[] args) {
        int arr[] = { 2, 4, 1, 7, 3 };

        int start = 0;
        int end = arr.length - 1;

        for (int i = 0; i < arr.length; i++) {
            if (start > end) {
                break;
            }

            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }

        for (int i : arr) {
            System.out.println(i);
        }

    }
}
