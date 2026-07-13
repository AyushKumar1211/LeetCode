class Solution {
    public int[][] generateMatrix(int n) {
        int[][] arr = new int[n][n];
        int num=1;
        int top = 0;
        int right = n-1;
        int bottom = n-1;
        int left = 0;
        while (top <= bottom && left <= right) {
            for (int i = left; i <= right; i++){
                arr[top][i] = num;
                num++;
            }
                
            top++;

            for (int j = top; j <= bottom; j++){
                arr[j][right] = num;
                num++;
            }
            right--;

            if (top <= bottom) {
                for (int k = right; k >= left; k--){
                    arr[bottom][k] = num;
                    num++;
                }
                bottom--;
            }
            if (left <= right) {
                for (int l = bottom; l >= top; l--){
                    arr[l][left]=num;
                    num++;
                }
                left++;
            }
        }
        return arr;
    }
}

