package com.aniket.hibernate.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.aniket.hibernate.book.Book;
import com.aniket.hibernate.util.HibernateUtil;

  public class BookDAOImpl implements BookDao{

	public void saveBook(Book book) {
		SessionFactory factory=HibernateUtil.getSessionFactory();
		Session session=factory.openSession();
		
		Transaction tx=session.beginTransaction();
		
		session.save(book);
		
		tx.commit();
		
		session.close();
		System.out.println("###Book added###");
		
		
	}


	public Book readBook(int bookId) {
		SessionFactory factory=HibernateUtil.getSessionFactory();
		Session session=factory.openSession();
		
		Book book=(Book)session.load(Book.class, bookId);
		
		//session.close();
		System.out.println("###show data###");
		return book;
	}
	
	
	
	public Book deleteBook(int bookId) {
		SessionFactory factory=HibernateUtil.getSessionFactory();
		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();
		Book book=(Book)session.get(Book.class, bookId);
		session.delete(book);		
		tx.commit();
		session.close();
		System.out.println("####data deleted####");
		return book;
	}


	public Book updateBook(int id3,String uname,double uprice) {
		SessionFactory factory=HibernateUtil.getSessionFactory();
		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();
		Book book=(Book)session.get(Book.class, id3);
		book.setBookId(id3);
		book.setBookName(uname);
		book.setBookPrice(uprice);
		
		
		
		
		session.update(book);		
		tx.commit();
		session.close();
		System.out.println("####update successfully####");
		return book;
	}

}

