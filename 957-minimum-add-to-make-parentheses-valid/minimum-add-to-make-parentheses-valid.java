class Solution {
    public int minAddToMakeValid(String s) {
        int open = 0;  // Counter for unmatched '('
        int close = 0; // Counter for unmatched ')'
        
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            
            if (ch == '(') {
                open++; // Increase open count for every '('
            } else if (ch == ')') {
                if (open > 0) {
                    open--; // A matching '(' is found, so decrease the open count
                } else {
                    close++; // No matching '(', so we need a ')' later
                }
            }
        }
        
        // The result is the sum of unmatched '(' and unmatched ')'
        return open + close;
    }
}
