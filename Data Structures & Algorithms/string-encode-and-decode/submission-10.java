class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i< strs.size(); i++){
            sb.append(strs.get(i).length());
            sb.append('#');
            sb.append(strs.get(i ));
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
       List<String> result = new ArrayList<>();
       int i = 0;
       while(i<str.length()){
        int j = i;
            while(str.charAt(j) != '#'){
                j++;
            }
            int num = Integer.parseInt(str.substring(i, j));
            result.add(str.substring(j+1, j+1+num));
            i = j+1+num;
       }
       return result;

    }
}
