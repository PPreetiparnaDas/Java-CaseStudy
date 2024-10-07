package project;

interface   LibraryOperations {
	void addBook(Book book);


	void viewBooks();


	void borrowBook(int bookId);


	void returnBook(int bookId);
}
