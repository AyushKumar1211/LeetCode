class Solution {
    public boolean detectCapitalUse(String word) {
        int n = word.length();
        int up =0 ;
        int low =0;
        for(int i =0 ;i<n;i++){
            int c = word.charAt(i);
            if((c>64)&&(c<91)){
                up++;
            }
            else{
                low++;
            }
        }
        if((up==0)||(low==0)){
            return true;
        }
        else if(up==1){
            int c = word.charAt(0);
            if((c>64)&&(c<91)){
                return true;
            }
            else{
                return false;
            }
        }
        else if((up>1)&&(low>0)){
            return false;
        }
        return true;
    }
}