class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        HashMap<Integer,String> hm = new HashMap<>();
        for(int i=0;i<heights.length;i++)
        {
            String s=names[i];
            hm.put(heights[i],s);
        }
        Arrays.sort(heights);
        String[] ans=new String[names.length];
        int c=0;
        for(int i=names.length-1;i>=0;i--)
        {
            int j=heights[i];
            ans[c]=hm.get(j);
            c++;
        }
        return ans;
    }
}