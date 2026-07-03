class Solution {
    public int singleNumber(int[] nums) {
        int n = nums.length;
        if(n==1){
            return nums[0];
        }
        Arrays.sort(nums);
        for(int i=0;i<n-1;i+=3){
            if(nums[i]!=nums[i+2]){
                return nums[i];
            }
        }
        return nums[n-1];
    }
}