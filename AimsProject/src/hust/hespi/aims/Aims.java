package hust.hespi.aims;
import java.util.Scanner;

import hust.hespi.aims.cart.Cart;
import hust.hespi.aims.media.Book;
import hust.hespi.aims.media.CompactDisc;
import hust.hespi.aims.media.DigitalVideoDisc;
import hust.hespi.aims.media.Media;
import hust.hespi.aims.store.Store;

public class Aims {
	
	private static final Scanner scanner = new Scanner(System.in);

	
	public static void showMenu(Store store, Cart cart) {
		while(true) {
			System.out.println("AIMS: ");
			System.out.println("--------------------------------");
			System.out.println("1. View store");
			System.out.println("2. Update store");
			System.out.println("3. See current cart");
			System.out.println("0. Exit");
			System.out.println("--------------------------------");
			System.out.println("Please choose a number: 0-1-2-3");
			
			int choice = scanner.nextInt();
			
			
			if(choice == 1) {

				storeMenu(store, cart);
			}
			
			if(choice == 2) {

				updateStoreMenu(store);
			}
			if(choice == 3) {
				
				cartMenu(cart);
			}
			if(choice == 0) {
				break;
			}
		}
		
		
	}
	
	public static void storeMenu(Store store, Cart cart) {
		while(true) {
			store.print();
			System.out.println("Options: ");
			System.out.println("--------------------------------");
			System.out.println("1. See a media’s details");
			System.out.println("2. Add a media to cart");
			System.out.println("3. Play a media");
			System.out.println("4. See current cart");
			System.out.println("0. Back");
			System.out.println("--------------------------------");
			System.out.println("Please choose a number: 0-1-2-3-4");
			

			int choice = scanner.nextInt();
			scanner.nextLine();
			

			if(choice == 1) {
				System.out.println("Enter title: ");
				String title = scanner.nextLine();
				Media media = store.searchByTitle(title);
				if(media != null) {
					mediaDetailsMenu(cart, media);
				}
			}
			
			if(choice == 2) {
				System.out.println("Enter title: ");
				String title = scanner.nextLine();
				Media media = store.searchByTitle(title);
				if(media != null) {
					cart.addMedia(media);
					System.out.println("Quantity of items ordered: "+ cart.getNumberOrdered());
				}
			}
			
			if(choice == 3) {
				System.out.println("Enter title: ");
				String title = scanner.nextLine();
				Media media = store.searchByTitle(title);
				if(media != null) {
					if(media instanceof DigitalVideoDisc) {
						DigitalVideoDisc dvd = (DigitalVideoDisc) media;
						dvd.play();
					} else if(media instanceof CompactDisc) {
						CompactDisc cd = (CompactDisc) media;
						cd.play();
					} else {
						System.out.println("This media type is not playable!");
					}
				}
			}
			
			if(choice == 4) {
				cartMenu(cart);
			}
			
			if(choice == 0) {
				break;
			}

		}
	}
	
	public static void mediaDetailsMenu(Cart cart, Media media) {
		System.out.println("Options: ");
		System.out.println("--------------------------------");
		System.out.println("1. Add to cart");
		System.out.println("2. Play");
		System.out.println("0. Back");
		System.out.println("--------------------------------");
		System.out.println("Please choose a number: 0-1-2");
		

		int choice = scanner.nextInt();
		
		if(choice == 1) {
			cart.addMedia(media);
		}
		if(choice == 2) {
			if(media instanceof DigitalVideoDisc) {
				DigitalVideoDisc dvd = (DigitalVideoDisc) media;
				dvd.play();
			} else if(media instanceof CompactDisc) {
				CompactDisc cd = (CompactDisc) media;
				cd.play();
			} else {
				System.out.println("This media type is not playable!");
			}
		}
	}


	public static void updateStoreMenu(Store store) {
		while(true) {
			store.print();
			System.out.println("Options: ");
			System.out.println("--------------------------------");
			System.out.println("1. Add a media");
			System.out.println("2. Remove a media");
			System.out.println("0. Back");
			System.out.println("--------------------------------");
			System.out.println("Please choose a number: 0-1-2");
			
			int choice = scanner.nextInt();
			
			if(choice == 1) {
				System.out.println("Type of media: ");
				System.out.println("--------------------------------");
				System.out.println("1. Book");
				System.out.println("2. Digital Video Disc");
				System.out.println("3. Compact Disc");
				System.out.println("0. Back");
				System.out.println("--------------------------------");
				System.out.println("Please choose a number: 0-1-2-3");
				
				choice = scanner.nextInt();
				scanner.nextLine();
				if(choice == 1) {
					store.addMedia(new Book(scanner.nextLine(),scanner.nextLine(),scanner.nextFloat()));
				}
				if(choice == 2) {
					store.addMedia(new DigitalVideoDisc(scanner.nextLine(),scanner.nextLine(),scanner.nextLine(),scanner.nextInt(),scanner.nextFloat()));
				}
				if(choice == 3) {
					store.addMedia(new CompactDisc(scanner.nextLine(),scanner.nextLine(),scanner.nextLine(),scanner.nextLine(),scanner.nextFloat()));
				}
			} else if(choice == 2) {
				System.out.println("Enter title: ");
				scanner.nextLine();
				String title = scanner.nextLine();
				store.removeMedia(store.searchByTitle(title));
			} else if(choice == 0) {
				break;
			}
		}
	}
	
