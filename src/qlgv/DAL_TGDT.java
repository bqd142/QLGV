/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qlgv;

import javax.swing.table.DefaultTableModel;


public class DAL_TGDT extends SSMS {
    private String Magv, Madt, stt, phucap, ketqua;

    public DAL_TGDT() {
    }

    public DAL_TGDT(String Magv, String Madt, String stt, String phucap, String ketqua) {
        this.Magv = Magv;
        this.Madt = Madt;
        this.stt = stt;
        this.phucap = phucap;
        this.ketqua = ketqua;
    }
    
    public DefaultTableModel Select(){
        return super.Select_all("select * from THAMGIADT");
    }
    public boolean Insert(DAL_TGDT tgdt){
        String sql = "insert into THAMGIADT values('" + tgdt.Magv +"','"+ tgdt.Madt+"','"+ tgdt.stt+"','"+ tgdt.phucap+"','"+ tgdt.ketqua+"')";
        return super.Excute(sql);
    }
    public boolean Update(DAL_TGDT tgdt, String madtcu, String sttcu){
        String sql = "update THAMGIADT set MADT = '" + tgdt.Madt + "', STT = '" + tgdt.stt +"', PHUCAP = '" + tgdt.phucap +"', KETQUA = '" + tgdt.ketqua + "' where MAGV = '" + tgdt.Magv + "' and MADT = '" + madtcu +"' and STT = '" + sttcu +"'"; 
        return super.Excute(sql);
    }
    public boolean Delete(DAL_TGDT tgdt){
        String sql = "delete THAMGIADT where MAGV = '" + tgdt.Magv + "' and MADT = '" + tgdt.Madt +"' and STT = '" + tgdt.stt +"'";
        return super.Excute(sql);
    }
}
