class Solution {

    int MOD = 1337;

    public int superPow(int a, int[] b) {
        int ans = 1;
        for (int digit : b) {
            ans = power(ans, 10);
            ans = (ans * power(a, digit)) % MOD;
        }
        return ans;
    }
    public int power(int a, int b) {
        a %= MOD;
        int result = 1;
        for (int i = 0; i < b; i++) {
            result = (result * a) % MOD;
        }
        return result;
    }
}