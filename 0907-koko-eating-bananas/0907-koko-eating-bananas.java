class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int m=0;
        for(int pile:piles){
            m = Math.max(m,pile);
        }

        int l=1;
        int r = m;
        int min = m;

        while(l <= r){
                int mid = (l + r)/2;
                long hour = 0;
            

            for(int pile:piles){
                hour += (pile + mid - 1) / mid;
            }

            if(hour <= h){
                min = mid;
                r = mid - 1;
            }else{
                l = mid + 1;
            }
        }
        return min;
    }
}