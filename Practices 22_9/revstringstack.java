import java.util.*;

public class revstringstack {
    public static void main(String[] args) {

        String str = "dhaval";
        String rev_str = "";

        Stack<Character> st = new Stack<>();

        if (str.length() == 1) {
            rev_str = str;
        }

        for (int i = 0; i < str.length(); i++) {
            st.push(str.charAt(i));
        }

        for (int i = 0; i < str.length(); i++) {
            rev_str += st.pop();
        }

        System.out.println(rev_str);

    }
}
