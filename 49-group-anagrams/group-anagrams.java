class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> hm=new HashMap<>();
        for(int i=0;i<strs.length;i++)
        {
           String s=strs[i];
           char[] c=s.toCharArray();
           Arrays.sort(c);
           String st=String.valueOf(c);
           if(!hm.containsKey(st))
             hm.put(st,new ArrayList<>());
           hm.get(st).add(s);
        }
        return new ArrayList<>(hm.values());
    }
}