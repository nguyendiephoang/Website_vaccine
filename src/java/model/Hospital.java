/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Date;

public class Hospital {
    private int idH;
    private String name;
    private String address;
    private String email;
    private String hotline;
    private String username;
    private String password;

    public Hospital() {
    }

    public Hospital(int idH, String name, String address, String email, String hotline, String username, String password) {
        this.idH = idH;
        this.name = name;
        this.address = address;
        this.email = email;
        this.hotline = hotline;
        this.username = username;
        this.password = password;
    }

    public int getIdH() {
        return idH;
    }

    public void setIdH(int idH) {
        this.idH = idH;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getHotline() {
        return hotline;
    }

    public void setHotline(String hotline) {
        this.hotline = hotline;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Hospital{" + "idH=" + idH + ", name=" + name + ", address=" + address + ", email=" + email + ", hotline=" + hotline + ", username=" + username + ", password=" + password + '}';
    }

    
    
}
