class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        Set<Integer> st = new HashSet<>();
        for(int i= 0; i< nums.length; i++){
            st.add(nums[i]);
        }
        int max = 1;
        for(int i: st){
            if(!st.contains(i-1)){
                int currNum =i;
                int temp = 1;
                while(st.contains(currNum+1)){
                    temp++;
                    currNum++;
                }
                if(max<temp){
                    max=temp;
                }
            }
        }
        return max;
    }

}
