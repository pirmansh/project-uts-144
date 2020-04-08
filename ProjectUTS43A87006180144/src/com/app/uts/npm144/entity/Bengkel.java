/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.uts.npm144.entity;

/**
 *
 * @author pirmansyah
 */
public class Bengkel {
    private String IdServis;
    private String namaServis;
    private String merkKendaraan;
    private String pemilik;
    private String harga_servis;
    
    public Bengkel(){}

    public String getIdServis() {
        return IdServis;
    }

    public void setIdServis(String IdServis) {
        this.IdServis = IdServis;
    }

    public String getNamaServis() {
        return namaServis;
    }

    public void setNamaServis(String namaServis) {
        this.namaServis = namaServis;
    }

    public String getMerkKendaraan() {
        return merkKendaraan;
    }

    public void setMerkKendaraan(String merkKendaraan) {
        this.merkKendaraan = merkKendaraan;
    }

    public String getPemilik() {
        return pemilik;
    }

    public void setPemilik(String pemilik) {
        this.pemilik = pemilik;
    }

    public String getHarga_servis() {
        return harga_servis;
    }

    public void setHarga_servis(String harga_servis) {
        this.harga_servis = harga_servis;
    }
}