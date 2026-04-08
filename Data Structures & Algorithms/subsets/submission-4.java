class Solution {
    List<List<Integer>> result = new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> arr = new ArrayList<>();
        backtrack(0, nums, arr);
        return result;
    }

    void backtrack(int start,int[] nums, List<Integer> arr) {
        result.add(new ArrayList<>(arr));
        for (int i = start; i < nums.length; i++) {
            arr.add(nums[i]);
            backtrack(i + 1, nums, arr);
            arr.remove(arr.size()-1);
        }
    }
}