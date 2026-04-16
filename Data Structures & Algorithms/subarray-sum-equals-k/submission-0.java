class Solution {
    public int subarraySum(int[] nums, int k) {
        int count = 0;
        int prefixSum =0;
        Map<Integer,Integer> freq = new HashMap<>();
        freq.put(0,1);
        for(int num:nums){
            prefixSum += num;
            if(freq.containsKey(prefixSum-k)){
                count += freq.get(prefixSum-k);
            }
            freq.put(prefixSum, freq.getOrDefault(prefixSum, 0)+1);
        }
        return count;
    }
}