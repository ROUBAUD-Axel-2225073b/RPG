package main;
import entite.*;
import carte.*;
import item.*;
import java.util.Scanner;


	public class main {
		public static void main(String[] Args) {
			map plateau = new map();
			plateau.showMap();
			   Scanner scanner = new Scanner(System.in);
		        
		        while (true) {
		            plateau.showMap();
		            char input = scanner.next().charAt(0);
		            plateau.direction(input);
		        }
		}
}