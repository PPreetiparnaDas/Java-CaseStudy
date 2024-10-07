package project;

import java.util.Scanner;

public  class Library implements LibraryOperations{
	 private final  int MAX_SIZE=100;
	private Book[] books;
	private int BookCount;
	

	//constructor
	public Library() {
		books = new Book[MAX_SIZE]; // Initialize the array
		BookCount = 0;
	}

	//addBook method
	public void addBook(Book book){
		 if (BookCount < MAX_SIZE ){
	            books[BookCount] = book;
	            BookCount++;
	            System.out.println("Book added successfully.");
	        } else {
	            System.out.println("Library is full, cannot add more books.");
	        }
	}
	public void viewBooks(){
        if (BookCount == 0) {
            System.out.println("No books available in the library.");
        } else {
            System.out.println("Listing all books in the library:");
            for (int i = 0; i < BookCount; i++) {
                books[i].displayBookDetails();
                System.out.println("----------------------------");
            }

		}

	}

	public void borrowBook(int bookId){
		for(int i=0;i<books.length-1;i++) {
			if (books[i].getBookId() == bookId) {
                if (books[i].isAvailable()) {
                    books[i].setAvailable(false);
                    System.out.println(" successfully borrowed : " + books[i].getTitle());
                } else {
                    System.out.println("Sorry, the book  not available.");
                }
                return;
            }
        }
        System.out.println("Book  ID " + bookId + " not found.");
		}
	


	public void returnBook(int bookId){
		for (int i = 0; i <books.length-1 ; i++) {
            if (books[i].getBookId() == bookId) {
                if (!books[i].isAvailable() ) {
                    books[i].setAvailable(true);
                    System.out.println("successfully returned the book: " + books[i].getTitle());
                } else {
                    System.out.println("This book was not borrowed.");
                }
                return;
            }
        }
        System.out.println("Book with ID   not found." + bookId);
    }

	}

	



