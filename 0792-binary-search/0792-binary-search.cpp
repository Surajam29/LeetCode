class Solution {
public:
    int bs(vector<int>& b,int low,int high,int target){
        if(low > high)
        {
            return -1;
        }

        int mid = (low + high)/2;
        if(b[mid] == target)
        {
            return mid;
        }
        else if(target > b[mid])
        {
            return bs(b,mid+1,high,target);
        }
        else{
            return bs(b,low,mid-1,target);
        }
    }


    int search(vector<int>& nums, int target) {
        return bs(nums,0,nums.size() - 1,target); 
    }
};