class Solution {
public:
    int missingNumber(vector<int>& nums) {
        int xor1 = 0, xor2 = 0;
        int n = nums.size();
        
        // XOR all the numbers in the array
        for(int i = 0; i < n; i++) {
            xor2 = xor2 ^ nums[i];  // XOR of all elements in nums
            xor1 = xor1 ^ i;        // XOR of indices from 0 to n-1
        }
        
        xor1 = xor1 ^ n;  // XOR with n (as n is missing from the indices)
        
        // XOR of xor1 and xor2 gives the missing number
        return xor1 ^ xor2;
    }
};
