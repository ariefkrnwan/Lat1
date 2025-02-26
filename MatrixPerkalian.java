public class MatrixPerkalian {
    public static void main(String[] args) {
        // Matriks pertama
        int[][] matrix1 = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Matriks kedua
        int[][] matrix2 = {
            {9, 8, 7},
            {6, 5, 4},
            {3, 2, 1}
        };

        // Matriks hasil
        int[][] result = new int[matrix1.length][matrix2[0].length];

        // Perkalian matriks
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix2[0].length; j++) {
                for (int k = 0; k < matrix2.length; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }

        // Menampilkan hasil perkalian
        System.out.println("Hasil perkalian matriks:");
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[0].length; j++) {