package org.example.twopointer;

public class RotateImageImpl implements RotateImage {
    @Override
    public void rotate(int[][] matrix) {
        int l = 0;
        int r = matrix.length -1;
        while (l < r) {
            for (int i = 0; i < (r-l); i++) {
                int t = l;
                int b = r;
                int topLeft = matrix[t][l+i];
                matrix[t][l+i] = matrix[b-i][l];
                matrix[b-i][l] = matrix[b][r-i];
                matrix[b][r-i] =  matrix[t+i][r];
                matrix[t+i][r] = topLeft;
            }
            l++;
            r--;
        }
    }
}
