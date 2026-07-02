class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans = new ArrayList<>();
        List<String> arr = new ArrayList<>();
        int n = strs.length;
        for(int i=0;i<n;i++){
            char[] chars = strs[i].toCharArray();
            Arrays.sort(chars);
            String s = new String(chars);
            arr.add(s);
        }
        Map<String,List<String>> mp = new HashMap<>();
        for(int i=0;i<n;i++){
            if(!mp.containsKey(arr.get(i))){
                List<String> chk = new ArrayList<>();
                chk.add(strs[i]);
                mp.put(arr.get(i),chk);
            }
            else{
                List<String> chk = mp.get(arr.get(i));
                chk.add(strs[i]);
                mp.put(arr.get(i),chk);
            }
        }
        for(List<String> chk : mp.values()){
            ans.add(chk);
        }
        return ans;
    }
}