class Solution {
    public int countPrimeSetBits(int L, int R) {
        int result = 0;
        for (int i = L; i <= R; i++) {
            if(isSmallPrime(Integer.bitCount(i))) {
                result++;
            }
        }
        return result;    
    }
    
    
    public boolean isSmallPrime(int x) {
        if(x == 2 || x == 3 || x == 5 || x == 7 || 
          x == 11 || x == 13 || x == 17 || x == 19) {
            return true;
        }
        
        return false;
    }
}
