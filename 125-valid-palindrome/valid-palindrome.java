class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        String check ="";
        String pali = "";
        for(int i=0;i<s.length();i++){
            int c = s.charAt(i);
            if(((c>96)&&(c<123))||((c>47)&&(c<58))){
                check=check+s.charAt(i);
                pali = s.charAt(i)+pali;
            }
        }
        return check.equals(pali);
    }
}