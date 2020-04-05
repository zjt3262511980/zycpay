package com.domian;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Table(name = "news")
public class News {
@Id
private Integer id;
private String ntitle;
private String ncontent;
private String npicture;
private String nauthor;
@DateTimeFormat(pattern = "yyyy-MM-dd")
private Date ntime;
private Integer userid;

public Integer getId() {
	return id;
}

public void setId(Integer id) {
	this.id = id;
}

public String getNtitle() {
	return ntitle;
}

public void setNtitle(String ntitle) {
	this.ntitle = ntitle;
}

public String getNcontent() {
	return ncontent;
}

public void setNcontent(String ncontent) {
	this.ncontent = ncontent;
}

public String getNpicture() {
	return npicture;
}

public void setNpicture(String npicture) {
	this.npicture = npicture;
}

public String getNauthor() {
	return nauthor;
}

public void setNauthor(String nauthor) {
	this.nauthor = nauthor;
}

public Date getNtime() {
	return ntime;
}

public void setNtime(Date ntime) {
	this.ntime = ntime;
}

public Integer getUserid() {
	return userid;
}

public void setUserid(Integer userid) {
	this.userid = userid;
}

@Override
public String toString() {
	return "News [id=" + id + ", ntitle=" + ntitle + ", ncontent=" + ncontent + ", npicture=" + npicture + ", nauthor="
			+ nauthor + ", ntime=" + ntime + ", userid=" + userid + "]";
}

public News(Integer id, String ntitle, String ncontent, String npicture, String nauthor, Date ntime, Integer userid) {
	super();
	this.id = id;
	this.ntitle = ntitle;
	this.ncontent = ncontent;
	this.npicture = npicture;
	this.nauthor = nauthor;
	this.ntime = ntime;
	this.userid = userid;
}

public String getNtimestring() {
    SimpleDateFormat sdf=new SimpleDateFormat("yyyy年MM月dd日");
    if(this.ntime!=null){
        return sdf.format(this.ntime);
    }
    return null;
}
public News() {
	// TODO Auto-generated constructor stub
}
}
