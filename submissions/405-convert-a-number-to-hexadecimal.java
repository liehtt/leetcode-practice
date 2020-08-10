class Solution {
    public String toHex(int num) {
        if(num == 0) {return "0";}
        final String s = "0123456789abcdef";
        
        String result = "";
        while(num != 0) {
            result = s.charAt(num&15) + result; 
            num >>>= 4;
        }
        
        return result;
    }
}
