package activities;

//Create an abstract class Book
abstract class Book {
	//title of type String
	String title;
	
	//an abstract method setTitle() that takes one String argument
	abstract void setTitle(String title);
	
	String getTitle() {
		return title;
	}
}
