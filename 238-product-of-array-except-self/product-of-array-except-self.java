class Solution {
    public int[] productExceptSelf(int[] nums) {
    int n=nums.length;
        int p=1,s=1;
        int arr2[]=new int[n];
        for(int i=0;i<n;i++){
            arr2[i]=p;
            p=p*nums[i];
        }
        for(int i=n-1;i>=0;i--){
            arr2[i]=arr2[i]*s;
            s=s*nums[i];
        }
        return arr2;
    }
    }