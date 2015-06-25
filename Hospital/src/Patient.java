

public final class Patient extends Person{
	private String sex; // how do  make chose(?) - arraylist 2 element or enum
	
	
	
	public Patient (String login, String pass, int id, String lastName, String firstName, String sex) {
		super (login,  pass, id, lastName, firstName );
		this.sex = sex;
	
	}

	public String getSex () {
	return sex;
	}
	public void setSex(String sex){
	this.sex = sex;
	}


}

