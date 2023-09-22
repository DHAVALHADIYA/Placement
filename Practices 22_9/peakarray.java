public class peakarray {
    public static void main(String[] args) {
        // int[] arr = { 2, 1, 1, 2, 3, 9, 5 , 7 , 3};
        int[] arr = { 2, 3 };
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {
                continue;
            } else if (i == arr.length - 1) {
                break;
            } else if (arr.length == 0 || arr.length == 1 || arr.length == 2) {
                break;
            } else {
                if (arr[i - 1] < arr[i] && arr[i] > arr[i + 1]) {
                    count++;
                    System.out.println("the peak element is " + arr[i]);
                }
            }
        }

        if (count == 0) {
            System.out.println("there is not peak element");
        }
    }

}
