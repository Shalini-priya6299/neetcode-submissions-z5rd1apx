class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> freq = new HashMap<>();
        for(int i = 0; i< nums.length; i++){
            freq.put(nums[i], freq.getOrDefault(nums[i], 0)+1);
        }
        List<Integer> list = new ArrayList<>(freq.keySet());
        Collections.sort(list,(a,b) -> freq.get(b)- freq.get(a));
        int[] result = new int[k];
        int i = 0;
        while(i< k){
            result[i]= list.get(i);
            i++;
        }
        return result;
    }
}
