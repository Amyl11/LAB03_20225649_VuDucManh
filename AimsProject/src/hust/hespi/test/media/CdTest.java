package hust.hespi.test.media;

import hust.hespi.aims.media.CompactDisc;
import hust.hespi.aims.media.Track;

public class CdTest {
	
	public static void main(String[] args) {
		Track track1 = new Track("hello world", 19780);
		Track track2 = new Track("world say no", 30452);
		Track track3 = new Track("destroy the world", 99999);
		
		
		CompactDisc cd1 = new CompactDisc("this is disc 1", "pop", "uzumaki", "Naruto", 49.99f);
		cd1.addTrack(track1);
		cd1.addTrack(track2);
		cd1.addTrack(track1);
		cd1.removeTrack(track2);
		cd1.removeTrack(track3);
		System.out.println(cd1.getLength());
		cd1.addTrack(track2);
		System.out.println(cd1.getLength());
		cd1.addTrack(track3);
		System.out.println(cd1.getLength());
		System.out.println(cd1.getCost());
		track1.play();
		cd1.play();
	}
}
