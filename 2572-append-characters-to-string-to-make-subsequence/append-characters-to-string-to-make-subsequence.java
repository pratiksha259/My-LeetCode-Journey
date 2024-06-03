class Solution {
    public int appendCharacters(String s, String t) {
       int sindex=0;
       int tindex=0;
       int sl=s.length();
       int tl=t.length();
       while(sindex<sl && tindex<tl)
       {
       if(t.charAt(tindex)==s.charAt(sindex))
       {
        tindex++;
       }
       sindex++;
       }
       return tl-tindex;
    }
}