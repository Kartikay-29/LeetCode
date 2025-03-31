class Solution {
    public long putMarbles(int[] weights, int k) {
        int n = weights.length;
        int []pairweights= new int[n-1];
        for(int i=0;i<n-1;++i){
            pairweights[i]=weights[i]+weights[i+1];

        }
        Arrays.sort(pairweights,0,n-1);
        long answer=0l;
        for(int i=0;i<k-1;++i){
            answer+=pairweights[n-2-i]-pairweights[i];
        }
        return answer;
    }
}