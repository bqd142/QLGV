/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qlgv;

import javax.swing.table.DefaultTableModel;


public class DAL_BOMON extends SSMS{
    private String MaBomon, TenBomon, Phong, Dienthoai, TruongBomon, Makhoa, Ngaynhanchuc;

    public DAL_BOMON() {}

    public DAL_BOMON(String MaBomon, String TenBomon, String Phong, String Dienthoai, String TruongBomon, String Makhoa, String Ngaynhanchuc) {
        this.MaBomon = MaBomon;
        this.TenBomon = TenBomon;
        this.Phong = Phong;
        this.Dienthoai = Dienthoai;
        this.TruongBomon = TruongBomon;
        this.Makhoa = Makhoa;
        this.Ngaynhanchuc = Ngaynhanchuc;
    }

    public String getMaBomon() {
        return MaBomon;
    }
    
    public DefaultTableModel Select(){
        return super.Select_all("Select * FROM BOMON");
    }
    public boolean Insert(DAL_BOMON bm){
        String sql = "insert into BOMON values('" + bm.MaBomon +"','" + bm.TenBomon +"','"+ bm.Phong+"','"+bm.Dienthoai+"','"+bm.TruongBomon+"','"+bm.Makhoa+"','"+bm.Ngaynhanchuc+"')";
        return super.Excute(sql);
    }
    public boolean Update(DAL_BOMON bm){
        String sql = "update BOMON set TENBM = '" +bm.TenBomon + "', PHONG = '" +bm.Phong + "', DIENTHOAI = '" +bm.Dienthoai +"', TRUONGBM = '" + bm.TruongBomon +"', MAKHOA = '" + bm.Makhoa + "', NGAYNHANCHUC = '" + bm.Ngaynhanchuc +"' where MABM = '" + bm.MaBomon + "'";
        return super.Excute(sql);
    }
    public boolean Delete(DAL_BOMON bm){
        String sql = "delete BOMON where MABM = '" + bm.MaBomon + "'";
        return super.Excute(sql);
    }
}
