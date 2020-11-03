package com.gengdan.demo.entity;


import lombok.Data;

/**
 * @author inter.d
 */
@Data
public class User {

  private Integer id;
  private String userName;
  private String password;
  private String realName;

  public User( Integer id,String userName, String password, String realName) {
    this.id = id;
    this.userName = userName;
    this.password = password;
    this.realName = realName;

  }
}
