public class Lat3StatistikArray { // Mendefinisikan kelas bernama Lat3StatistikArray
    public static void main(String[] args) { // Metode utama yang menjadi titik awal eksekusi program
        // Program menghitung statistik nilai siswa
        int[] nilai = {75, 80, 65, 90, 85, 70, 95, 88}; // Membuat array nilai dengan elemen-elemen yang sudah ditentukan

        // Mencari nilai tertinggi dan terendah
        int tertinggi = nilai[0]; // Inisialisasi nilai tertinggi dengan elemen pertama array
        int terendah = nilai[0]; // Inisialisasi nilai terendah dengan elemen pertama array
        int total = nilai[0]; // Inisialisasi total dengan elemen pertama array

        for (int i = 1; i < nilai.length; i++) { // Looping dimulai dari indeks 1 untuk memeriksa setiap elemen dalam array
            if (nilai[i] > tertinggi) tertinggi = nilai[i]; // Jika nilai pada indeks i lebih besar dari nilai tertinggi saat ini, update nilai tertinggi
            if (nilai[i] < terendah) terendah = nilai[i]; // Jika nilai pada indeks i lebih kecil dari nilai terendah saat ini, update nilai terendah
            total += nilai[i]; // Menambahkan nilai pada indeks i ke total
        }

        double rataRata = (double) total / nilai.length; // Menghitung rata-rata dengan membagi total nilai dengan jumlah elemen array

        System.out.println("Nilai tertinggi: " + tertinggi); // Menampilkan nilai tertinggi
        System.out.println("Nilai terendah: " + terendah); // Menampilkan nilai terendah
        System.out.println("Rata-rata: " + rataRata); // Menampilkan rata-rata nilai
    }
}

