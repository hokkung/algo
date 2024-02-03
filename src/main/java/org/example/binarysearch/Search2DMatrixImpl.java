package org.example.binarysearch;

public class Search2DMatrixImpl implements Search2DMatrix {
    @Override
    public boolean searchMatrix(int[][] matrix, int target) {
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][matrix[i].length - 1] > target) {
                int l = 0;
                int r = matrix[i].length - 1;
                while (l <= r) {
                    int m = (l + r) / 2;
                    if (matrix[i][m] == target) {
                        return true;
                    } else if (matrix[i][m] < target) {
                        l = m + 1;
                    } else {
                        r = m -1;
                    }
                }
            } else if (matrix[i][matrix[i].length - 1] == target) {
                return true;
            }
        }
        return false;
    }
}
