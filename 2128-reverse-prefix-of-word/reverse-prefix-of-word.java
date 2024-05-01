class Solution {
    public String reversePrefix(String word, char ch) {
        int n=0;
        StringBuilder sb=new StringBuilder("");
        for(int i=0;i<word.length();i++)
        {
            if(ch==word.charAt(i))
             {
               n=i;
               break;
             }
        }
        for(int i=n;i>=0;i--)
        {
            sb.append(word.charAt(i));
        }
        for(int i=n+1;i<word.length();i++)
        {
            sb.append(word.charAt(i));
        }
        return sb.toString();
    }
}
