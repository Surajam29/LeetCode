class Solution {
public:
    int searchInsert(vector<int>& nums, int target) {
        int low=0;
        int high=nums.size() - 1;
        int mid;
        int ans=target;
        int temp=0;

        while(low<=high){
            mid=(low+high)/2;
            if(nums[mid] >= target){
                temp=1;
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }


        if(temp == 1){
        return ans;
        }
        else{
            return nums.size();
        }
    }
};