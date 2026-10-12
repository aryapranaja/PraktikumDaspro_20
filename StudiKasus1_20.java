import java.util.Scanner;
public class StudiK {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        // Deklarasi dan inisialisasi variabel 
        int hargaPercup = 18000;
        int jumlahCup, uangBayar;
        int totalHarga, diskon, totalBayar;
        int kembalian, kurang;

        // Input
        System.out.print("masukkan jumlah cup: ");
        jumlahCup = input.nextInt();
        System.out.print("Masukkan uang bayar ");
        uangBayar = input.nextInt();

        // Hitung Total Harga
        totalHarga = jumlahCup = hargaPercup;
        diskon = 0;

        // cek Diskon
        if (totalHarga >= 100000) {
            diskon = totalHarga * 10/100 ;
        }

        // Hitung Total Bayar 
        totalBayar = totalHarga - diskon;

        // Output Rincian 
        System.out.println("\n---Ringkasan Pembayaran---");
        System.out.println("total Harga : Rp" +  totalHarga);
        System.out.println("Diskon      : Rp" + diskon);
        System.out.println("Total Bayar : Rp" + totalBayar);

        // Cek Pembayaran
        if (uangBayar >= totalBayar) {
            kembalian = uangBayar - totalBayar;
            System.out.println("kembalian : Rp + kembalian");
        } else {
            kurang = totalBayar - uangBayar;
            System.out.println("Uang tidak cukup, kurang Rp" + kurang);
        }
        input.close();
    }
}