package com.util;

public class Msg {
private boolean zf;
private String tsString;
@Override
public String toString() {
	return "Msg [zf=" + zf + ", tsString=" + tsString + "]";
}
public Msg(boolean zf, String tsString) {
	super();
	this.zf = zf;
	this.tsString = tsString;
}
public boolean isZf() {
	return zf;
}
public void setZf(boolean zf) {
	this.zf = zf;
}
public String getTsString() {
	return tsString;
}
public void setTsString(String tsString) {
	this.tsString = tsString;
}
public Msg() {
	// TODO Auto-generated constructor stub
}
}
