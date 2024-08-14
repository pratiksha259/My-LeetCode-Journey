class Solution {
    public int removeDuplicates(int[] nums) {
        LinkedHashSet<Integer> hs=new LinkedHashSet<>();
        for(int i=0;i<nums.length;i++)
        {
            hs.add(nums[i]);
        }
        int ind =0;
        for(int i:hs)
        {
            nums[ind]=i;
            ind++;
        }
        return hs.size();
    }
}