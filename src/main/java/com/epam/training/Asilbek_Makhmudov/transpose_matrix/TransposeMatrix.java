package com.epam.training.Asilbek_Makhmudov.transpose_matrix;
import java.util.Arrays;

public class TransposeMatrix {
    public static int[][] transpose(int[][] matrix) {
        int[][] newMatrix = new int[matrix[0].length][matrix.length];
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++){
                newMatrix[j][i] = matrix[i][j];
            }
        }
        return newMatrix;
    }
    public static void main(String[] args) {
        System.out.println("Test your code here!\n");
        int[][] matrix = { {-4, -65, 56}, {78, -13, 32} };
        int[][] result = transpose(matrix);
        System.out.println(Arrays.deepToString(result).replace("],", "]\n"));
    }

}
