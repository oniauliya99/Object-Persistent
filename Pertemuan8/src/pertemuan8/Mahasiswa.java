/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan8;

import java.io.Serializable;

/**
 *
 * @author Auliya-Oni
 */
public class Mahasiswa implements Serializable {

    private String nim;
    private String nama;
    private String jurusan;
    private String programStudi;
    private String ipk;
    public Mahasiswa(String nim, String nama, String jurusan, String programStudi, String ipk) {
        this.nim = nim;
        this.nama = nama;
        this.jurusan = jurusan;
        this.programStudi = programStudi;
        this.ipk = ipk;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    
     public String getJurusan() {
        return jurusan;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }
    
    public String getProgramStudi() {
        return programStudi;
    }
    
    public void setProgramStudi(String programStudi) {
        this.programStudi = programStudi;
    }

    public String getIpk() {
        return ipk;
    }
    
    public void setIpk(String ipk) {
        this.ipk = ipk;
    }
    @Override
    public String toString() {
        return "Mahasiswa{\n" + " Nim : " + nim + "\n Nama : " + nama +
                 "\n Jurusan : " + jurusan + "\n Program Studi : " + programStudi + 
                 "\n IPK = " + ipk +"\n"+'}';
    }

}
