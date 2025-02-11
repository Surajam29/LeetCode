class Solution {
    public int maxProfit(int[] prices) {
        Stack<Integer> stack = new Stack<>();
        int maxProfit = 0;
        int minPrice = Integer.MAX_VALUE;

        for(int price : prices){
            while(!stack.isEmpty() && stack.peek() > price){
                stack.pop();
            }
            
            stack.push(price);
            minPrice = Math.min(minPrice,price);
            maxProfit = Math.max(maxProfit,price - minPrice);
        }

        return maxProfit;
    }
}