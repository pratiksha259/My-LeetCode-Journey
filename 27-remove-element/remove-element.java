class Solution {
    public int removeElement(int[] nums, int val) {
        int index = 0;  // To track where to place non-val elements

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[index] = nums[i];  // Place the non-val element at the current index
                index++;
            }
        }
        
        // 'index' now represents the new length of the modified array (k)
        return index;
    }
}
