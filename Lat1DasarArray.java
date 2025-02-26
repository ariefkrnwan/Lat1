public class LatihanArray1 { // Mendefinisikan kelas bernama LatihanArray1
    public static void main(String[] args) { // Metode utama yang menjadi titik awal eksekusi program
        // Buat program untuk:
        // 1. Membuat array dengan 10 bilangan bulat
        // 2. Mengisi array dengan bilangan genap mulai dari 2
        // 3. Menampilkan isi array
        // 4. Menghitung jumlah semua elemen array

        int[] bilanganGenap = new int[10]; // Membuat array bilanganGenap dengan ukuran 10 elemen
        int jumlah = 0; // Mendeklarasikan variabel jumlah dengan nilai awal 0

        // Mengisi array
        for (int i = 0; i < bilanganGenap.length; i++) { // Looping untuk mengisi array
            bilanganGenap[i] = (i + 1) * 2; // Mengisi array dengan bilangan genap mulai dari 2
        }

        // Menampilkan array
        System.out.println("Isi array:"); // Menampilkan teks "Isi array:"
        for (int bilangan : bilanganGenap) { // Looping untuk menampilkan elemen array
            System.out.print(bilangan + " "); // Menampilkan setiap elemen array dengan spasi antar elemen
            jumlah += bilangan; // Menambahkan nilai elemen array ke variabel jumlah
        }

        // Menampilkan jumlah semua elemen
        System.out.println("\nJumlah semua elemen: " + jumlah); // Menampilkan total jumlah semua elemen array
    }
}

