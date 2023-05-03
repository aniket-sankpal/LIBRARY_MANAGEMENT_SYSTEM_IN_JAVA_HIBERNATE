package com.aniket.hibernate.dao;

import com.aniket.hibernate.book.Book;

public interface BookDao {
void saveBook(Book book);
Book readBook(int bookId);

Book updateBook(int id3,String uname,double uprice);
Book deleteBook(int id2);

}
