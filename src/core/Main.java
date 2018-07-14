package core;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;

public class Main {
	public static void main (String [] args){
		try {
			PrintStream out = new PrintStream(new FileOutputStream("./teams.txt"));
			System.setOut(out);
		} catch (FileNotFoundException e2) {
			e2.printStackTrace();
		}
		
		int randomDigit;
		int count = 0;
		boolean newPlayer = false;
		ArrayList<String> players = Arrays.getPlayers();
		ArrayList<String> takenPlayers = new ArrayList<String>();
		while(count != players.size()){
			count++;
			System.out.println("Team "+count+":");
			System.out.println("");
			for(int i = 0; i < 4; i++){
				while(newPlayer == false){
					randomDigit = (int) (Math.random()*players.size());
					if(!takenPlayers.contains(players.get(randomDigit))){
						takenPlayers.add(players.get(randomDigit));
						System.out.println(players.get(randomDigit));
						newPlayer = true;
					}
				}
				newPlayer = false;
			}
			System.out.println("-------------------------------");
			System.out.println("");
		}
	}
}
