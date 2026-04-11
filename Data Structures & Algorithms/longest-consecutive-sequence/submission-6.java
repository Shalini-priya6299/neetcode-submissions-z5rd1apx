class Solution {
    public int longestConsecutive(int[] nums) {
       if(nums.length ==0){
        return 0;
       }
       Arrays.sort(nums);
       List<Integer> newList = new ArrayList<>();
       for(int i = 0; i< nums.length; i++){
        if(!newList.contains(nums[i])){
            newList.add(nums[i]);
        }
       }
       int count = 0;
       int temp= 0;
       for(int i = 0; i< newList.size()-1; i++){
        if(newList.get(i+1) == newList.get(i)+1){
            count++;
        }else{
            count = 0;
        }
        temp = Math.max(temp, count);
       }
       return temp+1;
    }

}
