class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        // int r = matrix.length;
        List<Integer> arr = new ArrayList<>();
        // int c = matrix[0].length;
        // for(int i=0;i<r;i++){
        //     for(int j=0;j<c;j++){
        //         arr.add(matrix[i][j]);
        //     }
        //     c--;
        //     for(int j=i+1;j<r;j++){
        //         arr.add(matrix[j][c]);
        //     }
        //     c--;
        //     for(int j=c;j>=i;j--){
        //         arr.add(matrix[r-i-1][j]);
        //     }
        //     for(int j=r-i-1;j>i;j--){
        //         arr.add(matrix[j][c-i-1]);
        //     }
        //     return arr;
        // }
        int top = 0;
        int right = matrix[0].length-1;
        int bottom = matrix.length-1;
        int left = 0;
        while (top <= bottom && left <= right) {
            for (int i = left; i <= right; i++)
                arr.add(matrix[top][i]);
            top++;

            for (int j = top; j <= bottom; j++)
                arr.add(matrix[j][right]);
            right--;

            if (top <= bottom) {
                for (int k = right; k >= left; k--)
                    arr.add(matrix[bottom][k]);
                bottom--;
            }
            if (left <= right) {
                for (int l = bottom; l >= top; l--)
                    arr.add(matrix[l][left]);
                left++;
            }
        }
        return arr;
    }
}