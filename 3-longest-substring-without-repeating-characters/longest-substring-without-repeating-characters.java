import java.util.HashMap;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        
        int maxLen = 0;
        int start = 0;
        HashMap<Character, Integer> hm = new HashMap<>();
        
        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            
            // If the character is already in the map and its index is within the current window
            if (hm.containsKey(currentChar) && hm.get(currentChar) >= start) {
                // Update the start position to be one after the last occurrence of the current character
                start = hm.get(currentChar) + 1;
            }
            
            // Update the current character's position in the map
            hm.put(currentChar, i);
            
            // Calculate the length of the current substring and update maxLen if it's longer
            int currentLen = i - start + 1;
            maxLen = Math.max(maxLen, currentLen);
        }
        
        return maxLen;
    }
}
