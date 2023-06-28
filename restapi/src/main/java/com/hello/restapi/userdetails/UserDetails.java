package com.hello.restapi.userdetails;
import java.util.*;

public class UserDetails {
     
	private int id;
	private String name;
	private String roolNo;
	 public UserDetails(){}
	public UserDetails(int id,String name,String roolNo) {
		this.id=id;
		this.name=name;
		this.roolNo=roolNo;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRoolNo() {
		return roolNo;
	}
	public void setRoolNo(String roolNo) {
		this.roolNo = roolNo;
	}
	
}
