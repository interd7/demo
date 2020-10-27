package com.gengdan.demo.entity;


import lombok.Data;

@Data
public class User {

  private long id;
  private String userName;
  private String password;
  private String realName;

  public User(String userName, String password, String realName) {
    this.userName = userName;
    this.password = password;
    this.realName = realName;
  }

  public User(long id) {
    this.id = id;
  }

  public User(){

  }

}
