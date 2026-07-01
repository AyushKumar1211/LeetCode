class Solution {
    public int[] numberOfLines(int[] widths, String s) {
        int count =0;
        int line=1;
        if(s.length()==0){
            int[] n ={0,0};
            return n;
        }
        for(int i=0;i<s.length();i++){
            int ch = s.charAt(i);
            if((count+widths[ch-97])<=100){
                count+=widths[ch-97];
            }
            else{
                line++;
                count=widths[ch-97];
            }
        }
        int[] n = {line,count};
        return n;
    }
}