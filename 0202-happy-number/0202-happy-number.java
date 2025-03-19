class Solution {
    public boolean isHappy(int n) {
        for(int s=0;s<100;s++){
            if(n==1){
                return true;
            }
            n=nextNum(n);
        }
        return false;
    }

    private int nextNum(int n){
        int s=0;
        while(n>0){
            int d=n%10;
            s = s + (d*d);
            n=n/10;
        }
        return s;
    }
}