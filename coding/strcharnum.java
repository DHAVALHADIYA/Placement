import java.util.*;

public class strcharnum {
    public static void main(String[] args) {
        String name = "dhavaljinkal";

        HashMap<Character, Integer> hash = new HashMap<>();

        for (int i = 0; i < name.length(); i++) {
            Integer val = hash.get(name.charAt(i));
            if (val == null) {
                hash.put(name.charAt(i), 1);
            } else {
                hash.put(name.charAt(i), val + 1);
            }
        }
        System.out.println(hash);
    }
}
