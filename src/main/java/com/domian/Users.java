package com.domian;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "users")
public class Users {
	@Id
private Integer id;
private String uname;
private String upwd;
public Users(Integer id, String uname, String upwd) {
	super();
	this.id = id;
	this.uname = uname;
	this.upwd = upwd;
}
@Override
public String toString() {
	return "Users [id=" + id + ", uname=" + uname + ", upwd=" + upwd + "]";
}
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getUname() {
	return uname;
}
public void setUname(String uname) {
	this.uname = uname;
}
public String getUpwd() {
	return upwd;
}
public void setUpwd(String upwd) {
	this.upwd = upwd;
}
public Users() {
	// TODO Auto-generated constructor stub
}

}
