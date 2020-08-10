class Solution {
    public boolean hasAlternatingBits(int n) {
        if (n == 1) { return true; }
        int r;
        while(true) {
            r = n & 1;
            n >>>= 1;
            if (n == 0) {
                break;
            }
            if((n & 1) == r) {
                return false;
            }
        }
        return true;
    }
}
