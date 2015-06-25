
public abstract class Person  {
	private String login;
	private String pass;
	private int id;
	private String lastName;
	private String firstName;
	
	private static int nextId = 1; //(?)
	
public Person (String login, String pass, int id, String lastName, String firstName ) {
	this.login = login;
	this.pass = pass;
	this.id = 0;
	this.lastName = lastName;
	this.firstName = firstName;

}
public String getLogin (){
	return login;
}

public void setLogin (String login){
	this.login = login;
}

public String getPass (){
	return pass;
}
public void setPass (String apass){
	this.pass = apass;
}

public String getName (){
	return  lastName  + " " + firstName;
}
public void setLastName (String lastName){
	this.lastName = lastName;
}

public void setFirstName (String firstName){
	this.firstName = firstName;
}

public int getId (){
	return id;
}

public void setId (){
	id = nextId; // 
	nextId++;
}

public static int getNextId(){
	return nextId;    //return static field (?)
}

}