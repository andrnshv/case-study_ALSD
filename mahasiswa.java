public class Mahasiswa {

    String nim;
    String nama;
    String prodi;

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
        new Mahasiswa("22001", "Budi Santoso", "Informatika"),
        new Mahasiswa("22003", "Citra Dewi", "Sistem Informasi Bisnis")
    };

    public static Mahasiswa cariMahasiswaDenganNim(String nim) {
        for (Mahasiswa m : daftarMahasiswa) {
            if (m.nim.equals(nim)) {
                return m;
            }
        }
        return null;
    }

}