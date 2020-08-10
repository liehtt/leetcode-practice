class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        
        int i = 0, j = 0;
        int idx = 0;
        
        int[] out = new int[nums1.length];

        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] == nums2[j]) {
                out[idx++] = nums1[i];
                i++;
                j++;
            } else if (nums1[i] < nums2[j]) {
                i++;
            } else {
                j++;
            }
        }
        
        return Arrays.copyOf(out, idx);
    }
}
