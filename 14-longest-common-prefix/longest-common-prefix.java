class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder sb=new StringBuilder("");
        Arrays.sort(strs);
        String s=strs[0];
        String l=strs[strs.length-1];
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)==l.charAt(i))
             sb.append(s.charAt(i));
            else
             break;
        }
       return sb.toString();
    }
}