	public static void cartMenu(Cart cart) {
		while(true) {
			cart.print();
			System.out.println("Options: ");
			System.out.println("--------------------------------");
			System.out.println("1. Filter medias in cart");
			System.out.println("2. Sort medias in cart");
			System.out.println("3. Remove media from cart");
			System.out.println("4. Play a media");
			System.out.println("5. Place order");
			System.out.println("0. Back");
			System.out.println("--------------------------------");
			System.out.println("Please choose a number: 0-1-2-3-4-5");
			
			int choice = scanner.nextInt();
			
			if(choice == 1) {
				System.out.println("Options: ");
				System.out.println("--------------------------------");
				System.out.println("1. Filter by ID");
				System.out.println("2. Filter by title");
				System.out.println("0. Back");
				System.out.println("--------------------------------");
				System.out.println("Please choose a number: 0-1-2");
				
				int secondchoice = scanner.nextInt();
				
				if(secondchoice == 1) {
					System.out.println("Enter ID: ");
					cart.searchbyId(scanner.nextInt());
				}
				if(secondchoice == 2) {
					System.out.println("Enter title: ");
					scanner.nextLine();
					cart.searchbyTitle(scanner.nextLine());
				}
			}
			
			if(choice == 2) {
				System.out.println("Options: ");
				System.out.println("--------------------------------");
				System.out.println("1. Sort by title");
				System.out.println("2. Sort by cost");
				System.out.println("0. Back");
				System.out.println("--------------------------------");
				System.out.println("Please choose a number: 0-1-2");
				
				int secondchoice = scanner.nextInt();
				
				if(secondchoice == 1) {
					cart.sortByTitleCost();
				}
				if(secondchoice == 2) {
					cart.sortByCostTitle();
				}
			}
			
			if(choice == 3) {
				System.out.println("Enter title: ");
				scanner.nextLine();
				String title = scanner.nextLine();
				cart.removeMedia(cart.searchbyTitle(title));
			}
			
			if(choice == 4) {
				System.out.println("Enter title: ");
				scanner.nextLine();
				String title = scanner.nextLine();
				Media media = cart.searchbyTitle(title);
				if(media instanceof DigitalVideoDisc) {
					DigitalVideoDisc dvd = (DigitalVideoDisc) media;
					dvd.play();
				} else if(media instanceof CompactDisc) {
					CompactDisc cd = (CompactDisc) media;
					cd.play();
				} else {
					System.out.println("This media type is not playable!");
				}
			}
			
			if(choice == 5) {
				System.out.println("An order is created!");
				cart.clear();
			}
			
			if(choice == 0) {
				break;
			}
		}
	}

	
	public static void main(String[] args) {
		
		Store store = new Store();

		Cart cart = new Cart();

		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
		store.addMedia(dvd1);

		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
		store.addMedia(dvd2);

		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.99f);
		store.addMedia(dvd3);
		
		DigitalVideoDisc dvd4 = new DigitalVideoDisc("Harry Potter and the Philosopher's Stone", "Animation", "J.K.Rowling", 137, 99.99f) ;
		store.addMedia(dvd4);
		
		CompactDisc cd = new CompactDisc("this is disc 1", "pop", "uzumaki", "Naruto", 49.99f);
		Book book = new Book("tha ho ve rung");
		
		store.addMedia(cd);
		store.addMedia(book);


		showMenu(store, cart);
		scanner.close();

		
//		
//		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
//		anOrder. addMedia(dvd1);
//
//		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f) ;
//		anOrder. addMedia(dvd2);
//
//		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.99f);
//		anOrder. addMedia(dvd3);
//		
//		
//		System.out.println("---------------------------------------------------------------------------------");
//		
//		anOrder.removeMedia(dvd4);
//		
//		System.out.println("---------------------------------------------------------------------------------");
//		System.out.println("Total Cost is: ");
//		System.out.println(anOrder.totalCost());
//		
//		
//		List<Media> mediae = new ArrayList<Media>();
//
//
//		for(Media m: mediae) {
//			System.out.println(m.toString());
//		}
	}
}
