public class rotatearray {
    public static void main(String[] args) {
        // int[] arr = { 2, 4, 2, 5, 1, 6, 7 };
        int[] arr = { 2 };
        int[] arr1 = new int[arr.length];

        if (arr.length == 0) {
            arr1[0] = arr[0];
        }
        for (int i = 0; i < arr.length; i++) {
            arr1[i] = arr[(i + arr.length - 1) % arr.length];
        }

        for (int i : arr1) {
            System.out.print(i);
        }
    }
}
