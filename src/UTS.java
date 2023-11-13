import java.util.Scanner;

public class UTS {
    public static void main(String[] args) {
        String[] kode_barang = {"K1", "K2", "K3", "K4", "K5", "K6", "K7", "K8", "K9", "K10"};
        String[] nama_barang = {"Produk 1", "Produk 2", "Produk 3", "Produk 4", "Produk 5", "Produk 6", "Produk 7", "Produk 8", "Produk 9", "Produk 10"};
        double[] harga = {50.0, 45.0, 60.0, 30.0, 55.0, 40.0, 75.0, 28.0, 65.0, 50.0};

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

            double totalPerProduk = qty * harga[i];
            totalHarga += totalPerProduk;

            System.out.println("Detail Transaksi = ");
            System.out.println("Kode Barang = " + kode_barang[i]);
            System.out.println("Nama Barang = " + nama_barang[i]);
            System.out.println("Jumlah = " + qty);
            System.out.println("Harga per Produk: = " + harga[i]);
            System.out.println("Total Harga = " + totalPerProduk);
        }

        System.out.println("Total Jumlah Invoice untuk " + namaPelanggan + ": " + totalHarga);
    }
}
