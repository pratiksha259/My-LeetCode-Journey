import java.util.HashMap;

class Solution {
    public int[] singleNumber(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        // Using a fixed size array for result. If the size is unknown, ArrayList can be used
        int[] result = new int[2]; 
        int j = 0;
        
        // Populate the hashmap with counts of each number
        for (int i = 0; i < nums.length; i++) {
            hm.put(nums[i], hm.getOrDefault(nums[i], 0) + 1);
        }
        
        // Iterate through the hashmap to find the elements that occur only once
        for (int num : nums) {
            if (hm.get(num) == 1) {
                result[j] = num;
                j++;
                // Stop when we have found the two unique numbers
                if (j == 2) {
                    break;
                }
            }
        }
        
        return result;
    }
}
