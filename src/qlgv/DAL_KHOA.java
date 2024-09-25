/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qlgv;

import javax.swing.table.DefaultTableModel;


public class DAL_KHOA extends SSMS{
    private String MaKhoa, TenKhoa, NamTL, Phong, DienThoai,TruongKhoa, Ngaynhanchuc;

    public DAL_KHOA() {}
    public DAL_KHOA(String MaKhoa, String TenKhoa, String NamTL, String Phong, String DienThoai, String TruongKhoa, String Ngaynhanchuc) {
        this.MaKhoa = MaKhoa;
        this.TenKhoa = TenKhoa;
        this.NamTL = NamTL;
        this.Phong = Phong;
        this.DienThoai = DienThoai;
        this.TruongKhoa = TruongKhoa;
        this.Ngaynhanchuc = Ngaynhanchuc;
    }

    public String getMaKhoa() {
        return MaKhoa;
    }
    
    public DefaultTableModel Select(){
        return super.Select_all("SELECT * FROM KHOA");
    }
    
    public boolean Insert(DAL_KHOA k){
        String sql = "insert into KHOA values('" + k.MaKhoa +"','" + k.TenKhoa +"','"+k.NamTL+"','" + k.Phong+"','" + k.DienThoai+"','" + k.TruongKhoa+"','" +k.Ngaynhanchuc+"')";
        return super.Excute(sql);
    }
    public boolean Update(DAL_KHOA k){
        String sql ="update KHOA set TENKHOA = '" + k.TenKhoa +"', NAMTL = '" + k.NamTL +"', PHONG = '" + k.Phong +"', DIENTHOAI = '"+k.DienThoai+"', TRUONGKHOA = '" + k.TruongKhoa +"', NGAYNHANCHUC = '" +k.Ngaynhanchuc +"' WHERE MAKHOA = '" + k.MaKhoa + "'";
        return super.Excute(sql);
    }
    public boolean Delete(DAL_KHOA k){
        String sql = "DELETE KHOA WHERE MAKHOA = '"+k.MaKhoa +"'";
        return super.Excute(sql);
    }
    
}
