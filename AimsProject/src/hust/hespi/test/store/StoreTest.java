package hust.hespi.test.store;


import hust.hespi.aims.media.DigitalVideoDisc;
import hust.hespi.aims.media.Media;
import hust.hespi.aims.store.Store;

public class StoreTest {
	public static void main(String[] args) {
		Store store = new Store();


		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King",
		"Animation", "Roger Allers", 87, 19.95f);
		store.addMedia(dvd1);

		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars",
		"Science Fiction", "George Lucas", 87, 24.95f);
		store.addMedia(dvd2);

		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin",
		"Animation", 18.99f);
		store.addMedia(dvd3);
		store.print();

		store.addMedia(dvd2);
		store.removeMedia(dvd3);
		store.removeMedia(dvd3);
		
		Media check = store.searchByTitle("The Lion Kng");
		if (check == null) {
			System.out.println("null");
		}
	}
}
