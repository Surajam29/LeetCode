class ProductOfNumbers {
    private ArrayList<Integer> p;

    public ProductOfNumbers() {
        p = new ArrayList<>();
        p.add(1);
    }
    
    public void add(int num) {
        if(num == 0){
            p.clear();
            p.add(1);
        }else{
            p.add(p.get(p.size() - 1) * num);
        }
    }
    
    public int getProduct(int k) {
        int size = p.size();
        if(k >= size){
            return 0;
        }
        return p.get(size - 1) / p.get(size - 1 - k);
    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */