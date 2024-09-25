/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qlgv;

import javax.swing.table.DefaultTableModel;


public class DAL_GVDT extends SSMS{
   private String Magv, DT;

   public DAL_GVDT() {
   }

   public DAL_GVDT(String Magv, String DT) {
        this.Magv = Magv;
        this.DT = DT;
   }

   public String getMagv() {
        return Magv;
   }
   public DefaultTableModel Select(){
       return super.Select_all("SELECT * FROM GVDT");
   }
   public boolean Insert(DAL_GVDT gvdt){
       String sql = "insert into GVDT values('" + gvdt.Magv +"','"+gvdt.DT+"')";
       return super.Excute(sql);
   }
   public boolean Update (DAL_GVDT gvdt){
       String sql = "Update GVDT set DIENTHOAI = '" + gvdt.DT +"' where MAGV = '" +gvdt.Magv +"'";
       return super.Excute(sql);
   }
   public boolean Delete(DAL_GVDT gvdt){
       String sql = "Delete GVDT where MAGV = '" +gvdt.Magv +"'";
       return super.Excute(sql);
   }
   
}
