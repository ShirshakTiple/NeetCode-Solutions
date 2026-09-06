class Solution {
    public boolean isPalindrome(String s) {
        int i = 0; 
        int j = s.length();
        j--;
        while(i <= j){
            if(s.charAt(i) == ' ' || !Character.isLetterOrDigit(s.charAt(i))){
                i++;
                continue;
            }
            if(s.charAt(j) == ' ' || !Character.isLetterOrDigit(s.charAt(j))){
                j--;
                continue;
            }
            if(Character.toLowerCase(s.charAt(i)) !=        Character.toLowerCase(s.charAt(j))){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
