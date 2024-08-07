class Solution {
    public void moveZeroes(int[] nums) {
        int j=0;
      //  int j=nums.length-1;
        for (int i=0;i<nums.length;i++)
        {
           if(nums[i]!=0)
           {
            nums[j]=nums[i];
            j++;
           }
        }
        for(int i=j;i<nums.length;i++)
        {
            nums[i]=0;
        }
        return;
    }
}