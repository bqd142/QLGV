/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qlgv;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

public class SSMS {
    public Connection ketnoi(){
        String url="jdbc:sqlserver://localhost:1433;databaseName=QLGV;encrypt=true;trustServerCertificate=true;";
        String username="sa"; 
        String pass="quangdo1402"; 
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            return DriverManager.getConnection(url, username, pass);
        }
        catch(ClassNotFoundException |SQLException e){
            e.printStackTrace();
            return null;
        }   
    }
    public DefaultTableModel Select_all(String sql){
        DefaultTableModel model=new DefaultTableModel(); 
        Connection conn = ketnoi();
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            ResultSetMetaData MetaData = rs.getMetaData();
            int ColumnCount = MetaData.getColumnCount();
            for(int i=1;i<=ColumnCount;i++){
                model.addColumn(MetaData.getColumnName(i));    
            }
            model.setRowCount(0);
            while(rs.next()){
                Vector tmp = new Vector();
                for(int i=1;i<=ColumnCount;i++){
                    tmp.add(rs.getString(i));
                }
                model.addRow(tmp);
            }
        } catch (SQLException ex) {
            Logger.getLogger(SSMS.class.getName()).log(Level.SEVERE, null, ex);
        } 
        return model;
    }
    public boolean Excute(String sql){
        Connection conn = ketnoi();
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            int row=ps.executeUpdate();
            return row > 0;
        } catch (SQLException ex) {
            Logger.getLogger(SSMS.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
}
