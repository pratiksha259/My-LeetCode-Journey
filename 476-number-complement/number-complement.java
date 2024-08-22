class Solution {
    public int findComplement(int num) {
        String str=Integer.toBinaryString(num);
        String res="";
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(ch=='0')
             res+='1';
            else
             res+='0';
        }
        return Integer.parseInt(res,2);
    }
}