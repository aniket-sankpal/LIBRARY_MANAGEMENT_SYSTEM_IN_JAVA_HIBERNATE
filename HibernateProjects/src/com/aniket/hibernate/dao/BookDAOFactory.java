package com.aniket.hibernate.dao;

public class BookDAOFactory {
public static BookDao getInstance()
{
	
	
	return new BookDAOImpl();
			
}



}
