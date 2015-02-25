package base;

import java.util.Date;

public class FriendsPost extends Post{
	private user user;
	public  FriendsPost(Date d,String c,user u){
		super(d,c);
		user=u;
	}
}
