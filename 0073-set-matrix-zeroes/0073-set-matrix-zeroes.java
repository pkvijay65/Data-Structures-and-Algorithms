class Solution {
    public void setZeroes(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        boolean hasRowZero = false;
        boolean hasColomnZero = false;
        
        for (int i = 0; i<n; i++){
            if (matrix[i][0] == 0){
                hasColomnZero = true;
            }
        }
        
        for (int i = 0; i<m; i++){
            if (matrix[0][i] == 0){
                hasRowZero = true;
            }
        }
        
        for (int i = 1; i<n; i++){
            for (int j = 1; j<m; j++){
                if (matrix[i][j] == 0){
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }
        
        for (int i = 1; i<n; i++){
            if (matrix[i][0] == 0){
                for (int j = 1; j<m; j++){
                    matrix[i][j] = 0;
                }
            }
        }
        
         for (int i = 1; i<m; i++){
            if (matrix[0][i] == 0){
                for (int j = 1; j<n; j++){
                    matrix[j][i] = 0;
                }
            }
        }
        
        if (hasRowZero){
            for (int i = 0; i<m; i++){
                matrix[0][i] = 0;
            }
        }
        
          if (hasColomnZero){
            for (int i = 0; i<n; i++){
                matrix[i][0] = 0;
            }
        }
           
        
//         int n = matrix.length;
//         int m = matrix[0].length;
//         int idx;
        
//         for (int i = 0; i<n; i++){
//             for (int j = 0; j<m; j++){
//                 if (matrix[i][j] == 0){
//                     idx = i -1;
//                     while (idx>=0){
//                         if(matrix[idx][j] !=0){
//                             matrix[idx][j] = -1;
//                             idx--;
//                         }
//                     }
                    
//                     idx = i + 1;
                    
//                     while (idx<=(n -1)){
//                         if(matrix[idx][j] !=0){
//                             matrix[idx][j] = -1;
//                             idx--;
//                         }
//                     }
                    
//                     idx = j - 1;
//                     while (idx>=0){
//                         if(matrix[i][idx] !=0){
//                             matrix[i][idx] = -1;
//                             idx--;
//                         }
//                     }
                    
//                     idx = j + 1;
//                     while (idx>=0){
//                         if(matrix[i][idx] !=0){
//                             matrix[i][idx] = -1;
//                             idx--;
//                         }
//                     }
                       
//                 }
//             }
//         }
        
//         for (int i = 0; i<n; i++){
//             for (int j = 0; j<m; j++){
//                 if (matrix[i][j] <0){
//                     matrix[i][j] = 0;
//                 }
//             }
//         }
        
    }
}