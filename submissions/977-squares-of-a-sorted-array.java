class Solution {
    public int[] sortedSquares(int[] A) {
        int c = A.length - 1;
        int i = 0;
        int j = c;
        int[] arr = new int[c+1];
        
        while(i <= j) {
            int s1 = A[i]*A[i];
            int s2 = A[j]*A[j];
            if(s1 <= s2) {
                arr[c--] = s2;
                j--;
            } else if (s1 > s2) {
                arr[c--] = s1;
                i++;
            } 
        }
        
        return arr;
        
    }
}
