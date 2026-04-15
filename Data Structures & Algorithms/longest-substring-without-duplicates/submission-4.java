class Solution {
    public int lengthOfLongestSubstring(String s) {
       int i = 0; 
       int j = 0;
       int maxLen = 0;
       Set<Character> st = new HashSet<>();
       while(j< s.length()){
        if(st.contains(s.charAt(j))){
            st.remove(s.charAt(i));
            i++;
        }else{
            st.add(s.charAt(j));
            maxLen = Math.max(maxLen, j-i+1);
            j++;
            
        }
        
       }
       return maxLen;
    }
}
