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
            }

    }
}