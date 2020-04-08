/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.uts.npm144;

/**
 *
 * @author pirmansyah
 */
public class ClassUTS {
    
    BengkelModel bengkel = new BengkelModel();
    
        public static void main(String[] args) {
            
//           Memanggil method insert
//             new ClassUTS().bengkelInsert();
            
           
//           memanggil method update
//                new ClassUTS().bengkelUpdate();


//           memanggil method delete
                new ClassUTS().bengkelDelete();

    }
        

    public void bengkelInsert(){

        Bengkel bk = new Bengkel();
        bk.setIdServis("33333");
        bk.setNamaServis("Platinum");
        bk.setMerkKendaraan("Nmax");
        bk.setPemilik("Hamba");
        bk.setHarga_servis("400000");
        boolean sukses = bengkel.insert(bk);

        if(sukses) {
            System.out.println("Insert Data Berhasil!");
        }else{
            System.out.println("Insert Data Gagal!");
        }
    }
    

    public void bengkelUpdate(){

        Bengkel bk = bengkel.getByID("22222");
        bk.setPemilik("Pirman");
        boolean sukses = bengkel.update(bk);
        if(sukses) {
            System.out.println("Update Data Berhasil!");
        }else{
            System.out.println("Update Data Gagal!");
        }
    }
    public void bengkelDelete(){

        Bengkel bk = bengkel.getByID("33333");
        boolean sukses = bengkel.delete(bk);
        if(sukses) {
            System.out.println("Delete Data Berhasil!");
        }else{
            System.out.println("Delete Data Gagal!");
        }
    }
            
    
}
