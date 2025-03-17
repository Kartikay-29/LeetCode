class Solution {
    public boolean divideArray(int[] nums) {
        Map<Integer,Integer> count= new HashMap<>();
        for(int num:nums){
            count.put(num,count.getOrDefault(num,0)+1);
        }
        for(int counts:count.values()){
            if(counts%2!=0){
                return false;
            }
        }
        return true;
    }
}