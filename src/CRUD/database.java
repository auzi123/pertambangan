/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CRUD;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import CRUD.database; 
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
/**
 * 
 * 
 */
public class database {
    private String databaseName = "ahmadfauzi_2210010510";
    private String username = "root";
    private String password = "";
    public static Connection connectionDB;
   
   public database (){
       try {
           String location  = "jdbc:mysql://localhost/" + databaseName;
           Class.forName("com.mysql.jdbc.Driver");
           connectionDB = DriverManager.getConnection(location, username, password);
           System.out.println("databse terkoneksi");
           
       } catch (Exception e) {
           System.out.println(e.getMessage());
       }
   }

   public void simpanuji(String nik, String nama, String telp, String alamat){
     try{
         String sql = "insert into Uji ( nik, nama, telp, Alamat)value (?,?,?,?)";
         PreparedStatement perintah = connectionDB.prepareStatement(sql);
         perintah.setString(1, nik);
         perintah.setString(2, nama);
         perintah.setString(3, telp);
         perintah.setString(4, alamat);
         
          perintah.executeUpdate(); 
             System.out.println("data berhasil disimpan");
        
     }  
     catch (Exception e){
         System.out.println(e.getMessage());
     }
   }
      public void ubahuji(String nik, String nama, String telp, String alamat){
     try{
         String sql = "Update Uji set nama = ?, telp =?, alamat = ? where nik =?";
         PreparedStatement perintah = connectionDB.prepareStatement(sql);
         perintah.setString(1, nama);
         perintah.setString(2, telp);
         perintah.setString(3, alamat);
         perintah.setString(4, nik);
         
         perintah.executeUpdate(); 
             System.out.println("data berhasil diubah");
        
     }  
       catch (Exception e){
         System.out.println(e.getMessage());
     }
   }
     public void hapusuji(String Nik ){
     try{
         String sql = " delete from uji where nik = 1";
         PreparedStatement perintah = connectionDB.prepareStatement(sql);
         
         perintah.executeUpdate(); 
             System.out.println("data berhasil dihapus");
             }  
     catch (Exception e){
         System.out.println(e.getMessage());

 }
     }
     // tabel notif
     public void simpannotif(String id_notif, String level, String lihat, String dates){
     try{
         String sql = "insert into notif ( id_notif, level, lihat, Dates)value (?,?,?,?)";
         PreparedStatement perintah = connectionDB.prepareStatement(sql);
         perintah.setString(1, id_notif);
         perintah.setString(2, level);
         perintah.setString(3, lihat);
         perintah.setString(4, dates);
         
          perintah.executeUpdate(); 
             System.out.println("data berhasil disimpan");
        
     }  
     catch (Exception e){
         System.out.println(e.getMessage());
     }
   }
      public void ubahnotif(String id_notif, String level, String lihat, String dates){
     try{
         String sql = "Update Uji set id_notif = ?, level =?, lihat = ? where dates =?";
         PreparedStatement perintah = connectionDB.prepareStatement(sql);
         perintah.setString(1, id_notif);
         perintah.setString(2, level);
         perintah.setString(3, lihat);
         perintah.setString(4, dates);
         
         perintah.executeUpdate(); 
             System.out.println("data berhasil diubah");
        
     }  
       catch (Exception e){
         System.out.println(e.getMessage());
     }
   }
     public void hapusnotif(String id_notif ){
     try{
         String sql = " delete from uji where id_notif = 1";
         PreparedStatement perintah = connectionDB.prepareStatement(sql);
         perintah.executeUpdate();
         perintah.executeUpdate(); 
             System.out.println("data berhasil dihapus");
             }  
     catch (Exception e){
         System.out.println(e.getMessage());

 }
     }
     public void datanotif(){
         try {
             Statement stmt = connectionDB.createStatement();
             ResultSet baris = stmt.executeQuery("select * from notif ORDER BY id_notif ASC");
             while(baris.next()){
                 System.out.println(baris.getInt("id_notif")+" | "+
                         baris.getString("level")+" | "+
                         baris.getString("lihat")+" | "+
                         baris.getString("dates"));
             }
         } 
         catch (Exception e) {
             System.err.println(e.getMessage());
         }
     }
    public void carinotif(Integer paraminotif){
         try {
             String sql = "select * from notif where id_notif = ?";
             PreparedStatement perintah = connectionDB.prepareStatement (sql);
             perintah.setInt(1, paraminotif);
             ResultSet data = perintah.executeQuery();
             while (data.next()){
                 System.out.println("id : "+data.getInt("id_notif"));
                 System.out.println("level "+data.getString("level"));
                 System.out.println("lihat : "+data.getString("lihat"));
             }
         } 
         catch (Exception e) {
         }
     }
     public void simpanStokBarang(int id_stok, String nama_barang, String merk, String stok, String kategori, String satuan){
     try{
         String sql = "insert into stok_barang ( id_stok, nama_barang, merk, stok, kategori, satuan)value (?,?,?,?,?,?)";
         PreparedStatement perintah = connectionDB.prepareStatement(sql);
         perintah.setInt(1, id_stok);
         perintah.setString(2, nama_barang);
         perintah.setString(3, merk);
         perintah.setString(4, stok);
         perintah.setString(5, kategori);
         perintah.setString(6, satuan);
          perintah.executeUpdate(); 
             System.out.println("data berhasil disimpan");
        
     }  
     catch (Exception e){
         System.out.println(e.getMessage());
     }
   }
     // tabel stok bareng

