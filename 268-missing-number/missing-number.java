class Solution {
    public int missingNumber(int[] nums) {
        int l=nums.length;
        int[] a=new int[l+1];
        Arrays.fill(a,-1);
        for(int i=0;i<l;i++)
        {
            a[nums[i]]=nums[i];
        }
        for(int i=0;i<a.length;i++)
        {
            if(a[i]==-1)
             return i;
        }
        return 0;
    }
}