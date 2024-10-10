class Solution {
    public int searchInsert(int[] nums, int target) {
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==target)
             return i;
        }
        int i=0;
        while( i<nums.length && nums[i]<target )
        {
           i++;
        }
        return i;
    }
}