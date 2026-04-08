class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs.length == 0){
            return new ArrayList<>();
        }
        Map<String, List<String>> mp = new HashMap<>();

        for(String ch: strs){
            char[] ch0 = ch.toCharArray();
            Arrays.sort(ch0);
            String key = new String(ch0);
            if(!mp.containsKey(key)){
                mp.put(key, new ArrayList<>());
            }
            mp.get(key).add(ch);
        }
        return new ArrayList<>(mp.values());
    }
}
