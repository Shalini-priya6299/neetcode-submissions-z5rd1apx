class Solution {

    public String encode(List<String> strs) {
        StringBuilder str = new StringBuilder();
        for(String s:strs){
            str.append(s.length());
            str.append("#"); 
            // in append we can only append string
            str.append(s);
        }
        return str.toString();
    }

    public List<String> decode(String str) {
        List<String> nl = new ArrayList<>();
        int i = 0;
        while(i<str.length()){
            int j = i;
            while(str.charAt(j) != '#'){
                j++;
            }
            int lenOfStr = Integer.parseInt(str.substring(i, j));
            int start = j+1;
            int end = start+lenOfStr;
            nl.add(str.substring(start, end));
            i= end;
            
        }
        return nl;

    }
}
