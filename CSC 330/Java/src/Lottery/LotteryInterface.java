/*
 * Title: 		Lottery Interface
 * Author:		Lasha Zakariashvili
 * 
 * Description: Generates a lottery "ticket".
 * 
 * Usage: 		printHeader()	//Prints header
 * 				printFooter()	//Prints footer
 * 				generateTicket(chances per game, number of games, FROM, TO)	   //generates the
 * 																			   core of the ticket
 */

package Lottery;

import java.util.*;
import javax.swing.JFrame;

public class LotteryInterface {
	static Date date = new Date();
	
	public static void printHeader() {
		System.out.println("----------------------------------");
		System.out.println("-------- QuickPick Lotto ---------");
		System.out.println("-  " + date + "  -");
		System.out.println("----------------------------------\n");
	}
	public static void printFooter() {
		System.out.println("\n----------------------------------");
		System.out.println("(c) Lasha's Awesome Deli (CSC 330) ");
		System.out.println("----------------------------------");
	}
	public static void generateTicket(int chance_per_game, int number_of_games, int from, int to) {
		//Generate Rows
		for (int i=0; i<number_of_games; i++) {
			System.out.printf("      (%d) ", i+1);
			int[] array = Randomizer.generateArray(from,to,chance_per_game,true);
			
			//Generate Columns
			for (int j=0; j<chance_per_game; j++)
				System.out.printf("%02d " , array[j]);
			System.out.print('\n');
		}
	}
	
	public static void main(String[] args) {
		int numberOfGames;
		if (args.length != 0 && Integer.parseInt(args[0]) == 0)
			numberOfGames = Integer.parseInt(args[0]);
		else
			numberOfGames = 1;
		printHeader();
		generateTicket(6, numberOfGames, 1, 40);
		printFooter();
	}
}
