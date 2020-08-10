class Solution {
    public int findComplement(int num) {
        int result = 0;
        for(int i = 0; i < 32; i++) {
            if(num != 0) {
                result += ((num&1^1) << i);
            } else {
                return result;
            }
            num >>>= 1;
        }
        
        return result;
    }
}
