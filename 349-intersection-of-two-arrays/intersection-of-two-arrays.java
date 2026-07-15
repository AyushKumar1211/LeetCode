class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        boolean[] arr = new boolean[1001];
        for(int i=0;i<nums1.length;i++){
            arr[nums1[i]] = true;
        }
        Set<Integer> s = new HashSet<>();
        for(int i =0 ;i<nums2.length;i++){
            if(arr[nums2[i]]==true){
                s.add(nums2[i]);
            }
        }
        int[] ans = s.stream().mapToInt(Integer::intValue).toArray();
        return ans; 
    }
}