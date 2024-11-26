package hust.hespi.aims.store;
import java.util.LinkedList;

import hust.hespi.aims.disc.DigitalVideoDisc;

public class Store {
	private LinkedList<DigitalVideoDisc> itemsInStore = new LinkedList<DigitalVideoDisc>();

    private boolean checkDVD(DigitalVideoDisc disc) {
        for (DigitalVideoDisc digitalVideoDisc : itemsInStore) {
            if (digitalVideoDisc.equals(disc)) {
                return true;
            }
        }
        return false;
    }

    public void addDVD(DigitalVideoDisc disc) {
    	if(!checkDVD(disc)) {
    		itemsInStore.add(disc);
    		System.out.println( disc.getTitle() + " have been added!");
    	} else {
    		System.out.println( disc.getTitle() + " have already exists!");
    	}
    }
    public void removeDVD(DigitalVideoDisc disc) {
        if(checkDVD(disc)) {
            itemsInStore.remove(disc);
            System.out.println( disc.getTitle() + " have been deleted!");
        } else {
            System.out.println("Not found!");
        }
    }

}
