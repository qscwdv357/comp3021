package test;
import java.util.Date;

import base.*;
public class TestObject {
 public static void main(String[]args){
	 user user=new user(1,"COMP3021","COMP3021@cse.ust.hk");
	 Date date=new Date();
	 String content="This is first post";
	 FriendsPost FDpost=new FriendsPost(date,content,user);
	 System.out.println(FDpost);
	 System.out.println(FDpost.contains("first"));
	 System.out.println(FDpost.contains("HKUST"));
 }
}
