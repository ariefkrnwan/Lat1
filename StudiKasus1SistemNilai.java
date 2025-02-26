public class StudiKasus1SistemNilai { // Mendefinisikan kelas bernama StudiKasus1SistemNilai
    public static void main(String[] args) { // Metode utama yang menjadi titik awal eksekusi program
        // Data siswa
        String[] namaSiswa = {"Ani", "Budi", "Cici", "Dodi", "Edi"}; // Mendefinisikan array nama siswa dengan elemen-elemen yang sudah ditentukan
        int[][] nilai = { // Mendefinisikan array 2D nilai dengan nilai siswa untuk masing-masing mata pelajaran
            {80, 85, 90}, // Nilai Ani
            {75, 70, 85}, // Nilai Budi
            {85, 80, 88}, // Nilai Cici
            {90, 85, 95}, // Nilai Dodi
            {70, 75, 80}  // Nilai Edi
        };
        String[] mapel = {"Matematika", "Bahasa Inggris", "IPA"}; // Mendefinisikan array nama mata pelajaran

        // Menghitung rata-rata per siswa
        System.out.println("Rata-rata nilai per siswa:"); // Menampilkan teks "Rata-rata nilai per siswa:"
        for (int i = 0; i < nilai.length; i++) { // Looping untuk setiap siswa
            double total = 0; // Inisialisasi variabel total dengan nilai 0
            for (int n : nilai[i]) { // Looping untuk setiap nilai siswa
                total += n; // Menambahkan nilai ke total
            }
            double rataSiswa = total / nilai[i].length; // Menghitung rata-rata nilai siswa
            System.out.printf("%s: %.2f\n", namaSiswa[i], rataSiswa); // Menampilkan rata-rata nilai siswa dengan format 2 desimal
        }

        // Menghitung rata-rata per mata pelajaran
        System.out.println("\nRata-rata nilai per mata pelajaran:"); // Menampilkan teks "Rata-rata nilai per mata pelajaran:"
        for (int j = 0; j < nilai[0].length; j++) { // Looping untuk setiap mata pelajaran
            double total = 0; // Inisialisasi variabel total dengan nilai 0
            for (int i = 0; i < nilai.length; i++) { // Looping untuk setiap siswa
                total += nilai[i][j]; // Menambahkan nilai mata pelajaran ke total
            }
            double rataMapel = total / nilai.length; // Menghitung rata-rata nilai mata pelajaran
            System.out.printf("%s: %.2f\n", mapel[j], rataMapel); // Menampilkan rata-rata nilai mata pelajaran dengan format 2 desimal
        }
    }
}

