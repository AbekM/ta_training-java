package com.epam.training.Asilbek_Makhmudov.spiral;

class Spiral {
    static int[][] spiral(int rows, int columns) {
        int[] [] twoD = new int[rows][columns];
        int l = 0;
        int k = 0;
        int i;
        int x = 1;
        while (k < rows && l < columns) {
            for (i = l; i < columns; ++i) {
               twoD[k][i] = x;
               x++;
            }
            k++;
            for (i = k; i < rows; ++i) {
                twoD[i][columns - 1] = x;
                x++;
            }
            columns--;
            if (k < rows) {
                for (i = columns - 1; i >= l; --i) {
                    twoD[rows - 1][i] = x;
                    x++;
                }
                rows--;
            }
            if (l < columns) {
                for (i = rows - 1; i >= k; --i) {
                   twoD[i][l] = x;
                   x++;
                }
                l++;
            }
        }   return twoD;
    }
}
