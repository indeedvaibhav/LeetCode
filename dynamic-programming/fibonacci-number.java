class Solution {

    int[] memory;

    public int fib(int n) {

        memory = new int[n + 1];

        for(int i = 0; i <= n; i++) {
            memory[i] = -1;
        }

        return ans(n);
    }

    int ans(int n) {

        if(n == 0 || n == 1) {
            return n;
        }

        if(memory[n] != -1) {
            return memory[n];
        }

        memory[n] = ans(n - 1) + ans(n - 2);

        return memory[n];
    }
}