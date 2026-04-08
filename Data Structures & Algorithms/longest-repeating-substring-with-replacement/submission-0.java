class Solution {
    public int characterReplacement(String s, int k) {
        int left = 0;
        int right = 0;
        int ans = 0;
        Map<Character, Integer> mp = new HashMap<>();
        int highestfreq = 0;
        while(right<s.length()){
            char val = s.charAt(right);

            // put into the map
            mp.put(val, mp.getOrDefault(val,0)+1);
            // updating max freq
            highestfreq = Math.max(mp.get(val), highestfreq);
            // validating of window
            while(((right-left+1)-highestfreq) >k){
                mp.put(s.charAt(left), mp.get(s.charAt(left))-1);
                left++;
            }
            ans = Math.max(ans, right-left+1);
            right++;
        }
        return ans;
    }
}
