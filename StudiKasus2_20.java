import java.util.Scanner;
public class StudiKasus2_20 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Nama Mahasiswa : ");
        String nama = sc.nextLine();

        System.out.print("Jenis kegiatan (BELMAWA/BAKORMA/MANDIRI/PKM/LAINNYA):");
        String jeniskegiatan = sc.nextLine();

        if (jeniskegiatan.equalsIgnoreCase("BELMAWA") ||
            jeniskegiatan.equalsIgnoreCase("BAKORMA") ||
            jeniskegiatan.equalsIgnoreCase("MANDIRI")) {
            
            System.out.print("Jumlah Dokumen:");
            int jmlDokumen = sc.nextInt();
            System.out.print("Peringkat Juara");
            int juara = sc.nextInt();

            if (juara >= 1 && juara <= 3 ) {
                if (jmlDokumen == 4 ) {
                    System.out.println("Status: Berhak memperoleh dana penghargaan ");
                } else {
                    int kurangDokumen = 4 - jmlDokumen;
                    System.out.println("Status: Dokumen tidak lengkap (kurang " + kurangDokumen + "dokumen). Dana penghargaan tidak diberikan.");
                }
            } else {
                System.out.println("Status: Tidak memperoleh dana penghargaan (hanya untuk Juara 1/2/3).");
            }
        
         } else if (jeniskegiatan.equalsIgnoreCase("PKM")) {
            System.out.print("Jumlah dokumen: ");
            int jmlDokumen = sc.nextInt();
            System.out.println("Status pendanaan PKM (1 = lolos, 0 = tidak lolos):");
            int statusPkm = sc.nextInt();

            if (statusPkm == 1) {
                if (jmlDokumen == 4 ) {
                    System.out.println("Status: Berhak memperoleh dana penghargaan (PKM lolos pendanaan).");
                } else {
                    int kurangDokumen = 4 - jmlDokumen;
                    System.out.println("Status: Tidak memperoleh dana penghargaan (PKM tidak lengkap (kurang " + kurangDokumen + " dokumen). Dana penghargaan tidak diberikan.");
                }
            } else if (jeniskegiatan.equalsIgnoreCase("LAINNYA")) {
                System.out.println("Status:  Tidak memperoleh dana penghargaan (jenis kegiatan tidak termasuk ketentuan).");
            } else {
                System.out.println("Status: Jenis kegiatan tidak valid.");
            }
            sc.close();
         }

    }
}