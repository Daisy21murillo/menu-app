

//Daisy Murillo
//July 5, 2020

//Add Grocery Item
//View Grocery Item
//View All Grocery Items
//Delete Grocery Item by Position
//Delete All Groceries

import java.util.Scanner;

public class GroceriesMenuApp {

	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		String[] menu = new String[5];
		
		int decision = 0;
		
		while(decision != -1 ) {
			showMenu();
			decision = input.nextInt();
			
			if (decision < -1 || decision > 5) {
				System.out.println("Please enter a valid option");
			} else if (decision == 1) {
				showMenu(menu);
				
			} else if (decision == 2) {
				showMenuItem(menu);
				
			} else if (decision == 3) {
				//addMenuItem(menu);
				
			} else if (decision == 4) {
				//deleteMenuItem(menu);
				
			} else {
				//deleteAllMenuItems(menu);
			}
		}

	}
	
	private static void showMenu(String[] menu) {
		System.out.println("Menu: ");
	
		for (int i = 0; i < menu.length; i ++) {
			System.out.println(i + ": " + menu[i]);
		}
//		for (String item : menu) {
//			System.out.println(item);
//		}
		
	}
	
	public static void showMenuItem(String[] menu) {
		System.out.println("Which Grocery Item would you like to see?");
		
		int menuNum = input.nextInt();
		System.out.println(menuNum + ": " + menu[menuNum]);
		
	}

	public static void showMenu() {
		System.out.println("Please pick an option, or enter -1 to exit");
		System.out.println("1.) Show Groceries");
		System.out.println("2.) Show Grocery Item");
		System.out.println("3.) Add Grocery Item");
		System.out.println("4.) Delete Grocery Item");
		System.out.println("5.) Delete All Grocery Items");
	}

}
