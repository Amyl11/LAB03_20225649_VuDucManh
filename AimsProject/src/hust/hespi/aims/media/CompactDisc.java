package hust.hespi.aims.media;

import java.util.ArrayList;
import java.util.List;

public class CompactDisc extends Disc implements Playable {
	private String artist;
	private List<Track> tracks = new ArrayList<Track>();
	
	public CompactDisc() {
		// TODO Auto-generated constructor stub
	}
	
	public CompactDisc(String title, String category, String director, String artist, float cost) {
		super(title, category, director, cost);
		this.artist = artist;
	}
	
	public int addTrack(Track track) {
		for(Track i: tracks) {
			if(i.equals(track)) {
				System.out.println("This track already exists!");
				return 0;
			}
		}
		tracks.add(track);
		System.out.println("Added track successfully!");
		return 1;
	}
	
	public int removeTrack(Track track) {
		for(Track i: tracks) {
			if(i.equals(track)) {
				tracks.remove(track);
				System.out.println("Removed track successfully!");
				return 1;
			}
		}
		System.out.println("This track does not exist");
		return 0;
	}
	
	public int getLength() {
		int length = 0;
		for(Track i: tracks) {
			length += i.getLength();
		}
		return length;
	}
	
	public String getArtist() {
		return artist;
	}

	public String toString() {
		return ("CD - [" + getTitle() +"] - ["+ getCategory() +"] - ["+ getDirector() +"] - ["+ getArtist() +"] - ["+ getLength() +"]: "+ getCost() + "$\n");
	}
	
	@Override
	public void play() {
		System.out.println("Playing CD: " + getTitle());
		System.out.println("CD length: " + getLength());
		for(Track i: tracks) {
			i.play();
		}
	}

}
