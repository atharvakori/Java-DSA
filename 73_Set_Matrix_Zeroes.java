class Solution {
    public void setZeroes(int[][] matrix) {
        int row = 1, col = 1;
        int m = matrix.length; // no. of rows
        int n = matrix[0].length; // no. of cols

        for(int i = 0; i < m; i++){
            if(matrix[i][0] == 0) {
                row = 0;
                break;
            }
        }

        for(int j = 0; j < n; j++){
            if(matrix[0][j] == 0){
                col = 0;
                break;
            }
        }

        for(int i = 1; i < m; i++){
            for(int j = 1; j < n; j++){
                if(matrix[i][j]==0){
                    matrix[0][j] = 0; // This is col
                    matrix[i][0] = 0; // This is row
                }
            }
        }

        // Row
        for(int i = 1; i < m; i++){
            if(matrix[i][0]==0){
                for(int j = 1; j < n; j++){
                    matrix[i][j] = 0;
                }
            }
        }

        //Col
        for(int j = 1; j < n; j++){
            if(matrix[0][j]==0){
                for(int i = 1; i < m; i++){
                    matrix[i][j] = 0;
                }
            }
        }

        if(row==0){
            for(int i = 0; i < m; i++){
                matrix[i][0] = 0;
            }
        }

        if(col==0){
            for(int j = 0; j < n; j++){
                matrix[0][j] = 0;
            }
        }
    }
}
