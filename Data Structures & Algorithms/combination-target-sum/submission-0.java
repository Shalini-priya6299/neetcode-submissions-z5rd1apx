class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        int sum = 0;
        backTracking(nums, 0, target, sum, curr, result);
        return result;
    }

    void backTracking(int[] nums, int i, int target, int sum, List<Integer> curr, List<List<Integer>> result){
        // Base 
        if(sum == target){
            result.add(new ArrayList<>(curr));
            return;
        }else if(sum > target){
            return;
        }
        if(i==nums.length){
            return;
        }
        // Take
        curr.add(nums[i]);
        backTracking(nums, i, target, sum+nums[i], curr, result);

        // remove
        curr.remove(curr.size()-1);

        // skip
        backTracking(nums, i+1, target, sum, curr, result);
    }
}