      public void ubahStokBarang(int id_stok, String nama_Barang, String merk, String stok, String Kategori, String satuan){
     try{
         String sql = "Update stok_barang set id_stok = ?, nama_Barang =?, merk = ? where stok = ? Kategori = ? satuan =?";
         PreparedStatement perintah = connectionDB.prepareStatement(sql);
         perintah.setInt(1, id_stok);
         perintah.setString(2, nama_Barang);
         perintah.setString(3, merk);
         perintah.setString(4, stok);
         perintah.setString(5, Kategori);
         perintah.setString(6, satuan);
         
         perintah.executeUpdate(); 
             System.out.println("data berhasil diubah");
        
     }  
       catch (Exception e){
         System.out.println(e.getMessage());
     }
   }
     public void hapusStokBarang(int id_stok ){
     try{
         String sql = " delete from stok_barang where id_stok = 1";
         PreparedStatement perintah = connectionDB.prepareStatement(sql);
         perintah.setInt(1, id_stok);
         perintah.executeUpdate(); 
             System.out.println("data berhasil dihapus");
             }  
     catch (Exception e){
         System.out.println(e.getMessage());
        }
    }
     
     public void dataStokBarang (){
       try {
           Statement stmt = connectionDB.createStatement();
           ResultSet baris = stmt.executeQuery("select * from stok_barang ORDER BY id_stok ASC");
           while(baris.next()) {
               System.out.println(baris.getInt("id_stok")+" | "+
                       baris.getString("nama_barang")+" | "+
                       baris.getString("merk")+" | "+
                       baris.getString("stok")+" | "+
                       baris.getString("kategori")+" | "+
                       baris.getString("satuan"));
           }
       }
       catch(Exception e) {
           System.err.println(e.getMessage());
           
       }
     }
     public void cariStokBarang(Integer paramiStokBarang){
         try {
             String sql = "select * from stok_barang where id_stok = ?";
             PreparedStatement perintah = connectionDB.prepareStatement (sql);
             perintah.setInt(1, paramiStokBarang);
             ResultSet data = perintah.executeQuery();
             while (data.next()){
                 System.out.println("id : "+data.getInt("id_stok"));
                 System.out.println("nama "+data.getString("nama_barang"));
                 System.out.println("merk "+data.getString("merk"));
                 System.out.println("stok "+data.getString("stok"));
                 System.out.println("kategori "+data.getString("kategori"));
                 System.out.println("satuan "+data.getString("satuan"));
             }
         } 
         catch (Exception e) {
         }
     }
public void simpanBarangRusak(int id_br , int id_stok, String tgl_rusak, String jumlah, String keterangan){
     try{
         String sql = "insert into barang_rusak ( id_br, id_stok, tgl_rusak, jumlah, keterangan)value (?,?,?,?,?)";
         PreparedStatement perintah = connectionDB.prepareStatement(sql);
         perintah.setInt(1, id_br);
         perintah.setInt(2, id_stok );
         perintah.setString(3, tgl_rusak);
         perintah.setString(4, jumlah);
         perintah.setString(5, keterangan);
          perintah.executeUpdate(); 
             System.out.println("data berhasil disimpan");
        
     }  
     catch (Exception e){
         System.out.println(e.getMessage());
     }
   }
public void ubahBarangRusak(int id_br , int id_stok, String tgl_rusak, String jumlah, String keterangan){
     try{
         String sql = "Update barang_rusak set id_br = ?, id_stok =?, tgl_rusak = ?, jumlah = ? where Keterangan = ?";
         PreparedStatement perintah = connectionDB.prepareStatement(sql);
         perintah.setInt(1, id_stok);
         perintah.setInt(2, id_stok);
         perintah.setString(3, tgl_rusak);
         perintah.setString(4, jumlah);
         perintah.setString(5, keterangan);
         perintah.executeUpdate(); 
             System.out.println("data berhasil diubah");
        
     }  
       catch (Exception e){
         System.out.println(e.getMessage());
     }
   }
public void hapusBarangRusak(int id_stok){
try{
         String sql = " delete from barang_rusal where id_stok = 1";
         PreparedStatement perintah = connectionDB.prepareStatement(sql);
         perintah.setInt(1, id_stok);
         perintah.executeUpdate(); 
             System.out.println("data berhasil dihapus");
             }  
     catch (Exception e){
         System.out.println(e.getMessage());

 }
     }
public void dataBarangRusak (){
       try {
           Statement stmt = connectionDB.createStatement();
           ResultSet baris = stmt.executeQuery("select * from stok_barang ORDER BY id_stok ASC");
           while(baris.next()) {
               System.out.println(baris.getInt("id_stok")+" | "+
                       baris.getString("nama_barang")+" | "+
                       baris.getString("merk")+" | "+
                       baris.getString("stok")+" | "+
                       baris.getString("kategori")+" | "+
                       baris.getString("satuan"));
           }
       }
       catch(Exception e) {
           System.err.println(e.getMessage());
           
       }
     }
     public void cariBarangRusak(Integer paramiStokBarang){
         try {
             String sql = "select * from stok_barang where id_stok = ?";
             PreparedStatement perintah = connectionDB.prepareStatement (sql);
             perintah.setInt(1, paramiStokBarang);
             ResultSet data = perintah.executeQuery();
             while (data.next()){
                 System.out.println("id : "+data.getInt("id_stok"));
                 System.out.println("nama "+data.getString("nama_barang"));
                 System.out.println("merk "+data.getString("merk"));
                 System.out.println("stok "+data.getString("stok"));
                 System.out.println("kategori "+data.getString("kategori"));
                 System.out.println("satuan "+data.getString("satuan"));
             }
         } 
         catch (Exception e) {
         }
     }
public void simpanBarangMasuk(int id_bm ){
     try{
         String sql = "insert into barang_masuk ( id_bm, id_stok, tgl_masuk, jumlah, harga, total) value (?,?,?,?,?,?)";
         PreparedStatement perintah = connectionDB.prepareStatement(sql);
         perintah.setInt(1, id_bm);
          perintah.executeUpdate(); 
             System.out.println("data berhasil disimpan");
        
     }  
     catch (Exception e){
         System.out.println(e.getMessage());
     }
   }

public void ubahBarangMasuk (int id_bm , int id_stok, String tgl_masuk, String jumlah, String harga, String total){
     try{
         String sql = "Update barang_masuk set id_bm = ?, id_stok =?, tgl_masuk = ?, jumlah = ?, harga = ? where total = ?";
         PreparedStatement perintah = connectionDB.prepareStatement(sql);
         perintah.setInt(1, id_bm);
         perintah.setInt(2, id_stok);
         perintah.setString(3, tgl_masuk);
         perintah.setString(4, jumlah);
         perintah.setString(5, harga);
         perintah.setString(6, total);
         perintah.executeUpdate(); 
             System.out.println("data berhasil diubah");
        
     }  
       catch (Exception e){
         System.out.println(e.getMessage());
     }
   }
public void hapusBarangMasuk(int id_bm) throws SQLException{
         String sql = " delete from barang_masuk where id_bm = 1";
         PreparedStatement perintah = connectionDB.prepareStatement(sql);
         perintah.setInt(1, id_bm);
         perintah.executeUpdate(); 
             System.out.println("data berhasil dihapus");
}
     catch (Exception e){
         System.out.println(e.getMessage());

 }
     }
