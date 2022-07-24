package com.epam.training.Asilbek_Makhmudov.multiply_matrices;
import java.util.Arrays;

public class MultiplyMatrix {
    public static int[][] multiply(int[][] matrix1, int[][] matrix2) {
        int[][] product = new int[matrix1.length][matrix2[0].length];
        for (int i = 0; i < product.length; i++){
            for (int j = 0; j < product[0].length; j++){
                for (int k = 0; k < matrix1[0].length; k++){
                    product[i][j] += matrix1[i][k]*matrix2[k][j];
                }
            }
        }
        return product;
    }

    public static void main(String[] args) {
        System.out.println("Test your code here!\n");
        int[][] a = {
                {0, 12345},
                {4509, 0},
                {3, 567} };
        int[][] b = {
                {653, 0, 25353},
                {0, 61, 6} };
        int[][] result = multiply(a, b);
        System.out.println(Arrays.deepToString(result).replace("],", "]\n"));
    }
}
