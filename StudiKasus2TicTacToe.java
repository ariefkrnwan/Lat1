public class StudiKasus2TicTacToe { // Mendefinisikan kelas bernama StudiKasus2TicTacToe
    public static void main(String[] args) { // Metode utama yang menjadi titik awal eksekusi program
        char[][] papan = new char[3][3]; // Mendeklarasikan array 2D char dengan ukuran 3x3 untuk papan permainan

        // Inisialisasi papan kosong
        for (int i = 0; i < 3; i++) { // Looping untuk setiap baris papan
            for (int j = 0; j < 3; j++) { // Looping untuk setiap kolom dalam baris
                papan[i][j] = '-'; // Mengisi setiap elemen papan dengan karakter '-' untuk menunjukkan papan kosong
            }
        }

        // Simulasi beberapa langkah
        papan[0][0] = 'X'; // Menempatkan 'X' pada posisi (0,0) di papan
        papan[1][1] = 'O'; // Menempatkan 'O' pada posisi (1,1) di papan
        papan[2][2] = 'X'; // Menempatkan 'X' pada posisi (2,2) di papan

        // Tampilkan papan
        System.out.println("Status Papan:"); // Menampilkan teks "Status Papan:"
        tampilkanPapan(papan); // Memanggil metode tampilkanPapan untuk menampilkan kondisi papan saat ini
    }

    public static void tampilkanPapan(char[][] papan) { // Metode untuk menampilkan kondisi papan
        for (int i = 0; i < 3; i++) { // Looping untuk setiap baris papan
            for (int j = 0; j < 3; j++) { // Looping untuk setiap kolom dalam baris
                System.out.print(papan[i][j] + " "); // Menampilkan setiap elemen papan dengan spasi antar elemen
            }
            System.out.println(); // Membuat baris baru setelah setiap baris papan
        }
    }
}

