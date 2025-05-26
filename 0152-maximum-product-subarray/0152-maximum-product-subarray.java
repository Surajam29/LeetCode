class Solution {
    public int maxProduct(int[] nums) {
        
        //Edge case
        if(nums.length == 0){
            return 0;
        }

        //Initialise
        int min = nums[0];
        int max = nums[0];
        int res = max;

        for(int i=1;i<nums.length;i++){
            int cur = nums[i];
            int temp = Math.max(cur, Math.max(cur*min,cur*max));
            min = Math.min(cur, Math.min(cur*min,cur*max));
            max = temp;

            res = Math.max(res, max);
        }

        return res;
    }
}