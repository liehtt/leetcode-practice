public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        for(int i = 0; i < 16; i++) {
            n = swapBits(n, i, 31 - i);
        }
        return n;
    }
    
    public int swapBits(int x, int i, int j) {
        if( ((x >>> i)&1) != ((x >>> j)&1) ) {
            int bitMask = 1 << i | 1 << j;
            x ^= bitMask;
        }
        return x;
    }
}
