/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qlgv;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author bqd14
 */
public class DAL_GIAOVIEN extends SSMS {
    private String Magv, Hoten, Luong,Gioitinh,Ngaysinh, Diachi, gvqlcm,Mabm;

    public DAL_GIAOVIEN() {}
    public DAL_GIAOVIEN(String Magv, String Hoten, String Luong, String Gioitinh, String Ngaysinh, String Diachi, String gvqlcm, String Mabm) {
        this.Magv = Magv;
        this.Hoten = Hoten;
        this.Luong = Luong;
        this.Gioitinh = Gioitinh;
        this.Ngaysinh = Ngaysinh;
        this.Diachi = Diachi;
        this.gvqlcm = gvqlcm;
        this.Mabm = Mabm;
    }
    public String getMagv() {
        return Magv;
    }
    public DefaultTableModel Select(){
        return super.Select_all("Select * from GIAOVIEN");
    }
    public boolean Insert(DAL_GIAOVIEN gv){
        String sql = "insert into GIAOVIEN values('" + gv.Magv +"','"+ gv.Hoten +"','"+gv.Luong +"','"+ gv.Gioitinh+"','"+gv.Ngaysinh+"','"+gv.Diachi+"','"+gv.gvqlcm+"','"+gv.Mabm+"')";
        return super.Excute(sql);
    }
     public boolean Update (DAL_GIAOVIEN gv){
        String sql = "update GIAOVIEN set HOTEN ='" + gv.Hoten +"', LUONG = '"+gv.Luong+"', GIOITINH = '" +gv.Gioitinh +"', NGAYSINH = '" +gv.Ngaysinh +"', DIACHI = '" +gv.Diachi +"', GVQLCM = '"+ gv.gvqlcm +"', MABM='" + gv.Mabm +"' where MAGV = '" + gv.Magv +"'";
        return super.Excute(sql);
    }
      public boolean Delete(DAL_GIAOVIEN gv){
        String sql = "delete GIAOVIEN  where MAGV = '" + gv.Magv +"'";
        return super.Excute(sql);
    }
    
}
