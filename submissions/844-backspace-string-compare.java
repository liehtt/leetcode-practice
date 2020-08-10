class Solution {
    public boolean backspaceCompare(String S, String T) {
        
        char[] as = S.toCharArray();
        char[] at = T.toCharArray();
        
        int ns = numAl(as);
        int nt = numAl(at);
        
        if (ns != nt) return false;
        
        for (int i = ns - 1; i >= 0; i--) {
            if (as[i] != at[i]) return false;
            
        }
        
        return true;
    }
    
    private int numAl(char[] arr) {
        
        int n = 0;
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == '#') {
                if (n > 0) n--;
            } else {
                arr[n++] = arr[i];         
            }
        }
        
        return n;
    }
}
