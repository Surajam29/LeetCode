class KthLargest {
    private PriorityQueue<Integer> m = new PriorityQueue<>(); 
    private int k;

    public KthLargest(int k, int[] nums) {
        this.k = k;

        for(int num : nums){
            if(m.size() < k){
                m.offer(num);
            }
            else if(num > m.peek()){
                m.poll();
                m.offer(num);
            }
        }
    }
    
    public int add(int val) {
        if(m.size() < k){
            m.offer(val);
        }
        else if(val > m.peek()){
            m.poll();
            m.offer(val);
        }


        return m.peek();
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */