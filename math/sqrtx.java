class Solution {
    public int mySqrt(int x) {
        if (x < 0) {
            return Double.NaN; 
        }
        if (x == 0 || x == 1) {
            return x;
        }

        double guess = x / 2.0;
        double precision = 0.000001; 
        while (Math.abs(guess * guess - x) > precision) {
            guess = (guess + (x / guess)) / 2.0;
        }
        return guess;
    }
    }
