class Solution {
    public boolean increasingTriplet(int[] nums) {
        if (nums.length < 3) {
            return false;
        }
        
        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;
        
        for (int num : nums) {
            if (num <= first) {
                first = num; // update the smallest value
            } else if (num <= second) {
                second = num; // update the second smallest value
            } else {
                return true; // found a value greater than both first and second
            }
        }
        
        return false; // no increasing triplet found
    }
}
