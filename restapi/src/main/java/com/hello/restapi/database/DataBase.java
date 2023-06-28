package com.hello.restapi.database;

import java.util.*;

import com.hello.restapi.userdetails.*;
public class DataBase {

	
	private static Map<Long,UserDetails> db=new HashMap<>(); 
	
	public static Map<Long,UserDetails> getUser(){
		return db;
	}
}
