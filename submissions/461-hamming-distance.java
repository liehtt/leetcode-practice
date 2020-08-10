class Solution {
    public int hammingDistance(int x, int y) {
        
        int z = x ^ y;
        
        int result = 0;
        
        while(z != 0) {
            result += 1;
            z &= (z - 1);
        }
        
        return result;
    }
}
