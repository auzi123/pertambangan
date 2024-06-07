/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package barang;

/**
 *
 * @author Acer
 */
import java.util.Scanner;

public class BarangMasuk extends Barang {
    private int id_bm;
    private String tgl_masuk;
    private int jumlah;
    private double harga;
    private double total;

    public BarangMasuk(int id_bm, int idStok, String namaBarang, String tgl_masuk, int jumlah, double harga, double total) {
        super(idStok, namaBarang);
        this.id_bm = id_bm;
        this.tgl_masuk = tgl_masuk;
        this.jumlah = jumlah;
        this.harga = harga;
        this.total = total;
    }

    public static BarangMasuk inputBarangMasuk() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan ID Barang Masuk: ");
        int id_bm = scanner.nextInt();
        System.out.println("Masukkan Tanggal Masuk: ");
        String tgl_masuk = scanner.next();
        System.out.println("Masukkan Jumlah: ");
        int jumlah = scanner.nextInt();
        System.out.println("Masukkan Harga: ");
        double harga = scanner.nextDouble();
        double total = jumlah * harga;
        System.out.println("Total: " + total);
        return new BarangMasuk(id_bm, 0, "", tgl_masuk, jumlah, harga, total); // idStok dan namaBarang diisi sementara dengan nilai default
    }

    public void displayBarangMasuk() {
        System.out.println("ID Barang Masuk: " + id_bm);
        System.out.println("ID Stok: " + getIdStok());
        System.out.println("Nama Barang: " + getNamaBarang());
        System.out.println("Tanggal Masuk: " + tgl_masuk);
        System.out.println("Jumlah: " + jumlah);
        System.out.println("Harga: " + harga);
        System.out.println("Total: " + total);
    }
}
