package com.windows10.ukom.model;

/**
 * Created by SoffanDLuffy on 2/12/2018.
 */

public class Sekolah {

    private String id;
    private String nss;
    private String nama;
    private String alamat;
    private String notelp;
    private String nofax;
    private String email;

    public Sekolah(String id, String nss, String nama, String alamat, String notelp, String nofax, String email) {
        this.id = id;
        this.nss = nss;
        this.nama = nama;
        this.alamat = alamat;
        this.notelp = notelp;
        this.nofax = nofax;
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNss() {
        return nss;
    }

    public void setNss(String nss) {
        this.nss = nss;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getNotelp() {
        return notelp;
    }

    public void setNotelp(String notelp) {
        this.notelp = notelp;
    }

    public String getNofax() {
        return nofax;
    }

    public void setNofax(String nofax) {
        this.nofax = nofax;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
