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
public class DAL_DETAI extends SSMS {
    private String Madt, Tendt, Capql, Kinhphi,Ngaybd, Ngaykt, Macd, GV;

    public DAL_DETAI() {
    }

    public DAL_DETAI(String Madt, String Tendt, String Capql, String Kinhphi, String Ngaybd, String Ngaykt, String Macd, String GV) {
        this.Madt = Madt;
        this.Tendt = Tendt;
        this.Capql = Capql;
        this.Kinhphi = Kinhphi;
        this.Ngaybd = Ngaybd;
        this.Ngaykt = Ngaykt;
        this.Macd = Macd;
        this.GV = GV;
    }

    public String getMadt() {
        return Madt;
    }
    public DefaultTableModel Select(){
        return super.Select_all("select * from DETAI");
    }
    public boolean Insert(DAL_DETAI dt){
        String sql = "insert into DETAI values('" + dt.Madt +"','"+ dt.Tendt+"','"+ dt.Capql+"','"+ dt.Kinhphi+"','"+ dt.Ngaybd+"','"+ dt.Ngaykt+"','"+ dt.Macd+"','"+ dt.GV+"')";
        return super.Excute(sql);
    }
    public boolean Update(DAL_DETAI dt){
        String sql = "update DETAI set TENDT = '" +dt.Tendt +"', CAPQL = '" +dt.Capql +"', KINHPHI = '" +dt.Kinhphi +"', NGAYBD = '" +dt.Ngaybd +"', NGAYKT = '" + dt.Ngaykt + "', MACD = '" + dt.Macd +"', GVCNDT = '" + dt.GV +"' where MADT = '" + dt.Madt + "'";
        return super.Excute(sql);
    }
    public boolean Delete(DAL_DETAI dt){
        String sql = "delete DETAI where MADT = '" + dt.Madt + "'";
        return super.Excute(sql);
    }
}
