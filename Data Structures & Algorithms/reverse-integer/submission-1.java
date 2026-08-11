class Solution {
    public int reverse(int n) {
        long reverse = 0;
        while (n != 0){
            int digit = n % 10;
            reverse = reverse*10 + digit;
            n = n/10;
        }
        if (reverse < Integer.MIN_VALUE || reverse > Integer.MAX_VALUE){
            return 0;
        }
        return(int)reverse;
        
    }
}
