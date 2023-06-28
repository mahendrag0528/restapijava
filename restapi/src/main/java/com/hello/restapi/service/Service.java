package com.hello.restapi.service;

import java.util.*;
import com.hello.restapi.userdetails.UserDetails;

import com.hello.restapi.database.*;

public class Service {

	private Map<Long,UserDetails> user=DataBase.getUser();
	
	public Service(){
	}
	
	public List<UserDetails> getUsers(){
		return new ArrayList<>(user.values());
	}
	
	public UserDetails getUser(long id) {
		return user.get(id);
	}
	
	public UserDetails addUser(UserDetails del) {
		del.setId(user.size()+1);
		user.put((long)del.getId(), del);
		return del;
	}
	
	public UserDetails update(UserDetails updt) {
		if(updt.getId()==0) {
			return null;
		}
		user.put((long) updt.getId(), updt);
		return updt;
	}
	
	//@SuppressWarnings("unlikely-arg-type")
	public void remove(long id) {
		user.remove(id);
	}
}
