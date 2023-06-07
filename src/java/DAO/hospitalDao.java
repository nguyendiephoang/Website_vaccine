/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Hospital;
import model.User;

/**
 *
 * @author DELL
 */
public class hospitalDao extends DBContext{
    MD5 md5 = new MD5();Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    
    public List<Hospital> getAllHospital() throws SQLException {
        List<Hospital> list = new ArrayList<>();
        String sql = "select * from [hospital]";
        PreparedStatement stm = connection.prepareCall(sql);
        ResultSet rs = stm.executeQuery();
        try {
            while (rs.next()) {
                list.add(new Hospital(rs.getInt(1),
                        rs.getString(2), rs.getString(3),
                        rs.getString(4), rs.getString(5), rs.getString(6),rs.getString(7)));
                
            }
        } catch (Exception e) {
        }
        return list;}
    
    public Hospital findHospital(String email, String password) {
        try {
            String sql = "select * from [hospital] where [email] = ? and [password] = ?";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setString(1, email);
            stm.setString(2, md5.getMd5(password));
            ResultSet rs = stm.executeQuery();
            if (rs.next()) {
                Hospital s = new Hospital();
                s.setIdH(rs.getInt("idH"));
                s.setName(rs.getString("name"));
                s.setAddress(rs.getString("address"));
                s.setEmail(rs.getString("email"));
                s.setHotline(rs.getString("hotline"));
                s.setUsername(rs.getString("username"));
                s.setPassword(rs.getString("password"));
                return s;
            }
        } catch (SQLException ex) {
            Logger.getLogger(UserDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public static void main(String[] args) {
        hospitalDao h = new hospitalDao();
        
            Hospital l = h.findHospital("nguyendiephoang111@gmail.com", "123");
        System.out.println(l);
            
        
        
            
}
}

