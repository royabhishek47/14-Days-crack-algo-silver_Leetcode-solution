//power of two

class Solution {
    public boolean isPowerOfTwo(int n) {
        // take log base 2 of n
        double result = (Math.log(n) / Math.log(2));
        
        // fix double precision errors
        double epsilon = 0.0000000000001d;
        if (Math.abs(result - (int) result) < epsilon) result = (int) result;
        
        // check that number is whole
        return result == (int) result;
    }
}