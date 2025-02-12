class Solution {
    public int[] twoSum(int[] numbers, int target) {
        Arrays.sort(numbers); // Sorting takes O(n log n)
        int left = 0, right = numbers.length - 1;

        while (left < right) {
            int sum = numbers[left] + numbers[right];

            if (sum == target) {
                return new int[]{left+1, right+1}; // Return indices
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }

        return new int[]{-1,-1};
    }
}