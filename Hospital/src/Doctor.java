
public final class Doctor extends Person{
	
	
	private String specialisation;

	
	public Doctor(String login, String pass, int id, String lastName,
			String firstName,String specialisation) {
		super(login, pass, id, lastName, firstName);
		this.specialisation = specialisation;
		
	}
	public String getSpecialisation() {
		return specialisation;
	}
	public void setSpecialisation (String specialisation){
		this.specialisation = specialisation;
	}
}
