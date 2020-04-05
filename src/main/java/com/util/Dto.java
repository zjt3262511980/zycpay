package com.util;

import java.util.Date;

public class Dto {
private int page=1;
private int pagesize=3;
private String title;
private Date nDate;
public Dto(int page, int pagesize, String title, Date nDate) {
	super();
	this.page = page;
	this.pagesize = pagesize;
	this.title = title;
	this.nDate = nDate;
}
@Override
public String toString() {
	return "Dto [page=" + page + ", pagesize=" + pagesize + ", title=" + title + ", nDate=" + nDate + "]";
}
public int getPage() {
	return page;
}
public void setPage(int page) {
	this.page = page;
}
public int getPagesize() {
	return pagesize;
}
public void setPagesize(int pagesize) {
	this.pagesize = pagesize;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public Date getnDate() {
	return nDate;
}
public void setnDate(Date nDate) {
	this.nDate = nDate;
}
public Dto() {
	// TODO Auto-generated constructor stub
}
}
