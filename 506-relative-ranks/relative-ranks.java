class Solution {
    public String[] findRelativeRanks(int[] score) {
        List<Integer> arr = new ArrayList<>();
        int n = score.length;
        for(int i=0;i<n;i++){
            arr.add(score[i]);
        }
        Collections.sort(arr,Collections.reverseOrder());
        String[] ans = new String[n];
        for(int i=0;i<score.length;i++){
            int ind = arr.indexOf(score[i]);
            if(ind==0){
                ans[i] = "Gold Medal";
            }
            else if(ind==1){
                ans[i] = "Silver Medal";
            }
            else if(ind==2){
                ans[i] = "Bronze Medal";
            }
            else{
                ans[i] = ind+1+"";
            }
        }
        return ans;
    }
}