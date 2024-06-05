class Solution {
    public List<String> commonChars(String[] words) {
        List<String> ans=new ArrayList<>();
        int[] minFreq = new int[26];
        Arrays.fill(minFreq, Integer.MAX_VALUE);

        for(String word : words){
            int[] cc=new int[26];
            for(char c : word.toCharArray()){
                cc[c-'a']++;
            }
            for(int i=0;i<26;i++) minFreq[i]=Math.min(minFreq[i] , cc[i]);
        }
        for(int i=0;i<26;i++){
            while(minFreq[i]>0){
                char x=(char)(i+'a');
                ans.add(Character.toString(x));
               
               minFreq[i]--;
            }
        }

        return ans;
    }
}