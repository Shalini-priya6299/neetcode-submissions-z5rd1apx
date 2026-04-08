class Solution {
    public boolean isPalindrome(String s) {
        String newString1 = s.replaceAll("[^a-zA-Z0-9]", "");
        newString1 = newString1.toLowerCase();
        int left=0;
        int right = newString1.length()-1;
        while(left< right){
            if(newString1.charAt(left)!= newString1.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
