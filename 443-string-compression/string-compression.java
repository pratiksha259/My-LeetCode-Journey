class Solution {
    public int compress(char[] chars) {
        HashMap<Character,Integer> hm=new HashMap<>();
        for(int i=0;i<chars.length;i++)
        {
            hm.put(chars[i],hm.getOrDefault(chars[i],0)+1);
        }
        int c=1;
        StringBuilder sb=new StringBuilder("");
        for(int i=1;i<chars.length;i++)
        {
            if(chars[i]==chars[i-1])
             c++;
            else
            {
                sb.append(chars[i-1]);
                if(c>1)
                 sb.append(c);
                c=1;
            }
        }
        sb.append(chars[chars.length-1]);
        if(c>1)
         sb.append(c);
         for (int i = 0; i < sb.length(); i++) {
            chars[i] = sb.charAt(i);
        }
        return sb.length();
    }
}