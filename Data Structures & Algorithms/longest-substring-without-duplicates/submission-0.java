class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length() ==0) return 0;
        int maxLen = 0;
        for(int i = 0; i< s.length(); i++){
            Set<Character> st = new HashSet<>();
            for(int j = i; j< s.length(); j++){
                if(st.contains(s.charAt(j))){
                    break;
                    
                }
                else{
                    st.add(s.charAt(j));
                    maxLen = Math.max(maxLen, j-i+1);
                }
                
            }
        }
        return maxLen;
    }
}
