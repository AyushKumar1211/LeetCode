class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        Arrays.sort(nums);
        int max=1;
        int count=0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i+1]==nums[i]+1){
                count++;
                if(i==nums.length-2){
                    count++;
                }
                if(count>max){
                    max=count;
                }
            }
            else if(nums[i]==nums[i+1]){
                if(i==nums.length-2){
                    count++;
                }
                if(count>max){
                    max=count;
                }
            }
            else{
                count++;
                if(count>max){
                    max=count;
                }
                count=0;
            }
        }
        return max;
    }
}