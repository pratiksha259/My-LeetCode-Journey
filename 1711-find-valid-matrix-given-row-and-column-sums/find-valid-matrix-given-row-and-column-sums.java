class Solution {
    public int[][] restoreMatrix(int[] rowsum, int[] colsum) {
       int[][] mat=new int[rowsum.length][colsum.length];
        for(int i=0;i<rowsum.length;i++)
        {
            for(int j=0;j<colsum.length;j++)
            {
               if(rowsum[i]<colsum[j])
                 mat[i][j]=rowsum[i];
               else if(rowsum[i]>colsum[j])
                 mat[i][j]=colsum[j];
               else
                mat[i][j]=rowsum[i];
            rowsum[i] -= mat[i][j];
            colsum[j] -=mat[i][j];
            }
        }
        return mat;
    }

}