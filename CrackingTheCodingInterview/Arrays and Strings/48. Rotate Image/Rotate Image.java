/* 
    Time: O(row * column)
    Space: O(1)
*/

class Solution {
    void flipHorizontal(int[][] matrix){
        int n = matrix.length;
        int top = 0, bottom = n - 1;

        while(top < bottom){
            for(int j = 0; j < n; j++){
                int temp = matrix[top][j];
                matrix[top][j] = matrix[bottom][j];
                matrix[bottom][j] = temp;
            }
            top++;
            bottom--;
        }
    }

    void flipLeftDiagonal(int[][] matrix){
        int n = matrix.length;
        int top = 0, bottom = n - 1;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }        
    }

    public void rotate(int[][] matrix) {
        flipHorizontal(matrix);
        flipLeftDiagonal(matrix);
    }
}