public class Mahasiswa {

    String nim, nama, prodi;

    public Mahasiswa(String nim, String nama, String prodi) {
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
    }

    
    public void tampilMahasiswa () {
        System.out.println("NIM: " + nim + " | Nama: " + nama + " | Prodi: " + prodi);
    }

    public static Mahasiswa[] daftarMahasiswa = {
        new Mahasiswa("22001", "Ali Rahman", "informatika"),
        new Mahasiswa("22002", "Budi Santoso", "Informatika"),
        new Mahasiswa("22003", "Citra Dewi", "Sistem Informasi Bisnis")
    };
}
