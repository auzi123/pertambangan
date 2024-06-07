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

public class BarangKeluar extends Barang {
    private int id_bk;
    private String tgl_keluar;
    private int jumlah;
    private double harga;
    private double total;

    public BarangKeluar(int id_bk, int idStok, String namaBarang, String tgl_keluar, int jumlah, double harga, double total) {
        super(idStok, namaBarang);
        this.id_bk = id_bk;
        this.tgl_keluar = tgl_keluar;
        this.jumlah = jumlah;
        this.harga = harga;
        this.total = total;
    }

    public static BarangKeluar inputBarangKeluar() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan ID Barang Keluar: ");
        int id_bk = scanner.nextInt();
        System.out.println("Masukkan Tanggal Keluar: ");
        String tgl_keluar = scanner.next();
        System.out.println("Masukkan Jumlah: ");
        int jumlah = scanner.nextInt();
        System.out.println("Masukkan Harga: ");
        double harga = scanner.nextDouble();
        double total = jumlah * harga;
        System.out.println("Total: " + total);
        return new BarangKeluar(id_bk, 0, "", tgl_keluar, jumlah, harga, total); // idStok dan namaBarang diisi sementara dengan nilai default
    }

    public void displayBarangKeluar() {
        System.out.println("ID Barang Keluar: " + id_bk);
        System.out.println("ID Stok: " + getIdStok());
        System.out.println("Nama Barang: " + getNamaBarang());
        System.out.println("Tanggal Keluar: " + tgl_keluar);
        System.out.println("Jumlah: " + jumlah);
        System.out.println("Harga: " + harga);
        System.out.println("Total: " + total);
    }
}
