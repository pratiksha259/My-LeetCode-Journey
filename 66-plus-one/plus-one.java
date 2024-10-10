class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        
        // Traverse the digits from the last to the first
        for (int i = n - 1; i >= 0; i--) {
            // If the current digit is less than 9, just add 1 and return
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            
            // Otherwise, set the current digit to 0 and continue the loop
            digits[i] = 0;
        }
        
        // If we are here, it means all the digits were 9 (like 999 -> 1000)
        int[] newNumber = new int[n + 1];
        newNumber[0] = 1;  // Set the first digit to 1
        return newNumber;   // Rest are already initialized to 0 by default
    }
}
