

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
	static int addingIndex = 0;
	
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
				addMenuItem(menu);
				
			} else if (decision == 4) {
				deleteMenuItem(menu);
				
			} else {
				deleteAllMenuItems(menu);
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
		
		if (isValid(menuNum)) {
			System.out.println(menuNum + ": " + menu[menuNum]);
		}
	
	}
	
	public static void addMenuItem(String[] menu) {
		System.out.println("Enter new Grocery Item: ");
		String newMember = input.next();
		
		if (isValid(addingIndex)) {
			menu[addingIndex++] = newMember;
		} 
		
	}
	
	public static void deleteMenuItem(String[] menu) {
		System.out.println("What item would you like to delete?");
		int deleteMember = input.nextInt();
		
		if(isValid(deleteMember)) {
			menu[deleteMember] = null;
		}
	}
	
	public static void deleteAllMenuItems(String[] menu) {
		for(int i = 0; i < menu.length; i++) {
			menu[i] = null;
		}
	}
	
//	checks the validity of the user input for menu item numbers
	public static boolean isValid(int choice) {
		if(choice >= 0 && choice < 5) {
			return true;
		} else {
			System.out.println("Invalid Entry.");
			return false;
		}
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
