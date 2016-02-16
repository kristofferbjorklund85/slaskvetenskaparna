public class footballPlayer extends personP {

	String nationalTeam;
	String club;
	
	footballPlayer(String a, String b, int c, String d, String e) {
	
	firstName 		= a;
	lastName 		= b;
	yearOfBirth 	= c;	
	nationalTeam 	= d;
	club 			= e;

	
	}

		
	
	String getnationalTeam() {
		return nationalTeam;
	}
	
	String getclub() {
		return club;
	}
	
	void setnationalTeam(String a) {
		nationalTeam = a;
	}
	
	void setclub(String a) {
		club = a;
	}
	
	
	public String toString() {
		return "Name: " + this.getfirstName() + " " + this.getlastName() + "\n" + 
		"Year of birth: " + getyearOfBirth() + "\n" + 
		"National Team: " + getnationalTeam() + "\n" + 
		"Club: " + getclub() + "\n";
  	}
	
}