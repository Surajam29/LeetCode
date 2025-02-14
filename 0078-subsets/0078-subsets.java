class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> r = new ArrayList<>();
        r.add(new ArrayList<>());

        for(int num : nums){
            int size = r.size();
            for(int i=0;i<size;i++){
                List<Integer> s = new ArrayList<>(r.get(i));
                s.add(num);
                r.add(s);
            }
        }

        return r;
    }
}