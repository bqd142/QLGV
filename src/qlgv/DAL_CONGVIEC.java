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
public class DAL_CONGVIEC extends SSMS {
    private String Madt, STT, Tencv, Ngaybd, Ngaykt;

    public DAL_CONGVIEC() {
    }

    public DAL_CONGVIEC(String Madt, String STT, String Tencv, String Ngaybd, String Ngaykt) {
        this.Madt = Madt;
        this.STT = STT;
        this.Tencv = Tencv;
        this.Ngaybd = Ngaybd;
        this.Ngaykt = Ngaykt;
    }

    public String getMadt() {
        return Madt;
    }

    public String getSTT() {
        return STT;
    }
    public DefaultTableModel Select(){
        return super.Select_all("Select MADT,SOTT,TENCV,NGAYBD,NGAYKT from CONGVIEC");
    }
    public boolean Insert(DAL_CONGVIEC cv){
        String sql = "insert into CONGVIEC values('" + cv.Madt +"','" + cv.STT+"','" + cv.Tencv+"','" + cv.Ngaybd+"','" + cv.Ngaykt+"', '0')";
        return super.Excute(sql);
    }
    public boolean Update(DAL_CONGVIEC cv, String stt){
       String sql = "update CONGVIEC set SOTT = '" + cv.STT +"', TENCV = '" + cv.Tencv +"', NGAYBD = '" + cv.Ngaybd + "', NGAYKT = '" + cv.Ngaykt + "' where MADT = '" + cv.Madt + "' and SOTT = '" + stt +"'";
       return super.Excute(sql);
    }
    public boolean Delete(DAL_CONGVIEC cv){
      String sql = "delete CONGVIEC where MADT = '" + cv.Madt +"' and SOTT = '" + cv.STT +"'";
      return super.Excute(sql);
    }
    public DefaultTableModel Select_stt(String mdt){
        return super.Select_all("Select SOTT from CONGVIEC where MADT = '" + mdt +"' and TINHTRANG = '0'" );
    }
    public DefaultTableModel Select_tinhtrang(){
        return super.Select_all("Select MADT,SOTT,TENCV,NGAYBD,NGAYKT from CONGVIEC where TINHTRANG = '0'");
    }
    public void update_tt(String madt, String stt){
        String sql = "update CONGVIEC set TINHTRANG = '1'  where MADT = '" +madt + "' and SOTT = '" + stt +"'";
        super.Excute(sql);
    }
    public void rs_tt(String madt, String stt){
        String sql = "update CONGVIEC set TINHTRANG = '0'  where MADT = '" +madt + "' and SOTT = '" + stt +"'";
        super.Excute(sql);
    }
    
}
