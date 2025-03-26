class Solution {
    private static final String[] KEYPAD = {
        "",    // 0
        "",    // 1
        "abc", // 2
        "def", // 3
        "ghi", // 4
        "jkl", // 5
        "mno", // 6
        "pqrs",// 7
        "tuv", // 8
        "wxyz" // 9
    };
    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        // Handle empty input case
        if (digits == null || digits.length() == 0) {
            return result;
        }
        backtrack(digits, 0, new StringBuilder(), result);
        return result;
    }
    
    private void backtrack(String digits, int index, StringBuilder current, List<String> result) {
        // Base case: if current combination length equals input digits length
        if (index == digits.length()) {
            result.add(current.toString());
            return;
        }
        
        // Get current digit and its corresponding letters
        int digit = digits.charAt(index) - '0';
        String letters = KEYPAD[digit];
        
        // Try each letter for current digit
        for (char c : letters.toCharArray()) {
            current.append(c);              // Add current letter
            backtrack(digits, index + 1, current, result); // Recurse for next digit
            current.deleteCharAt(current.length() - 1);    // Backtrack
        }
    }
}