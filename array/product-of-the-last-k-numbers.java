import java.util.Vector;

public class ProductOfNumbers {

    static Vector<Integer> nums = new Vector<>();
    static int n;

    public ProductOfNumbers() {
        nums.clear();
        n=0;
    }

    static void add(int num) {
        nums.add(num);
        n++;
    }

    static int getProduct(int k) {

        if (k > n)
            return 0;

        int prod = 1;

        for (int i = n - 1; i >= n - k; i--) {
            prod *= nums.get(i);
        }

        return prod;
    }
}