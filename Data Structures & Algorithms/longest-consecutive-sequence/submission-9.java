class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        Set<Integer> st = new HashSet<>();
        for(int i: nums){
            st.add(i);
        }
        int longest = 0;
        for(int num: st){
            if(!st.contains(num-1)){
                int currNum = num;
                int count = 1;
                while(st.contains(currNum+1)){
                    count++;
                    currNum++;
                }
                longest = Math.max(longest, count);
            }
        }
        return longest;
    }

}
