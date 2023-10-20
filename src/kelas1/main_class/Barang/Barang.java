/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kelas1.main_class.Barang;

/**
 *
 * @author mariq
 */
public class Barang {

    public String Barang;
    public int Harga, Stok;

    public Barang() {
        this.Barang= null;
        this.Harga = 0;
        this.Stok = 0;
    }

    public Barang(String Barang, int Harga, int Stok) {
        this.Barang = Barang;
        this.Harga = Harga;
        this.Stok = Stok;
    }

    public Barang(String Barang) {
        this.Barang = Barang;
    }

    public Barang(String Barang, int Harga) {
        this.Barang = Barang;
        this.Harga = Harga;
    }

    public String getBarang() {
        return Barang;
    }

    public void setBarang(String Barang) {
        this.Barang = Barang;
    }

    public int getHarga() {
        return Harga;
    }

    public void setHarga(int Harga) {
        this.Harga = Harga;
    }

    public int getStok() {
        return Stok;
    }

    public void setStok(int Stok) {
        this.Stok = Stok;
    }

}
