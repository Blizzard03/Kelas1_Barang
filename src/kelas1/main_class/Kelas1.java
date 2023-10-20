/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package kelas1.main_class;

import java.text.NumberFormat;
import java.util.Locale;

import kelas1.main_class.Barang.Barang;

/**
 *
 * @author mariq
 */
public class Kelas1 {

    double subtotal = 0;
    double harga;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Curency Formatter
        Locale Indonesia = new Locale("in", "ID");
        final NumberFormat formater = NumberFormat.getCurrencyInstance(Indonesia);
        /*
         * Barang Blank Constructor
         */

        final Barang item_1 = new Barang();
        item_1.Barang = "Timber Wolf Latex Fur";
        item_1.Harga = 78100;
        item_1.Stok = 64;

        final Barang item_2 = new Barang();
        item_2.Barang = "Golden Lion Fur";
        item_2.Harga = 82000;
        item_2.Stok = 14;

        final Barang item_3 = new Barang();
        item_3.Barang = "Human Latex Suit";
        item_3.Harga = 450000;
        item_3.Stok = 5;

        /*
         * Barang Full Constructors
         */
        final Barang item_4 = new Barang("Rubber Lion Suit", 800000, 6);
        final Barang item_5 = new Barang("Gold Latex Liquid", 129000, 8);
        final Barang item_6 = new Barang("Jean Lion Suit", 78111, 20);

        /*
         * Barang name only
         */
        final Barang item_7 = new Barang("Rubber Lion Pooltoy");
        final Barang item_8 = new Barang("Mechanical Lion Toy");
        final Barang item_9 = new Barang("Human Figure");

        /*
         * Barang and Price only
         */
        final Barang item_10 = new Barang("Smart Phone Android", 1800000);
        final Barang item_11 = new Barang("Smart TV", 6500000);
        final Barang item_12 = new Barang("Monitor 24'", 8500000);

        Barang barang1 = new Barang("Laptop", 5000000, 10);
        Barang barang2 = new Barang("Smartphone", 2000000, 15);
        Barang barang3 = new Barang("Tablet", 1500000, 20);

        System.out.println("=========-Kelas 1 Program-=============");

        // Menampilkan header
        System.out.println("Barang\tHarga\tStok\tSub");
        System.out.println("--------------------------------");

        // Menampilkan data barang
        System.out.println(item_1.getBarang() + "\t" + item_1.getHarga() + "\t" + item_1.getStok() + "\t" + item_1.hitungSubtotal());
        System.out.println(item_2.getBarang() + "\t" + item_2.getHarga() + "\t" + item_2.getStok() + "\t" + item_2.hitungSubtotal());
        System.out.println(item_3.getBarang() + "\t" + item_3.getHarga() + "\t" + item_3.getStok() + "\t" + item_3.hitungSubtotal());
        System.out.println(item_4.getBarang() + "\t" + item_4.getHarga() + "\t" + item_4.getStok() + "\t" + item_4.hitungSubtotal());
        System.out.println(item_5.getBarang() + "\t" + item_5.getHarga() + "\t" + item_5.getStok() + "\t" + item_5.hitungSubtotal());
        System.out.println(item_6.getBarang() + "\t" + item_6.getHarga() + "\t" + item_6.getStok() + "\t" + item_6.hitungSubtotal());
        System.out.println(item_7.getBarang() + "\t");
        System.out.println(item_8.getBarang() + "\t");
        System.out.println(item_9.getBarang() + "\t");
        System.out.println(item_10.getBarang() + "\t" + item_10.getHarga());
        System.out.println(item_11.getBarang() + "\t" + item_11.getHarga());
        System.out.println(item_12.getBarang() + "\t" + item_12.getHarga());
        System.out.println(barang1.getBarang() + "\t" + barang1.getHarga() + "\t" + barang1.getStok() + "\t" + barang1.hitungSubtotal());
        System.out.println(barang2.getBarang() + "\t" + barang1.getHarga() + "\t" + barang1.getStok() + "\t" + barang1.hitungSubtotal());
        System.out.println(barang3.getBarang() + "\t" + barang1.getHarga() + "\t" + barang1.getStok() + "\t" + barang1.hitungSubtotal());

        // Menghitung total sub
        int totalSub
                = item_1.hitungSubtotal()
                + item_2.hitungSubtotal()
                + item_3.hitungSubtotal()
                + item_4.hitungSubtotal()
                + item_5.hitungSubtotal()
                + item_6.hitungSubtotal()
                + barang1.hitungSubtotal()
                + barang2.hitungSubtotal()
                + barang3.hitungSubtotal();
        System.out.println("\nTotal Sub : " + totalSub);

        // Menghitung total stok
        int totalStok
                = item_1.getStok()
                + item_2.getStok()
                + item_3.getStok()
                + item_4.getStok()
                + item_5.getStok()
                + item_6.getStok()
                + barang1.getStok()
                + barang2.getStok()
                + barang3.getStok();
        System.out.println("Total Stok : " + totalStok);

        //Stock Terbersar
        int[] stocks = {item_1.getStok(),
            item_2.getStok(),
            item_3.getStok(),
            item_4.getStok(),
            item_5.getStok(),
            item_6.getStok(),
            barang1.getStok(),
            barang2.getStok(),
            barang3.getStok()};
        int max_stock = stocks[0];
        for (int z = 0; z < stocks.length; z++) {
            if (stocks[z] > max_stock) {
                max_stock = stocks[z];
            }
        }
        System.out.println("Stok Terbesar : " + " " + max_stock);

        //Sub Terkecil
        int[] minsub = {
            item_1.hitungSubtotal(),
            item_2.hitungSubtotal(),
            item_3.hitungSubtotal(),
            item_4.hitungSubtotal(),
            item_5.hitungSubtotal(),
            item_6.hitungSubtotal(),
            barang1.hitungSubtotal(),
            barang2.hitungSubtotal(),
            barang3.hitungSubtotal()};

        int min_sub = minsub[0];
        for (int x = 0; x < minsub.length; x++) {
            if (minsub[x] < min_sub) {
                min_sub = minsub[x];
            }
        }
        System.out.println("Sub Terkecil : " + " " + min_sub);
        
    // Jumlah Data
        int jumlahData = 9;
        System.out.println("Jumlah Data : " + jumlahData);

        // Rata-rata Stok
        double rataRataStok = (double) totalStok / jumlahData;
        System.out.println("Rata-rata Stok : " + rataRataStok);
    }
}
