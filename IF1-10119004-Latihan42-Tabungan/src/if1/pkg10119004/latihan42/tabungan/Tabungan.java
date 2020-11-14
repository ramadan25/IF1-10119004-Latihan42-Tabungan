/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119004.latihan42.tabungan;

/**
 *
 * @author ENDOG
 * Nama         : Muhamad Ramadan
 * Nim          : 10119004
 * Kelas        : IF1
 * Deskripsi    : Menampilkan tabungan
 */
class Tabungan {
    private double saldoSekarang;
    

public void hitung(double saldoAwal,double jumlahPenarikan){ 
       saldoSekarang = saldoAwal - jumlahPenarikan;
       tampil();
   }
private void tampil(){
        System.out.println("======Hasil Penarikan uang======");
        System.out.println("Saldo Sekarang\t\t\t: Rp. " + saldoSekarang);
        System.out.println("(Developed by : Muhamad Ramadan)");
       
   }
}
