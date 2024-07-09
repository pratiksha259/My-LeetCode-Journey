class Solution {
    public double averageWaitingTime(int[][] customers) {
        int l=customers.length;
        int[] start= new int[l];
        int[] finish= new int[l];
        int s=0;
        int f=0;
        double t=0;
        for (int i=0;i<l;i++)
        {
          // int[] temp = {customers[i]};
          int[] temp = new int[2]; 
          temp = customers[i]; 
           start[i]=temp[0];
           finish[i]=temp[1];
        }
        s=start[0];
         for (int i=0;i<start.length;i++)
         {
           /* if (start[i] > s) {
                s = start[i]; 
            }*/
            s = Math.max(s, start[i]);
            f=s+finish[i];
            t+=f-start[i];
            s=f;

         }
         double avg=(double)t/(double)l;
         return avg;
    }
}