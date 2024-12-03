package hust.hespi.aims.store;
import java.util.ArrayList;
import hust.hespi.aims.media.Media;

public class Store {
	private ArrayList<Media> itemsInStore = new ArrayList<Media>();

    public int addMedia(Media media) {
    	for(Media i: itemsInStore) {
    		if(i.equals(media)) {
    			System.out.println("This media already exists!");
    			return 0;
    		}
    	}
    	itemsInStore.add(media);
    	System.out.println("The media \"" + media.getTitle() + "\" have been added!");    			
    	return 1;
    }
    
    public int removeMedia(Media media) {
        for(Media i: itemsInStore) {
        	if(i.equals(media)) {
        		itemsInStore.remove(media);
        		System.out.println("The media \"" + media.getTitle() + "\" have been deleted!");        		
        		return 1;
        	}
        }
        System.out.println("This media does not exist!");
        return 0;
    }
    
    public void print() {
		StringBuilder store = new StringBuilder("*********************STORE************************** \nItems In Store: \n");
		int stt = 0;
		for(Media i: itemsInStore) {
			store.append(stt + ". " +i.toString());
			stt++;
		}
        store.append("****************************************************\n");
        System.out.println(store);
	}
    
    public Media searchByTitle(String title) {
    	for(Media i: itemsInStore) {
    		if(i.getTitle().equals(title)) {
    			System.out.println(i.toString());
    			return i;
    		}
    	}
    	System.out.println("That Media is not for sale yet!");
    	return null;
    }
}
