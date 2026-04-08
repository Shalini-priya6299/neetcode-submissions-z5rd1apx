class Solution {
    
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        backTrack(nums, 0, curr, result);
        return result;
    }

    void backTrack(int[] nums, int i, List<Integer> curr, List<List<Integer>> result){
        if(i==nums.length){
            result.add(new ArrayList<>(curr));
            return;
        }
        // take elements
        curr.add(nums[i]);
        backTrack(nums, i+1, curr, result);

        // remove last element
        curr.remove(curr.size()-1);
         //skip
         backTrack(nums, i+1, curr, result);
    }

}