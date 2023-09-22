import java.util.*;

public class nextbigstack {
    public static void main(String[] args) {
        int arr[] = { 2, 45, 24, 25, 67, 273, 2560 };

        HashMap<Integer, Integer> hash = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int count = i + 1;

            if (i == arr.length - 1) {
                hash.put(arr[i], -1);
            }

            if (count < arr.length) {
                while (arr[i] > arr[count]) {
                    count++;
                }
                hash.put(arr[i], arr[count]);
            }

        }
        for (int i = 0; i < hash.size(); i++) {
            System.out.println(arr[i] + " -> " + hash.get(arr[i]));
        }
        // System.out.println(hash);

    }
}
