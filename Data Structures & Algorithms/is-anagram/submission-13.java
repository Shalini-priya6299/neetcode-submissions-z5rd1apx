class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> mp = new HashMap<>();
        for(char i: s.toCharArray()){
            mp.put(i, mp.getOrDefault(i,0)+1);
        }
        for(char i: t.toCharArray()){
            mp.put(i, mp.getOrDefault(i,0)-1);
        }
        for(int i : mp.values()){
            if(i !=0){
                return false;
            }

        }
        return true;
    }
}
