class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int c=0;
        int max=0;
        for(int i=0;i<nums.length;i++)
        {
            int a=nums[i];
            if(a==1)
             c++;
            else
            {
                if(c>max)
                max=c;
                c=0;
            }
        }
        if(c>max)
         max=c;
        return max;
    }
}