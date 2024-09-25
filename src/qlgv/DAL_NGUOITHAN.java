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
public class DAL_NGUOITHAN extends SSMS{
    private String magv, ten_nguoithan, ngaysinh, gioitinh;
    public DAL_NGUOITHAN() {
    }
    public DAL_NGUOITHAN(String magv, String ten_nguoithan, String ngaysinh, String gioitinh) {
        this.magv = magv;
        this.ten_nguoithan = ten_nguoithan;
        this.ngaysinh = ngaysinh;
        this.gioitinh = gioitinh;
    }
    public String getMagv() {
        return magv;
    }
    public String getTen_nguoithan() {
        return ten_nguoithan;
    }
    
    public DefaultTableModel Select(){
        return super.Select_all("select * from NGUOITHAN");
    }
    public boolean Insert(DAL_NGUOITHAN nt){
        String sql = "insert into NGUOITHAN values('" + nt.magv +"','"+ nt.ten_nguoithan +"','"+ nt.ngaysinh +"','"+nt.gioitinh +"')";
        return super.Excute(sql);
    }
    public boolean Update(DAL_NGUOITHAN nt, String tencu){
        String sql = "update NGUOITHAN set TEN = '" + nt.ten_nguoithan + "', NGAYSINH = '" +nt.ngaysinh +"', GIOITINH ='" +nt.gioitinh +"' where MAGV = '" + nt.magv +"' and TEN = '" + tencu +"'";
        return super.Excute(sql);
    }
    public boolean Delete(DAL_NGUOITHAN nt){
        String sql = "delete NGUOITHAN where TEN = '" +nt.ten_nguoithan +"' and MAGV = '" + nt.magv +"'";
        return super.Excute(sql);
    }
    
}
