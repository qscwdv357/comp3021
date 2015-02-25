package base;

import java.util.Date;

public class user {
	private int ID;
	private String email;
	private String course;
	public user(int i,String c,String e){
		ID=i;
		course=c;
		email=e;
	}	
	public boolean euals(Object o){
		//boolean ans=true;
		if(o.getClass()!=this.getClass())return false;
		user u=(user)o;
		if(u.ID!=ID)return false;
		if(u.email!=email)return false;
		if(u.course!=course)return false;
		return true;
	}
}
