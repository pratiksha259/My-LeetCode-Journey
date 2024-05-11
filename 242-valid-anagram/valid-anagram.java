/*class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> hm= new HashMap<>();
        if(s.length()!=t.length())
         return false;
        
        for(int i=0;i<s.length();i++)
        {    //char c=s.charAt(i);
            hm.put(s.charAt(i),hm.getOrDefault(s.charAt(i),0)+1);
        }
        for(int i=0;i<t.length();i++)
        {    char ch=s.charAt(i);
            if(hm.get(ch)!=null)
            {
                if(hm.get(ch)==1)
                 hm.remove(ch);
                else
                 hm.put(ch,hm.get(ch)-1);
            }
            else 
             return false;

            }
            return hm.isEmpty();
        }
    
}*/
import java.util.Arrays;

class Solution {
    public boolean isAnagram(String s, String t) {
        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();
        
        Arrays.sort(sChars);
        Arrays.sort(tChars);
        
        return Arrays.equals(sChars, tChars);
    }
}