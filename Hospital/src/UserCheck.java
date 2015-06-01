import java.io.*;
import java.util.*;


public class UserCheck {
	private final Set <Person> persons = HashSet <> (20, 0,75); 
	//1)how HashSet implements (?)
	
	public static void main (String[] args) {
		new UserCheck().allAction();
	}
	private void allAction(){
	    register();
		System.out.println ("----------------------------");		
		entry();
	}
	private Person register (){
		Person person = null;
		String reply = keyboard ("  Select person (p - patient, d - Doctor)"  );
		String alogin = keyboard ("  Login");
		String apass = keyboard ("  pass");
		int id;                // how do?
		String alastName = keyboard ("  last name");
		String afirstName = keyboard ("  first name");
		
		if (reply.equalsIgnoreCase("p")){
			String aSex = keyboard ("   Sex: male or female");
			String aYearOfBirth = keyboard ("   year of birth");
			
			Patient patient = new Patient(alogin, apass, id, alastName, afirstName, aSex, aYearOfBirth );   // why??
			patient.setSex(aSex);
			patient.setYearOfBirth(Integer.valueOf(aYearOfBirth));
			person = patient;
			} 
		if (reply.equalsIgnoreCase("d")){
			System.out.println ("We are working... :)");
			System.exit(-1);
			}
		else {
			System.out.println ("Please make right choise");
			System.exit(-1);	
		}
		person.setLogin(alogin);
		person.setPass(apass);
		person.setId();
		person.setLastName(alastName);
		person.setFirstName(afirstName);
		
		this.persons.add(person);          // save in cache
	}
	
	private void entry (){
		String login = keyboard ("   Login");
		String pass = keyboard ("   Pasword");
		
		for (Person p: persons){
			if(p.getLogin().equalsIgnoreCase(login) && p.getPass().equals(pass) ){
				System.out.println ("Hello, " + p.getName());
			}
			else {
				System.out.println ("Wrong login or password, please try again or register ");
			}
		}
	}
private String keyboard(String message) {
	System.out.print(message + ": ");
	Scanner scan = new Scanner(System.in);
	return scan.next();
	}
}