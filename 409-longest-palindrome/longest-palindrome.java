class Solution {
    public int longestPalindrome(String s) {
        Map<Character,Integer> mp = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(mp.containsKey(c)){
                int value = mp.get(c);
                mp.put(c,value+1);
            }
            else{
                mp.put(c,1);
            }
        }
        int sum =0;
        boolean flag = false;
        for(Integer val : mp.values()){
            if(val%2==1){
                flag = true;
                sum+=val-1;
            }
            else{
                sum+=val;
            }
        }
        if(flag){
            sum++;
        }
        return sum;
    }
}