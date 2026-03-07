class Book{
	// PRIVATE ATTRIBUTES
	private String title;
	private String author;
	private double price;
	
	// DEFAULT CONSTRUCTOR
	public Book(){
		this.title = "Untitled";
		this.author = "Unknown";
		this.price = 0.0;
	}

	// PARAMETARIZED 
	public Book(String title, String author, double price){
		this.title = title;
		this.author = author;
		this.price = price;
	}

	// SETTERS
	public void setTitle(String title){
		this.title = title;
	}

	public void setAuthor(String author){
		this.author = author;
	}

	public void setPrice(double price){
		this.price = price;
	}

	// GETTERS
	public String getTitle(){
		return title;
	}

	public String getAuthor(){
		return author;
	}

	public double getPrice(){
		return price;
	}

	// METHODS
	public void applyDiscount(){
		double discount = price * 0.10;
		double finalDiscount = price - discount;
		System.out.println("After Discount(10%): ");
		System.out.printf("Title: " + title + " by Author: " + author + " | Price: %.2f\n" , 			finalDiscount);
	}

	public void printBookInfo(){
		System.out.printf("Title: " + title + " by Author: " + author + " | Price: %.2f\n" , price);
	}

	

	
}