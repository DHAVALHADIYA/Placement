public class even_odd_sum {
    public static void main(String[] args) {
        long start = 1;
        long end = 100000;

        for (long i = 0; i < 1000; i++) {
            equalssum(i);
        }
    }

    public static void equalssum(long a) {
        long b = a;
        long odd_sum = 0;
        long even_sum = 0;

        int count = 0;

        while (a > 0) {
            long rem = a % 10;
            if (count % 2 == 0) {
                even_sum = even_sum + rem;
            } else {
                odd_sum = odd_sum + rem;
            }
            count++;
            a = a / 10;
        }

        if (odd_sum == even_sum) {
            System.out.println("even digits and odd digits sum is equals " + b);
        }

    }
}