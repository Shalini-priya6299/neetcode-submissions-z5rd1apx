class Solution {
    public boolean isPalindrome(String s) {
        String newString1 = s.replaceAll("[^a-zA-Z0-9]", "");
        newString1 = newString1.toLowerCase();
        String newString2 = "";
        for(int i = newString1.length()-1; i>=0; i--){
            newString2= newString2 + newString1.charAt(i);
        }
        return newString1.equals(newString2);
    }
}
