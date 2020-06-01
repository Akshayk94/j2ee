package domain;

import javax.persistence.*;

@Entity
@Table(name="book")
@PrimaryKeyJoinColumn(name="id")
public class Book extends Product
{
	@Column(name="book_author")
	private String bookAuthor;

	public String getBookAuthor() 
	{
		return bookAuthor;
	}

	public void setBookAuthor(String bookAuthor)
	{
		this.bookAuthor = bookAuthor;
	}

	
}
