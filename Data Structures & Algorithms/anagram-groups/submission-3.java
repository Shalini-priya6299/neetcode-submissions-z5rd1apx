class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> mp = new HashMap<>();

        for(int i = 0; i< strs.length; i++){
            char[] ch = strs[i].toCharArray();
            Arrays.sort(ch);
            String ch2 = new String(ch);
            if(!mp.containsKey(ch2)){
                mp.put(ch2, new ArrayList());
            }
            mp.get(ch2).add(strs[i]);
            
        }
        return new ArrayList<>(mp.values());
    }
}
