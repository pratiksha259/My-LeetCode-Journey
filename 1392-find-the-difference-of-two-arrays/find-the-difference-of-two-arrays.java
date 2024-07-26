class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        HashSet<Integer> hm=new HashSet<>();
        HashSet<Integer> hm2=new HashSet<>();
        for(int i=0;i<nums1.length;i++)
        {
            hm.add(nums1[i]);
        }
        for(int i=0;i<nums2.length;i++)
        {
            hm2.add(nums2[i]);
        }
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> list1=new ArrayList<>();
        for(int i=0;i<nums1.length;i++)
        {
            if(!hm2.contains(nums1[i]))
            {
             if(!list1.contains(nums1[i]))
               list1.add(nums1[i]);
            }
        }
        ans.add(list1);
        List<Integer> list2=new ArrayList<>();
        for(int i=0;i<nums2.length;i++)
        {
            if(!hm.contains(nums2[i]))
            {
              if(!list2.contains(nums2[i]))
                list2.add(nums2[i]);
            }
        }
        ans.add(list2);
        return ans;
    }
}