class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        Map <Character, Integer> map = new HashMap<>();
        
        for(int i= 0; i< s.length(); i++){
            char ch = s.charAt(i);
            if (map.containsKey(ch)){
                map.put(ch, map.get(ch) +1);
            }else{
                map.put(ch, 1);
            }
        }
        for(int j = 0; j < t.length(); j++){
            char ch = t.charAt(j);
            if (map.containsKey(ch)){
                map.put(ch, map.get(ch)-1);
            }
        }
        for (int num: map.values()){
            if(num!= 0){
                return false;
            }
        }
        return true;
    }
}
