import java.util.*;
import java.io.*;

public class testpeople2 {
	
	public static void main(String [] args) throws FileNotFoundException {
		
		String filnamn = "footballers.txt";
		Scanner s = new Scanner(new File(filnamn)).useDelimiter("#");		
		
		ArrayList<footballPlayer> spelare = new ArrayList<footballPlayer>();
	
		
		while(s.hasNextLine()) {
		spelare.add(new footballPlayer(s.next(), s.next(), 
						s.nextInt(), s.next(), s.next()));
		s.nextLine();

		}

		for(footballPlayer player : spelare) {
			System.out.println(player.toString());
		}

		
	}
	
}