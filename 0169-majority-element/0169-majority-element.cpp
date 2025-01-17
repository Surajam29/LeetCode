class Solution {
public:
    int majorityElement(vector<int>& nums) {
        int count=0;
        int m;
        for(int i=0;i<nums.size();i++)
        {
            if(count==0)
            {
                count=1;
                m=nums[i];
            }
            else if(nums[i] == m)
            {
                count++;
            }
            else
            {
                count--;
            }
        }
        int count1=0;
        for(int i=0;i<nums.size();i++)
        {
            if(nums[i] == m)
            {
                count1++;
            }
        }
        if(count1 > (nums.size() / 2))
        {
            return m;
        }
        return -1;
    }
};