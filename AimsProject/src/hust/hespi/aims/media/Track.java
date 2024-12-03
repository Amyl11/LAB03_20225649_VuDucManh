package hust.hespi.aims.media;

public class Track implements Playable {
	private String title;
	private int length;
	
	public Track() {
		
	}
	
	public Track(String title) {
		super();
		this.title = title;
	}
	
	public Track(String title, int length) {
		super();
		this.title = title;
		this.length = length;
	}
	
	public String getTitle() {
		return title;
	}
	public int getLength() {
		return length;
	}

	@Override
	public boolean equals(Object o) {
		Track obj = (Track) o;
		if(this.title.equals(obj.title) && this.length == obj.length) {
			return true;
		}
		return false;
	}
	
	@Override
	public void play() {
		System.out.println("Playing Track: " + this.getTitle());
		System.out.println("Track length: " + this.getLength());
	}
}
