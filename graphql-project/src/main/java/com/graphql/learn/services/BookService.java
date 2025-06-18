package com.graphql.learn.services;

import java.util.List;

import com.graphql.learn.entities.Book;

public interface BookService {

	 public Book create(Book book);

	public  List<Book> getAll();

	public  Book get(int bookId);

}
