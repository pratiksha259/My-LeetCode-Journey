class Solution {
    public int strStr(String haystack, String needle) {
        int j = 0;
        int l = needle.length();
        int indx = -1;

        if (haystack.length() < needle.length()) {
            return -1;
        }

        for (int i = 0; i < haystack.length(); i++) {
            char ch = haystack.charAt(i);
            char c = needle.charAt(j);

            if (ch == c) {
                if (indx == -1) {
                    indx = i; // start index of the match
                }
                j++;
                if (j == l) {
                    return indx;
                }
            } else {
                if (indx != -1) {
                    // Reset to the next position after the first match attempt
                    i = indx;
                    indx = -1;
                    j = 0;
                }
            }
        }

        return -1;
    }
}
