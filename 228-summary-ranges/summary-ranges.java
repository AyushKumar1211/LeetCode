class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> li = new ArrayList<>();
        int n =nums.length;
        for(int i=0;i<n;i++){
            String ele=""+nums[i];
            boolean flag = false;
            while((true)&&(i<n-1)){
                if((nums[i]+1) == nums[i+1]){
                    i++;
                    flag = true;
                    if(i==(n-1)){
                        ele=ele+"->"+nums[i];
                    }
                }
                else{
                    if(flag){
                        ele=ele+"->"+nums[i];
                    }
                    break;
                }
            }
            li.add(ele);
        }
        return li;
    }
}