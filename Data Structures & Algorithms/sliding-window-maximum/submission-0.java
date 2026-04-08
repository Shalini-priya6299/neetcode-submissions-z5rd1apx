class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int left = 0;
        int right = k;
        int[] arr = new int[nums.length-k+1];
        for(left = 0; left< nums.length-k+1; left++){
            int maxVal = Arrays.stream(nums,left,right).max().getAsInt();
            arr[left] = maxVal;
            right++;
        }
        return arr;
    }
}
