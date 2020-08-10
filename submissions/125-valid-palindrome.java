class Solution {
    public boolean isPalindrome(String s) {
        
        if (s.length() == 0) {
            return true;
        }
        
        int i = 0; 
        int j = s.length() - 1;
        
        String sc = s.toLowerCase();
        
        while (i < j) {
            if(!Character.isLetterOrDigit(sc.charAt(i))) {
                i++; continue;
            } else if (!Character.isLetterOrDigit(sc.charAt(j))) {
                j--; continue;
            } else if (sc.charAt(i) != sc.charAt(j)) {
                return false;
            }
            
            i++; j--;
        }
        
        return true;
    }
    
}
