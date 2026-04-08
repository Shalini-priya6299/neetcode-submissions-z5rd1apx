class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        HashMap <Character, Integer> mp = new HashMap<>();
        for(char ch: s.toCharArray()){
            if (mp.containsKey(ch)){
                mp.put(ch, mp.get(ch)+1);
            }else{
                mp.put(ch, 1);
            }
        }
        for(char ch2: t.toCharArray()){
            if (mp.containsKey(ch2)){
                mp.put(ch2, mp.get(ch2)-1);
            }
        }
        for (int val : mp.values()){
            if (val != 0){
                return false;
            }
        }
        return true;
    }
}
