class BookMain{
	public static void main(String andrei[]){
		Book book1 = new Book("Clean Code", "Robert Martin", 550.00);
		book1.printBookInfo();

		Book book2 = new Book();
		book2.printBookInfo();
		
		book1.applyDiscount();

	}
}