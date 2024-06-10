class Solution {
    public boolean checkString(String s) {
        HashMap<Character,Integer> hm= new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            hm.put(ch,hm.getOrDefault(ch,0)+1);

        }
        if(!hm.containsKey('b'))
         return true;
        // hm.put('b',0);
        else if(!hm.containsKey('a'))
         return true;
    
        else
        {
            int b=hm.get('b');
       // for(int i=s.length()-1;i>=b;i--)
         for (int i = s.length() - b; i < s.length(); i++)
        {   

            if(s.charAt(i)!='b')
             return false;
        }
        }
        return true;
    }
}