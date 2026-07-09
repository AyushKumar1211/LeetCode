class Solution {
    public int maxProduct(String[] words) {

        int n = words.length;
        int max = 0;

        for (int i = 0; i < n - 1; i++) {

            boolean[] present = new boolean[26];

            for (char c : words[i].toCharArray()) {
                present[c - 'a'] = true;
            }

            for (int j = i + 1; j < n; j++) {

                boolean flag = true;

                for (char c : words[j].toCharArray()) {
                    if (present[c - 'a']) {
                        flag = false;
                        break;
                    }
                }

                if (flag) {
                    max = Math.max(max,
                            words[i].length() * words[j].length());
                }
            }
        }

        return max;
    }
}