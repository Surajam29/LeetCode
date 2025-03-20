class Solution {
    public int missingNumber(int[] nums) {
        int l = nums.length;
        int res = l*(l+1)/2;
        int sum=0;
        int mis=0;

        for(int i=0;i<l;i++){
            sum += nums[i];
        }

        mis = res - sum;

        return mis;
    }
}