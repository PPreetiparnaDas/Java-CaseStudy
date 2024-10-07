package project;
import java.util.*;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static Scanner sc=new Scanner(System.in);

	public static void main(String[] args) {
		boolean exit = false;
		Library library=new Library();
		int choice = 0;
		while (true) {
			System.out.println("\n Libreary Management System ");
			System.out.println("1. Add Books");
			System.out.println("2. View All Books");
			System.out.println("3. Borrow a Book");
			System.out.println("4. Return a Book");
			System.out.println("5. Exit");
			System.out.print("Choose an option: ");
			choice = sc.nextInt();
			sc.nextLine(); 


			switch (choice) {
			case 1:

				System.out.print("Enter Book ID: ");
				int bookId = sc.nextInt();
				sc.nextLine(); // Consume newline
				System.out.print("Enter Book Title: ");
				String title = sc.nextLine();
				System.out.print("Enter Author Name: ");
				String author = sc.nextLine();
				System.out.print("Enter ISBN: ");
				String ISBN = sc.nextLine();
				Book newBook = new Book(bookId, title, author, ISBN);
				library.addBook(newBook);	
				break;
			case 2:
				library.viewBooks();
				break;
			case  3:

				System.out.print("Enter the Book ID to borrow: ");
				int borrowBookId = sc.nextInt();
				library.borrowBook(borrowBookId);
				break;
			case 4:
				System.out.print("Enter the Book ID to return: ");
				int returnBookId = sc.nextInt();
				library.returnBook(returnBookId);
				break;
			case 5:
				exit = true;
				System.out.println("Exiting  Application...");
				break;
			default:
				System.out.println("Invalid choice. Please try again.");
			}
		}

	} 







}
