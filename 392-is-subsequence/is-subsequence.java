class Solution {
    public boolean isSubsequence(String s, String t) {
        int n = s.length();
        int m = t.length();
        if(n>m){
            return false;
        }
        int ind = 0;
        for(int i=0;i<m;i++){
            if(ind>=n){
                break;
            }
            char c = t.charAt(i);
            char a = s.charAt(ind);
            if(a==c){
                ind++;
            }
        }
        if(ind == n){
            return true;
        }
        return false;
    }
}