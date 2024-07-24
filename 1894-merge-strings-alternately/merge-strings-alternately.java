class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder sb=new StringBuilder("");
        int l=word1.length();
        int l2=word2.length();
        if(word1.length()<word2.length()){
        for(int i=0;i<word1.length();i++)
        {
            char ch =word1.charAt(i);
            char c=word2.charAt(i);
            sb.append(ch);
            sb.append(c);
        }
        
        for(int i=l;i<l2;i++)
        {
            sb.append(word2.charAt(i));
        }
        }

        else
        {
             for(int i=0;i<word2.length();i++)
        {
            char ch =word1.charAt(i);
            char c=word2.charAt(i);
            sb.append(ch);
            sb.append(c);
        }
        for(int i=l2;i<l;i++)
        {
            sb.append(word1.charAt(i));
        }
        }
        return sb.toString();
    }
}