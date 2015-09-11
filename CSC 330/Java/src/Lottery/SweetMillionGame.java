/**
 * LAB 1 - Sweetmillion Lotto QuickOicker Game 
 */
package Lottery;

import java.lang.reflect.Array;
import java.util.*;

public class SweetMillionGame {
	
	// constants  specific to current game - BUT NOT ALL GAMES 
	public int DEFAULT_GAME_COUNT = 1; 
	private final static String GAME_NAME = "QuickPick Lotto"; 
	private final static int SELECTION_POOL_SIZE = 40; 
	private final static int SELECTION_COUNT = 6; 
	
	private Randomizer randomizer; 
	private Date date = new Date();


	public SweetMillionGame() {
		init(); 
	}

	private void init() {
		randomizer = new Randomizer(); 
		
	}
	
	/**
	 * 
	 */
	public void displayTicket() {
		
		/**
		 * display heading 
		 * 
		 * for i in gameCount 
		 * 		generate selectionCount number of unique random selections in ascending order 
		 * 
		 * display footer 
		 */
		
		
		// display ticket heading 
		displayHeading(); 
		
		
		
		/**
		 * Display selected numbers 
		 */
		//right here
		int[] gameArray = new int[SELECTION_COUNT];
		
		for (int i=0; i < DEFAULT_GAME_COUNT; i++) {
			for (int j=0; j < SELECTION_COUNT; j++)
				gameArray[j] = randomizer.generateInt(1, SELECTION_POOL_SIZE);
			
			Arrays.sort(gameArray);
			
			System.out.printf("      (%d) ", i+1);
			for (int k=0; k < SELECTION_COUNT; k++)
				System.out.printf("%02d ", gameArray[k]);
			System.out.print('\n');
		}
		// display ticket footer 
		displayFooter(); 
		
		return;
	}
	
	protected void displayHeading() {
		System.out.println("----------------------------------");
		System.out.printf("-------- %s ---------\n", GAME_NAME);
		System.out.println("-  " + date + "  -");
		System.out.println("----------------------------------\n");
	}
	
	protected void displayFooter() {
		System.out.println("\n----------------------------------");
		System.out.println("(c) Lasha's Awesome Deli (CSC 330) ");
		System.out.println("----------------------------------");
	}
	
 
  

	/**
	 * @param args 
	 */
	public static void main(String[] args) {
		// takes an optional command line parameter specifying number of QP games to be generated
		//  By default, generate 1  
		int numberOfGames  = 1; 
		if(args.length > 0 && Integer.parseInt(args[0]) > 0) {
			numberOfGames = Integer.parseInt(args[0]);
			
		}
		
		SweetMillionGame game = new SweetMillionGame();
		game.DEFAULT_GAME_COUNT = numberOfGames;
		 
		game.displayTicket(); 

	}

}
