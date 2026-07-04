class Solution {
    public int[] singleNumber(int[] nums) {
        int count =0;
        if(nums.length<=2){
            return nums;
        }
        List<Integer> arr = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            arr.add(nums[i]);
        }
        int[]  ans  = new int[2];
        int j=0;
        for(int i=0;i<nums.length;i++){
            if(count==2){
                break;
            }
            if(arr.indexOf(nums[i])==arr.lastIndexOf(nums[i])){
                ans[j] = nums[i];
                j++;
                count++;
            }
        }
        return ans;
    }
}