/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.uts.npm144;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author pirmansyah
 */
public class BengkelModel {
    private Connection connection;
    
    public BengkelModel(){
        connection = ConnectionUtil.getConnection();
    }
    
    public List<Bengkel> getALL(){
        List<Bengkel> list = new ArrayList<>();
        String sql = "SELECT * FROM tb_servis";
        try {
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet rs = statement.executeQuery();
            Bengkel bk;
            while (rs.next()) {                
                bk = new Bengkel();
                bk.setIdServis(rs.getString("IdServis"));
                bk.setNamaServis(rs.getString("namaServis"));
                bk.setMerkKendaraan(rs.getString("merkKendaraan"));
                bk.setPemilik(rs.getString("pemilik"));
                bk.setHarga_servis(rs.getString("harga_servis"));
             
                list.add(bk);
            }
        } catch (Exception e) {
            System.out.println("Error get All"+e.getMessage());
        }
        return list;
    }
    
    public Bengkel getByID(String IdServis){
        String sql = "SELECT * FROM tb_servis WHERE IdServis = ?";
        Bengkel bk = null;
        try {
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, IdServis);
            ResultSet rs = statement.executeQuery();
            if (rs.next()) {
                bk = new Bengkel();
                bk.setIdServis(rs.getString("IdServis"));
                bk.setNamaServis(rs.getString("namaServis"));
                bk.setMerkKendaraan(rs.getString("merkKendaraan"));
                bk.setPemilik(rs.getString("pemilik"));
                bk.setHarga_servis(rs.getString("harga_servis"));
            }
        } catch (Exception e) {
            System.out.println("Gagal getByID " + e.getMessage());
        }
        return bk;
    }
    
    public boolean insert(Bengkel bk){
        boolean status = false;
        String sql = "INSERT INTO tb_servis VALUES (?,?,?,?,?)";
        try {
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, bk.getIdServis());
            statement.setString(2, bk.getNamaServis());
            statement.setString(3, bk.getMerkKendaraan());
            statement.setString(4, bk.getPemilik());
            statement.setString(5, bk.getHarga_servis());
            int result = statement.executeUpdate();
            status = result > 0;
        } catch (Exception e) {
        }
        return status;
    }
    
    public boolean update(Bengkel bk){
        boolean status = false;
        String sql = "UPDATE tb_servis SET namaServis=?, merkKendaraan=?, pemilik=?, harga_servis=?" +  "WHERE IdServis=?";
        try {
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, bk.getNamaServis());
            statement.setString(2, bk.getMerkKendaraan());
            statement.setString(3, bk.getPemilik());
            statement.setString(4, bk.getHarga_servis());
            statement.setString(5, bk.getIdServis());
            int result = statement.executeUpdate();
            status = result > 0;
        } catch (Exception e) {
        }
        return status;
    }
    

    public boolean delete(Bengkel bk){
        boolean status = false;
        String sql = "DELETE FROM tb_servis WHERE IdServis=?";
        try {
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, bk.getIdServis());
            int result = statement.executeUpdate();
            status = result > 0;
        } catch (Exception e) {
        }
        return status;
    }
}
