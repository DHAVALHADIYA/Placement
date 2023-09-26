import java.util.*;

public class motadata {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 5, 3, 1 };

        ArrayList<Integer> rr = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (i != j && arr[i] == arr[j]) {
                    count++;
                }
            }

            if (count >= 1 && !rr.contains(arr[i])) {
                rr.add(arr[i]);
            }
        }

        for (Integer integer : rr) {
            System.out.println(integer);
        }
    }
}
