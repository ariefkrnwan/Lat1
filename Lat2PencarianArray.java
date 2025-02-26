public class Lat2PencarianArray { // Mendefinisikan kelas bernama Lat2PencarianArray
    public static void main(String[] args) { // Metode utama yang menjadi titik awal eksekusi program
        // Program mencari nilai dalam array
        int[] nilai = {75, 80, 65, 90, 85, 70, 95, 88}; // Membuat array nilai dengan elemen-elemen yang sudah ditentukan
        int cari = 90; // Mendefinisikan nilai yang akan dicari dalam array
        boolean ketemu = false; // Variabel untuk menandakan apakah nilai yang dicari ditemukan atau tidak
        int indeks = -1; // Variabel untuk menyimpan indeks nilai yang ditemukan, default -1 (tidak ditemukan)

        // Mencari nilai
        for (int i = 0; i < nilai.length; i++) { // Looping untuk memeriksa setiap elemen dalam array
            if (nilai[i] == cari) { // Jika nilai pada indeks i sama dengan nilai yang dicari
                ketemu = true; // Tandai bahwa nilai ditemukan
                indeks = i; // Simpan indeks nilai yang ditemukan
                break; // Hentikan loop setelah nilai ditemukan
            }
        }

        // Menampilkan hasil
        if (ketemu) { // Jika nilai ditemukan
            System.out.println("Nilai " + cari + " ditemukan pada indeks " + indeks); // Tampilkan pesan nilai ditemukan
        } else { // Jika nilai tidak ditemukan
            System.out.println("Nilai " + cari + " tidak ditemukan"); // Tampilkan pesan nilai tidak ditemukan
        }
    }
}

