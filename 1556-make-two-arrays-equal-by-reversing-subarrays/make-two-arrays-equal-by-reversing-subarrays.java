class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        if(arr.length!=target.length)
         return false;
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            hm.put(arr[i],hm.getOrDefault(arr[i],0)+1);
        }
        for(int i=0;i<target.length;i++)
        {
            int n=target[i];
            if(!hm.containsKey(n))
             return false;
            else
            {
                hm.put(n,hm.get(n)-1);
                if (hm.get(n) == 0) {
                    hm.remove(n);}
            }
        }
        return hm.isEmpty();
    }
}