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
public class DAL_CHUDE extends SSMS{
    private String macd, tencd;

    public DAL_CHUDE() {
    }

    public DAL_CHUDE(String macd, String tencd) {
        this.macd = macd;
        this.tencd = tencd;
    }

    public String getMacd() {
        return macd;
    }
    public DefaultTableModel Select(){
        return super.Select_all("Select * from CHUDE");
    }
    public boolean Insert(DAL_CHUDE cd){
        String sql = "insert into CHUDE values('" +cd.macd +"','" +cd.tencd+"')";
        return super.Excute(sql);
    }
    public boolean Update(DAL_CHUDE cd){
        String sql = "update CHUDE set TENCD = '" +cd.tencd +"' where MACD = '" +cd.macd +"'";
        return super.Excute(sql);
    }
    public boolean Delete(DAL_CHUDE cd){
        String sql = "delete CHUDE where MACD = '" +cd.macd +"'";
        return super.Excute(sql);
    }
}
