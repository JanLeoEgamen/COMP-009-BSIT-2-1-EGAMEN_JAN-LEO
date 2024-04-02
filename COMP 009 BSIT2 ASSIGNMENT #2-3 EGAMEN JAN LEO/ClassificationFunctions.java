//COMP 009 BSIT2 ASSIGNMENT#3:DATA STRUCTURE - EGAMEN, JAN LEO B
import java.util.Scanner;

public class ClassificationFunctions extends ClassificationData{
	
	ClassificationData printfood = new ClassificationData();
	
	//method in line with printing in bullet form for efficiency by using for each
	public void PrintElementBullet(String[] Items) {
		for(String item : Items) {
			System.out.println("\t\t\t-" + item);
		}
	}

	//method for printing in bullet form
	public void PrintinBullet() {
		ClassificationData bullet = new ClassificationData();
        String[] foodName = {"Dairy Products", "Meat", "Poultry", "Vegetable", "Fruit", "Beverage", "Condiments", "Consumable"};
        String[][] food = {bullet.dairyProducts, bullet.meat, bullet.poultry,
        		bullet.vegetable, bullet.fruit, bullet.beverage, bullet.condiments, bullet.consumable};

        System.out.println("*Food");        
        for(int i = 0; i<foodName.length; i++) {
        	System.out.println("\t[]" + foodName[i]);
        	PrintElementBullet(food[i]);
        	
        }
	}
	
	//method for printing in tree structure
	public void PrintinTree() {
		ClassificationData PrintTree = new ClassificationData();
		
		//2d array 
        String[][] food = {PrintTree.dairyProducts, PrintTree.meat, PrintTree.poultry,
        		PrintTree.vegetable, PrintTree.fruit, PrintTree.beverage, PrintTree.condiments, PrintTree.consumable};
        String[] foodName = {"Dairy Products", "Meat", "Poultry", "Vegetable", "Fruit", "Beverage", "Condiments", "Consumable"};
	
		System.out.println("Tree Structure");
		System.out.println("Food");
		System.out.println("|");
		
		//outer
		for(int a = 0; a < food.length; a++) {
			System.out.println("|-----" + foodName[a]);
			
			//inner
			for(int b = 0; b< food[a].length; b++) {
				System.out.println("|\t|---" + food[a][b]);
			}
			System.out.println("|");

		}

	}
	}
