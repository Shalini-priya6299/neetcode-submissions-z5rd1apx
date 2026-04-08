class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        int sum = 0;
        Arrays.sort(candidates);
        backTracking(candidates, 0, sum, target, curr, result);
        return result;
    }

    void backTracking(int[] candidates, int i, int sum, int target, List<Integer> curr, List<List<Integer>> result){
        if(sum == target){
            result.add(new ArrayList<>(curr));
            return;
        }else if(sum> target){
            return;
        }else if(i == candidates.length){
            return;
        }

         for(int j = i; j < candidates.length; j++){

            // skip duplicates
            if(j > i && candidates[j] == candidates[j-1]) continue;

            curr.add(candidates[j]);

            backTracking(candidates, j+1, sum + candidates[j], target, curr, result);

            curr.remove(curr.size()-1);
        }
    }
}
