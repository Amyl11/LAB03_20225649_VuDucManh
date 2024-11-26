
public class Cart {
	public static final int MAX_NUMBERS_ORDERED = 20;
	private int qtyOrdered;
	private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc [MAX_NUMBERS_ORDERED];
	
	public int addDigitalVideoDisc(DigitalVideoDisc disc) {
		if (qtyOrdered == MAX_NUMBERS_ORDERED) {
			System.out.println("I'm almost full!");
			return 0;
		} else {
			itemsOrdered[qtyOrdered] = disc;
			qtyOrdered ++;
			System.out.println("The DVD " + '\"' + disc.getTitle() + '\"' + " has been added!");
			return 1;
		}
	}
	
	public int removeDigitalVideoDisc(DigitalVideoDisc disc) {
		if (qtyOrdered == 0) {
			System.out.println("Nothing in your cart!");
			return 0;
		}
		for(int i = 0; i<qtyOrdered; i++) {
			if(itemsOrdered[i].equals(disc)) {
				for(int j = i; j<qtyOrdered-1; j++) {
					itemsOrdered[i] = itemsOrdered[i+1];
				}
				itemsOrdered[qtyOrdered-1] = null;
				qtyOrdered--;
				System.out.println("Remove disc " + '\"' + disc.getTitle() + '\"' + " successfully!");
				return 1;
			}
		}
		System.out.println("Can't found this disc in your cart!");
		return 0;		
	}
	
	public float totalCost() {
		float sum = 0;
		for(int i=0; i<qtyOrdered; i++) {
			sum += itemsOrdered[i].getCost();
		}
		return sum;
	}
}
