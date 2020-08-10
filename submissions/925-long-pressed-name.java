class Solution {
    public boolean isLongPressedName(String name, String typed) {
        
        char[] na = name.toCharArray();
        char[] ta = typed.toCharArray();
        
        if (na[0] != ta[0] || na[na.length - 1] != ta[ta.length - 1]) {
            return false;
        }
        
        int idx = 0;
        
        for (int i = 0; i < ta.length; i++) {
            if (ta[i] == na[idx]) {
                if (idx < na.length - 1) {
                    idx++;                     
                }
            } else {
                if (ta[i] != na[idx - 1]) {
                    return false;
                }
            }
        }
        
        return true;
    }
}
