class Solution {
    public String reverseVowels(String s) {
        
        char[] cs = s.toCharArray();
        Character[] arr = {'a','e','i','o','u','A','E','I','O','U'};
        
        HashSet<Character> set = new HashSet<>(Arrays.asList(arr));
        
        
        int i = 0;
        int j = s.length() - 1;
        
        
        
        while (i <= j) {
            if (set.contains(cs[i]) && set.contains(cs[j])) {
                char temp = cs[j];
                cs[j--] = cs[i];
                cs[i++] = temp;
            } else if (set.contains(cs[i])) {
                j--;
            } else if (set.contains(cs[j])) {
                i++;
            } else {
                j--;
                i++;
            }
        }
        
        return String.valueOf(cs);
    }
}
