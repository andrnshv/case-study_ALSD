import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Penilaian penilaian = new Penilaian();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n=== MENU SISTEM AKADEMIK ===");
            System.out.println("1. Tampilkan Daftar Mahasiswa");
            System.out.println("2. Tampilkan Daftar Mata Kuliah");
            System.out.println("3. Tampilkan Data Penilaian");
            System.out.println("4. Urutkan Mahasiswa Berdasarkan Nilai AKhir");
            System.out.println("5. Cari Mahasiswa Berdasarkan NIM");
            System.out.println("6. Keluar");
            System.out.print("Pilih menu: ");
            int pilihan = sc.nextInt();
            sc.nextLine();

            if (pilihan == 1) {
                penilaian.tampilkanMahasiswa();
            } else if (pilihan == 2) {
                penilaian.tampilkanMataKuliah();
            } else if (pilihan == 3) {
                penilaian.tampilkanPenilaian();
            } else if (pilihan == 4) {
                penilaian.urutkanNilaiAkhir();
            } else if (pilihan == 5) {
                penilaian.cariMahasiswa(sc);
            } else if (pilihan == 0) {
                System.out.println("Terima kasih telah menggunakan Sistem Akademik.");
                return;
            } else {
                System.out.println("Menu tidak valid. Silahkan coba lagi");
            }
        }
    }
}

