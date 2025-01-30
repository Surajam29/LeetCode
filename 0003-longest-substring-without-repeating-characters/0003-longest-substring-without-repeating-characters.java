class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] lastSeen = new int[256]; // Covers extended ASCII (0-255)
        for (int i = 0; i < 256; i++) lastSeen[i] = -1; // Initialize to -1
        
        int maxLength = 0;
        int left = 0;
        
        for (int right = 0; right < s.length(); right++) {
            char currentChar = s.charAt(right);
            int ascii = (int) currentChar;
            
            // If character was seen after current left boundary, update left
            if (lastSeen[ascii] >= left) {
                left = lastSeen[ascii] + 1;
            }
            
            lastSeen[ascii] = right; // Update last seen position
            maxLength = Math.max(maxLength, right - left + 1); // Update max
        }
        
        return maxLength;
    }
}