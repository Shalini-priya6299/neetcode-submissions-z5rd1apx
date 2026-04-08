class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        for(int i = 0; i< nums.length; i++){
                mp.put(nums[i], mp.getOrDefault(nums[i],0)+1);
        }
        List<Integer> ls = new ArrayList<>(mp.keySet());
        ls.sort((a,b)->mp.get(b)-mp.get(a));
        int[] result = new int[k];
        for(int i = 0; i < k; i++){
            result[i] = ls.get(i);
        }
        return result;
    }
}
