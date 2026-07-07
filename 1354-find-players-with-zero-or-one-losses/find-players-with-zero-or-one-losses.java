class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        List<List<Integer>> ans = new ArrayList<>();
        Map<Integer, Integer> mp = new HashMap<>();
        for (int i = 0; i < matches.length; i++) {
            mp.put(matches[i][0], 0);
            mp.put(matches[i][1], 0);
        }
        for (int i = 0; i < matches.length; i++) {
            mp.put(matches[i][1], mp.get(matches[i][1]) + 1);
        }
        ans.add(new ArrayList<>());
        ans.add(new ArrayList<>());

        for (int key : mp.keySet()) {
            if (mp.get(key) == 0) {
                ans.get(0).add(key);
            } else if (mp.get(key) == 1) {
                ans.get(1).add(key);
            }
        }
        Collections.sort(ans.get(0));
        Collections.sort(ans.get(1));
        return ans;
    }
}