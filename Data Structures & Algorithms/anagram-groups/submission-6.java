class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs.length == 0){
            return new ArrayList<>();
        }
        Map<String, List<String>> mp = new HashMap<>();

        for(String ch: strs){
            char[] ch2 = ch.toCharArray();
            Arrays.sort(ch2);
            String key = new String(ch2);
            if(!mp.containsKey(key)){
                mp.put(key, new ArrayList<>());
            }
            mp.get(key).add(ch);
        }
        return new ArrayList<>(mp.values());
    }
}
