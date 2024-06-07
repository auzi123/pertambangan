/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package barang;

/**
 *
 * @author Acer
 */
public class Barang {
    private int idStok;
    private String namaBarang;

    public Barang(int idStok, String namaBarang) {
        this.idStok = idStok;
        this.namaBarang = namaBarang;
    }

    public int getIdStok() {
        return idStok;
    }

    public void setIdStok(int idStok) {
        this.idStok = idStok;
    }

    public String getNamaBarang() {
        return namaBarang;
    }

    public void setNamaBarang(String namaBarang) {
        this.namaBarang = namaBarang;
    }
}

