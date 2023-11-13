import java.util.Scanner;

public class UTS {
    public static void main(String[] args) {
        String[] kode_barang = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
        String[] nama_barang = {"Produk 1", "Produk 2", "Produk 3", "Produk 4", "Produk 5", "Produk 6", "Produk 7", "Produk 8", "Produk 9", "Produk 10"};
        int[] harga = {50000, 45000, 60000, 30000, 55000, 40000, 75000, 28000, 65000, 50000};

        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nama pelanggan = ");
        String namaPelanggan = scanner.nextLine();

        double totalHarga = 0;

        System.out.println("Pilih Produk = ");
        System.out.println("Kode\tNama\tHarga");
        for (int i = 0; i < kode_barang.length; i++) {
            System.out.println(kode_barang[i] + "\t" + nama_barang[i] + "\t" + harga[i]);
        }

        for (int i = 0; i < kode_barang.length; i++) {
            System.out.print("Masukkan jumlah " + nama_barang[i] + " = ");
            int qty = scanner.nextInt();

            int totalPerProduk = qty * harga[i];
            totalHarga += totalPerProduk;

            System.out.println("Detail Transaksi: ");
            System.out.println("Kode Barang = " + kode_barang[i]);
            System.out.println("Nama Barang = " + nama_barang[i]);
            System.out.println("Jumlah = " + qty);
            System.out.println("Harga per Produk: = " + harga[i]);
            System.out.println("Total Harga = " + totalPerProduk);
        }

        System.out.println("Total Jumlah Invoice untuk " + namaPelanggan + ": " + totalHarga);
    }
}
