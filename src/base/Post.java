package base;

import java.util.Date;

public class Post {
private Date date;
private String content;
public Post(Date d,String c){
	date=d;
	content=c;
}
public String getcontent(){
	return content;
}
public void setcontent(String c){
	content=c;
}
public String toString(){
	return date+"\n"+content;
	}
public boolean euals(Object o){
	//boolean ans=true;
	if(o.getClass()!=this.getClass())return false;
	Post post=(Post)o;
	if(post.date!=date)return false;
	if(post.content!=content)return false;
	return true;
}
public int hashcode(){
	return 17*date.hashCode()+content.hashCode();	
}
public boolean contains(String key){
	if(content.contains(key))return true;
	return false;
}
}

