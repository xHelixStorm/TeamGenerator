package core;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Arrays {
	private static ArrayList<String> players = new ArrayList<String>();
	
	public static ArrayList<String> getPlayers(){
		try {
			BufferedReader br = new BufferedReader(new FileReader("./participants.txt"));
			try {
				StringBuilder sb = new StringBuilder();
				String line = br.readLine();
				
				while(line != null){
					players.add(line);
					sb.append(System.lineSeparator());
					line = br.readLine();
				}
				return players;
			} catch (IOException e) {
				e.printStackTrace();
			}finally {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return null;
	}
}