public void dataBarangMasuk (){
       try {
           Statement stmt = connectionDB.createStatement();
           ResultSet baris = stmt.executeQuery("select * from barang_masuk ORDER BY id_stok ASC");
           while(baris.next()) {
               System.out.println(baris.getInt("id_stok")+" | "+
                       baris.getString("nama_barang")+" | "+
                       baris.getString("merk")+" | "+
                       baris.getString("stok")+" | "+
                       baris.getString("kategori")+" | "+
                       baris.getString("satuan"));
           }
       }
       catch(Exception e) {
           System.err.println(e.getMessage());
           
       }
     }
     public void cariStokBarang(Integer paramiStokBarang){
         try {
             String sql = "select * from stok_barang where id_stok = ?";
             PreparedStatement perintah = connectionDB.prepareStatement (sql);
             perintah.setInt(1, paramiStokBarang);
             ResultSet data = perintah.executeQuery();
             while (data.next()){
                 System.out.println("id : "+data.getInt("id_stok"));
                 System.out.println("nama "+data.getString("nama_barang"));
                 System.out.println("merk "+data.getString("merk"));
                 System.out.println("stok "+data.getString("stok"));
                 System.out.println("kategori "+data.getString("kategori"));
                 System.out.println("satuan "+data.getString("satuan"));
             }
         } 
         catch (Exception e) {
         }
     }
