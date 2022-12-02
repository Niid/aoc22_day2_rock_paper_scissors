package main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import objects.PlayMove;
import objects.Player;
import objects.Round;


public class main {

	public static void main(String[] args) throws IOException {
		// La variable args contient les arguments passés au programme. 
		// Ici il faudra rentrer le chemin vers un fichier .txt contenant l'input donné par le site advent of code !
		File input = new File(args[0]);
		
		// Ici je fais mon parse pour donner une liste d'elfes
		ArrayList<Round> rounds = parseFile(input);
		
		// un objet pour stocker le score, pas très utile car remplaçable par un simple int mais admettons
		Player player = new Player();
		
		// plus qu'à calculer et additionner des scores !
		
	}
	
	/**
	 * Reads an input file to turn it into useable objects
	 * @param input the file containing the data to read
	 * @return an ArrayList (https://docs.oracle.com/javase/7/docs/api/java/util/ArrayList.html) of Elf objects
	 * @throws IOException 
	 */
	public static ArrayList<Round> parseFile(File input) throws IOException{
		BufferedReader br = new BufferedReader(new FileReader(input));

		// une variable qui contiendra la ligne courante de l'input
		String currentLine;
		
		// une variable pour stocker ma liste d'elfes
		ArrayList<Round> result = new ArrayList();
		
		while ((currentLine = br.readLine()) != null) {

			String[] moves = currentLine.split(" ");
			result.add(new Round(PlayMove.getMoveByOpponentPlayCode(moves[0]).orElse(null),PlayMove.getMoveByPlayerPlayCode(moves[1]).orElse(null)));
	        
		}
    	
		return result;
	}

}
