class Solution {
    public int largestAltitude(int[] gain) {
        int maxAltitude=0;
        int curr=0;
        for(int i=0;i<gain.length;i++){
            curr+=gain[i];
            maxAltitude=Math.max(maxAltitude,curr);
        }
        return maxAltitude;
    }
}