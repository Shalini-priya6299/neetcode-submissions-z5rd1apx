class Solution {
    public int longestConsecutive(int[] nums) {
       if(nums.length ==0){
        return 0;
       }
       Set<Integer> st = new HashSet<>();
       for(int i: nums){
        st.add(i);
       }
       int longest = 0;

       for(int i : st){
        if(!st.contains(i-1)){
            int currNum = i;
            int count = 1;

            while(st.contains(currNum+1)){
                count++;
                currNum++;
            }
            longest = Math.max(count, longest);
        }
        
       }
       return longest;
      
    }

}
