class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] a = new int[nums.length];
        int p = 1;
        int c = 0;
        
        // Calculate the product of all non-zero elements and count the zeros
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                p = p * nums[i];
            } else {
                c++;
            }
        }
        
        // If more than one zero, all elements in the result are zero
        if (c > 1) {
            return a; // all elements in 'a' are already zero
        }
        
        // Calculate the result array based on the zero count
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0 && c == 0) {
                a[i] = p / nums[i];
            } else if (nums[i] == 0) {
                a[i] = p; // when there is exactly one zero, only that position gets the product
            } else {
                a[i] = 0; // if there's one zero in the array, all other positions are zero
            }
        }
        
        return a;
    }
}
