package com.gengdan.demo.entity;

/**
 * Created by inter.d on 2020/11/3 9:15 上午
 * @author inter.d
 */
public class JSONUser {
    private String username;
    private String password;
    public JSONUser(String username,String password){
        this.username = username;
        this.password = password;
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



}
