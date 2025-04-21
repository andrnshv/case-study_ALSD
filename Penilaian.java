import java.util.Scanner;
public class Penilaian {
    Mahasiswa[] mhs = Mahasiswa.daftarMahasiswa;
    MataKuliah[] mk = MataKuliah.dataMataKuliah;

    Mahasiswa[] mahasiswaPenilaian = {
        mhs[0], mhs[0], mhs[1], mhs[2],mhs[2] 
    };

    MataKuliah[]mataKuliahPenilaian = {
        mk[0], mk[0], mk[1], mk[1] 
    };
    
        double[] nilaiTugas = {80, 60, 75, 85, 80};
        double[] nilaiUTS = {85, 75, 70, 90, 90};
        double[] nilaiUAS = {90, 70, 80, 95, 65};

        public void tampilkanMahasiswa(){
            System.out.println("\nDaftar Mahasiswa: ");
            for (Mahasiswa m : mhs){
                m.tampilMahasiswa();
            }
        }

        public void tampilkanMataKuliah(){
            System.out.println("\nDaftar Mata kuliah: ");
            for (MataKuliah m : mk){
                m.tampilMatakuliah();
            }
        }

        public void tampilkanPenilaian(){
            System.out.println("\nData Penilaian");
            for (int i = 0; i < mahasiswaPenilaian.length; i++){
                double nilaiAkhir = hitungNilaiAkhir(i);
                System.out.println(mahasiswaPenilaian[i].nama + (" | ") +
                mataKuliahPenilaian[i].namaMK + " | + Nilai Akhir: " + nilaiAkhir);
            }
        }

        public void urutkanNilaiAkhir(){
            System.out.println("\nData penilaian setelah diurutkan: ");
            int n = mahasiswaPenilaian.length;
            int[] urutan = new int[n];
                for (int i = 0; i < n; i++) urutan[i] = i;

                for(int i = 0; i < n -1; i++){
                    for(int j = 0; j < n-1; i++){
                        if(hitungNilaiAkhir(urutan[j]) < hitungNilaiAkhir(urutan[j + 1])) {
                        int temp = urutan[j];
                        urutan[j] = urutan [j+1];
                        urutan [j+1] = temp;
            
                    }
                }
            }
            for(int i : urutan) {
                double nilaiAkhir = hitungNilaiAkhir(i);
                System.out.println(mahasiswaPenilaian[i].nama + " | " + mataKuliahPenilaian[i].namaMK + " | Nilai Akhir: " + nilaiAkhir );
            }
        }

        public void cariMahasiswaDenganNim(Scanner sc) {
            System.out.println("Masukkan NIM mahasiswa yang dicari: ");
            String nim = sc.nextLine();
            Mahasiswa m = Mahasiswa.cariMahasiswaDenganNim(nim);
            if (m != null) {
                System.out.println("Mahasiswa Ditemukkan");
                m.tampilMahasiswa();
            } else {
                System.out.println("Mahasiswa tidak ditemukan");
            }
        }

        public double hitungNilaiAkhir(int index) {
            return (0.3 * nilaiTugas[index]) + (0.3 * nilaiUTS[index]) + (0.4 * nilaiUAS[index]);
        }
}
