class Solution {
    public double myPow(double x, int n) {
        if(x==1D || n==0)return 1D;
        if(x==-1D)return(n%2==0)?1D:-1D;
        if(n==Integer.MIN_VALUE){
            return 1/(myPow(x,Integer.MAX_VALUE)*x);
        }
        double result=1.0;
        long power=Math.abs((long)n);
        while(power>0){
            if(power%2==1){
                result*=x;
            }
            x*=x;
            power/=2;
        }
        return (n<0)?1.0/result:result;
    }
}