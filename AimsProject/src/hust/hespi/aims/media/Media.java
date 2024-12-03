package hust.hespi.aims.media;

import java.util.Comparator;

public abstract class Media {
	
	public static final Comparator<Media> COMPARE_BY_TITLE_COST = new MediaComparatorByTitleCost();
	public static final Comparator<Media> COMPARE_BY_COST_TITLE = new MediaComparatorByCostTitle();
	
	private static int nbMedia = 0;
	private int id;
	private String title;
	private String category;
	private float cost;
	public Media() {
		// TODO Auto-generated constructor stub
	}
	
	public Media(String title) {
		super();
		this.title = title;
		this.id = nbMedia++;
	}
	
	public Media(String title, String category, float cost) {
		super();
		this.title = title;
		this.category = category;
		this.cost = cost;
		this.id = nbMedia++;
	}

	
	@Override
	public boolean equals(Object o) {
		Media obj = (Media) o;
		if(this.title.equals(obj.title)) {
			return true;
		}
		return false;
	}
	
	public int getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public String getCategory() {
		return category;
	}

	public float getCost() {
		return cost;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	

}
