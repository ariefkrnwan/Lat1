public class Lat4OperasiMatriks { // Mendefinisikan kelas bernama Lat4OperasiMatriks
    public static void main(String[] args) { // Metode utama yang menjadi titik awal eksekusi program
        // Program operasi matriks
        int[][] matriksA = { // Mendefinisikan array 2D matriksA dengan elemen-elemen yang sudah ditentukan
            {1, 2, 3},
            {4, 5, 6}
        };

        int[][] matriksB = { // Mendefinisikan array 2D matriksB dengan elemen-elemen yang sudah ditentukan
            {7, 8, 9},
            {10, 11, 12}
        };

        // Penjumlahan matriks
        int[][] hasil = new int[2][3]; // Mendefinisikan array 2D hasil dengan ukuran 2x3 untuk menyimpan hasil penjumlahan

        for (int i = 0; i < matriksA.length; i++) { // Looping untuk setiap baris matriksA
            for (int j = 0; j < matriksA[0].length; j++) { // Looping untuk setiap kolom dalam baris matriksA
                hasil[i][j] = matriksA[i][j] + matriksB[i][j]; // Menjumlahkan elemen-elemen pada posisi yang sama dari matriksA dan matriksB, kemudian menyimpannya ke dalam matriks hasil
            }
        }

        // Menampilkan hasil
        System.out.println("Hasil penjumlahan matriks:"); // Menampilkan teks "Hasil penjumlahan matriks:"
        for (int[] baris : hasil) { // Looping untuk setiap baris dalam matriks hasil
            for (int nilai : baris) { // Looping untuk setiap elemen dalam baris
                System.out.print(nilai + " "); // Menampilkan setiap elemen matriks hasil dengan spasi antar elemen
            }
            System.out.println(); // Membuat baris baru setelah setiap baris matriks hasil
        }
    }
}

