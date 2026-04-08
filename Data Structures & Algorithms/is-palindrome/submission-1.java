class Solution {
    public boolean isPalindrome(String s) {
        String result1 = "";
        String result2= "";
        String newString = s.replaceAll("[^a-zA-Z0-9]", "");
        newString = newString.toLowerCase();
        for(int i=0;i<newString.length(); i++){
                result1+=newString.charAt(i);
        }
        for(int i=result1.length()-1; i>=0; i--){
            result2 +=result1.charAt(i);
        }
        char[] ch1 = result1.toCharArray();
        char[] ch2 = result2.toCharArray();
        return Arrays.equals(ch1,ch2);
    }
}
