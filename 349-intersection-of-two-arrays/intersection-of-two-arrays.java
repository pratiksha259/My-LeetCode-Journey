class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> hs=new HashSet<>();
        int j=0;
        ArrayList<Integer> a=new ArrayList<>();
        for(int i=0;i<nums1.length;i++)
        {
            hs.add(nums1[i]);
        }
        for(int i=0;i<nums2.length;i++)
        {
            if(hs.contains(nums2[i]))
             {
                a.add(nums2[i]);
                j++;
                hs.remove(nums2[i]);
             }
        }
        int[] arr=new int[a.size()];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=a.get(i);
        }
        return arr;
    }
}