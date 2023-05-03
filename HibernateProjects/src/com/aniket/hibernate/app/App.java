package com.aniket.hibernate.app;

import java.util.Scanner;

import com.aniket.hibernate.book.Book;
import com.aniket.hibernate.dao.BookDAOFactory;
import com.aniket.hibernate.dao.BookDao;


public class App {

		
		public static void main(String[] args) {
			Scanner sc =new Scanner(System.in);
			
			while(true) {
				System.out.println("1.ADD BOOK");
				System.out.println("2.SERACH BOOK");
				System.out.println("3.DELETE BOOK");
				System.out.println("4.UPDATE BOOK");
				System.out.println("enter your choice");
				int n=sc.nextInt();
			switch (n) {
			case 1:
				System.out.println("-----------------------------");

				System.out.println("***ADD DATA***");
				System.out.println("-----------------------------");

				System.out.println("enter book id");
			int id=sc.nextInt();
			System.out.println("enter book name");
			String name=sc.next();
			System.out.println("enter price");
			double price=sc.nextDouble();
			
			
	Book b=new Book(id,name,price);
			
			BookDao dao=BookDAOFactory.getInstance();
			
			dao.saveBook(b);
			System.out.println("-----------------------------");

				break;

case 2:
	System.out.println("-----------------------------");

	System.out.println("***search data***");
	System.out.println("-----------------------------");

	System.out.println("enter book id");
	int id1=sc.nextInt();
	BookDao dao2=BookDAOFactory.getInstance();
	
	Book book=dao2.readBook(id1);

  System.out.println("Id:"+book.getBookId());
  System.out.println("Name:"+book.getBookName());
   System.out.println("Price:"+book.getBookPrice());
   System.out.println("-----------------------------");

				break;
				
case 3:
	System.out.println("-----------------------------");
	System.out.println("***DELETE BOOK***");
	System.out.println("-----------------------------");
	System.out.println("enter book id");
	int id2=sc.nextInt();
	BookDao dao1=BookDAOFactory.getInstance();
	
	  dao1.deleteBook(id2);
		System.out.println("-----------------------------");
	break;
case 4:
	System.out.println("-----------------------------");
	System.out.println("***UPDATE BOOK***");
	System.out.println("-----------------------------");
	System.out.println("enter book id");
	int id3=sc.nextInt();

	System.out.println("enter book name");
	String uname=sc.next();
	System.out.println("enter price");
	double uprice=sc.nextDouble();	
	
	BookDao dao3=BookDAOFactory.getInstance();
	
	  dao3.updateBook(id3,uname,uprice);
		System.out.println("-----------------------------");
	
	break;
				
			default:
				System.out.println("wrong choice");
				break;
			}
			}
			
			
		
		
	
		   
		}

	}


