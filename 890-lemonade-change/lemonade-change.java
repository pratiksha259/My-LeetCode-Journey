class Solution {
    public boolean lemonadeChange(int[] bill) {
        int five = 0, ten = 0; // Track the number of $5 and $10 bills
        
        for (int i = 0; i < bill.length; i++) {
            if (bill[i] == 5) {
                five++; // Increment $5 bill count
            } else if (bill[i] == 10) {
                if (five > 0) {
                    five--; // Use one $5 bill for change
                    ten++;  // Increment $10 bill count
                } else {
                    return false; // Not enough $5 bills to give change
                }
            } else {
                // Handling $20 bill
                if (ten > 0 && five > 0) {
                    ten--; // Use one $10 bill
                    five--; // Use one $5 bill
                } else if (five >= 3) {
                    five -= 3; // Use three $5 bills
                } else {
                    return false; // Not enough change
                }
            }
        }
        
        return true; // Successfully gave change for all customers
    }
}
