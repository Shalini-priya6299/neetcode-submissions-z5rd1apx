class Solution {
    public boolean isPalindrome(String s) {
        String result1 = "";
        String result2= "";
        String newString = s.replaceAll("[^a-zA-Z0-9]", "");
        newString = newString.toLowerCase();
        int i = 0;
        int j = newString.length() -1;
        while(i<j){
            if(newString.charAt(i) != newString.charAt(j)){
                return false;
                
            }
            i++;
            j--;
        }
        return true;
    }
}
