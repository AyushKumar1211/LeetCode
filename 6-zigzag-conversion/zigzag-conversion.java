class Solution {
    public String convert(String s, int numRows) {
        int n =s.length();
        if(n<3){
            return s;
        }
        else if(numRows == 1){
            return s;
        }
        int[] ind = new int[n];
        String ans = "";
        int num =0;
        boolean flag = true;
        for(int i =0 ;i<n;i++){
            if((num<numRows)&&(flag)){
                num++;
                ind[i] = num;
                
            }
            else if(num==1){
                num++;
                flag = true;
                ind[i] = num;
            }
            else{
                num--;
                ind[i] = num;
                flag=false;
            }
        }
        for(int i =1 ;i<=numRows;i++){
            for(int j=0;j<n;j++){
                if(ind[j]==i){
                    ans+=s.charAt(j);
                }
            }
        }
        return ans;
    }
}