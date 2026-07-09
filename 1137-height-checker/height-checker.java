class Solution {
    public int heightChecker(int[] heights) {
        int n = heights.length;
        if(n<2){
            return 0;
        }
        int[] exp = heights.clone();
        Arrays.sort(exp);
        int count=0;
        for(int i=0;i<n;i++){
            if(exp[i] != heights[i]){
                count++;
            }
        }
        return count;
    }
}