public void simpanBarangKeluar(int id_bk , int id_stok, String tgl_keluar, String jumlah_keluar){
     try{
         String sql = "insert into barang_keluar ( id_bk, id_stok, tgl_keluar, jumlah_keluar)value (?,?,?,?)";
         PreparedStatement perintah = connectionDB.prepareStatement(sql);
         perintah.setInt(1, id_bk);
         perintah.setInt(2, id_stok );
         perintah.setString(3, tgl_keluar);
         perintah.setString(4, jumlah_keluar);
          perintah.executeUpdate(); 
             System.out.println("data berhasil disimpan");
     }  
     catch (Exception e){
         System.out.println(e.getMessage());
     }
   }

public void ubahBarangKeluar(int id_bk , int id_stok, String tgl_keluar, String jumlah_keluar){
     try{
         String sql = "Update barang_keluar set id_bk = ?, id_stok =?, tgl_keluar = ? where jumlah_keluar =? ";
         PreparedStatement perintah = connectionDB.prepareStatement(sql);
         perintah.setInt(1, id_bk);
         perintah.setInt(2, id_stok);
         perintah.setString(3, tgl_keluar);
         perintah.setString(4, jumlah_keluar);
         
         perintah.executeUpdate(); 
             System.out.println("data berhasil diubah");
        
     }  
       catch (Exception e){
         System.out.println(e.getMessage());
     }
   }
public void hapusBarangKeluar(int id_bk){
try{
         String sql = " delete from barang_keluar where id_bk = 1";
         PreparedStatement perintah = connectionDB.prepareStatement(sql);
         perintah.setInt(1, id_bk);
         perintah.executeUpdate(); 
             System.out.println("data berhasil dihapus");
             }  
     catch (Exception e){
         System.out.println(e.getMessage());

 }
     }
public void dataStokBarang (){
       try {
           Statement stmt = connectionDB.createStatement();
           ResultSet baris = stmt.executeQuery("select * from stok_barang ORDER BY id_stok ASC");
           while(baris.next()) {
               System.out.println(baris.getInt("id_stok")+" | "+
                       baris.getString("nama_barang")+" | "+
                       baris.getString("merk")+" | "+
                       baris.getString("stok")+" | "+
                       baris.getString("kategori")+" | "+
                       baris.getString("satuan"));
           }
       }
       catch(Exception e) {
           System.err.println(e.getMessage());
           
       }
     }
     public void cariStokBarang(Integer paramiStokBarang){
         try {
             String sql = "select * from stok_barang where id_stok = ?";
             PreparedStatement perintah = connectionDB.prepareStatement (sql);
             perintah.setInt(1, paramiStokBarang);
             ResultSet data = perintah.executeQuery();
             while (data.next()){
                 System.out.println("id : "+data.getInt("id_stok"));
                 System.out.println("nama "+data.getString("nama_barang"));
                 System.out.println("merk "+data.getString("merk"));
                 System.out.println("stok "+data.getString("stok"));
                 System.out.println("kategori "+data.getString("kategori"));
                 System.out.println("satuan "+data.getString("satuan"));
             }
         } 
         catch (Exception e) {
         }
     }
}