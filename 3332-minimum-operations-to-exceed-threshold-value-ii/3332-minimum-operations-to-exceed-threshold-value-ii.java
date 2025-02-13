class Solution {
    public int minOperations(int[] nums, int k) {
        PriorityQueue<Long> m = new PriorityQueue<>();

        for(int num : nums){
            m.add((long) num);
        }

        if(m.peek() >= k){
            return 0;
        }
        int s=0;

        while(m.size() > 1 ){
            long x = m.poll();
            long y = m.poll();

            long newValue = x*2 + y;
            m.add(newValue);

            s++;

            if(m.peek() >= k){
                return s;
            }
        }

        return m.peek() >= k ? s : -1;
    }
}