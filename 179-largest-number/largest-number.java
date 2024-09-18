import java.util.Arrays;

class Solution {
    public String largestNumber(int[] nums) {
        // Convert integers to strings for comparison
        String[] strNums = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            strNums[i] = String.valueOf(nums[i]);
        }

        // Sort the strings using a lambda expression for custom sorting
        Arrays.sort(strNums, (a, b) -> {
            String order1 = a + b;
            String order2 = b + a;
            return order2.compareTo(order1); // Sort in descending order based on concatenation
        });

        // If the largest number is "0", return "0" (handle case where all numbers are zero)
        if (strNums[0].equals("0")) {
            return "0";
        }

        // Build the largest number by concatenating the sorted strings
        StringBuilder sb = new StringBuilder();
        for (String num : strNums) {
            sb.append(num);
        }

        return sb.toString();
    }
}
