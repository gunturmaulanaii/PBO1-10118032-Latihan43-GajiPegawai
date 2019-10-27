/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo1.pkg10118032.latihan43.gajipegawai;

/**
 *
 * @author Guntur Maulana I
 * NAMA  : Guntur Maulana Ibrahim
 * KELAS : IF 1
 * NIM   : 10118032
 * Deskripsi Program : Menampilkan output Gaji pegawai.
 */
public class PBO110118032Latihan43GajiPegawai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    System.out.println("### Data Gaji Karyawan PT.Telkom Indonesia ###");
    System.out.println("------------------------------------");
    GajiPegawai karyawan1 = new GajiPegawai();
    karyawan1.setNama("Guntur Maulana Ibrahim");
    karyawan1.setAlamat("Jalan Margaasih, Ciwastra no.9a/13 Bandung");
    karyawan1.setUangTransport(250000);
    karyawan1.setUangTunjangan(300000);
    karyawan1.setGajiPokok(4500000);
    karyawan1.setTotalGaji(karyawan1.totalGaji(karyawan1.getUangTunjangan()
          ,karyawan1.getUangTransport(),karyawan1.getGajiPokok()));
    karyawan1.tampilData(karyawan1.getNama(),karyawan1.getAlamat(),
          karyawan1.getUangTunjangan(),karyawan1.getUangTransport()
          ,karyawan1.getGajiPokok(),karyawan1.getTotalGaji());
        
    }
    
}
