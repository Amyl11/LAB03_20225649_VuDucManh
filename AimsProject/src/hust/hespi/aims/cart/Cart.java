package hust.hespi.aims.cart;
import java.util.ArrayList;
import java.util.Collections;

import hust.hespi.aims.media.Media;

public class Cart {
	public static final int MAX_NUMBERS_ORDERED = 20;
	private ArrayList<Media> itemsOrdered = new ArrayList<Media>();
	
	public int addMedia(Media media) {
		for(Media i: itemsOrdered) {
			if(i.equals(media)) {
				System.out.println("This media already exists!");
				return 0;
			}
		}
		itemsOrdered.add(media);
		System.out.println("The Media " + '\"' + media.getTitle() + '\"' + " has been added!");
		return 1;
	}
	
	public int removeMedia(Media media) {
		for(Media i: itemsOrdered) {
			if(i.equals(media)) {
				itemsOrdered.remove(media);
				System.out.println("The media \"" + media.getTitle() + "\" has been removed!");
				return 1;
			}
		}
		System.out.println("This media does not exist!");
		return 0;
	}
	
	public float totalCost() {
		float sum = 0;
		for(Media i: itemsOrdered) {
			sum += i.getCost();
		}
		return sum;
	}

	public void print() {
		StringBuilder bill = new StringBuilder("*********************CART************************** \nOrdered items: \n");
		int stt = 0;
		for(Media i: itemsOrdered) {
			bill.append(stt + ". " +i.toString());
			stt++;
		}
		bill.append("Total: " + totalCost() + " $\n");
        bill.append("***************************************************\n");
        System.out.println(bill);
	}
	
	public Media searchbyId(int ID) {
		if(ID >= itemsOrdered.size()) {
			System.out.println("No item match your search!");
			return null;
		}
		System.out.println(itemsOrdered.get(ID).toString());
		return itemsOrdered.get(ID);
	}

	public Media searchbyTitle(String title) {
		for(Media i: itemsOrdered) {
			if(i.getTitle().equals(title)) {
				System.out.println(i.toString());
				return i;
			}
		}
		System.out.println("No item match your search!");
		return null;
	}
	
	public int getNumberOrdered() {
		return itemsOrdered.size();
	}
	
	public void sortByTitleCost() {
		Collections.sort(itemsOrdered, Media.COMPARE_BY_TITLE_COST);
	}
	
	public void sortByCostTitle() {
		Collections.sort(itemsOrdered, Media.COMPARE_BY_COST_TITLE);
	}
	
	public void clear() {
		itemsOrdered.clear();
		System.out.println("All item cleared!");
	}
}
