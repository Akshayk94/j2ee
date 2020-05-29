package domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name="book_master")
public class BookDetails
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="book_id")
	private int bookId;
	
	@Column(name="book_name")
	private String bookName;
	
	@ManyToMany(cascade= {CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH})
	@JoinTable
				(
					name="book_author",
					joinColumns=@JoinColumn(name="book_ref"),
					inverseJoinColumns=@JoinColumn(name="author_ref")
				)
	private List<AuthorDetails> authorlist;

	public int getBookId()
	{
		return bookId;
	}

	public void setBookId(int bookId)
	{
		this.bookId = bookId;
	}

	public String getBookName() 
	{
		return bookName;
	}

	public void setBookName(String bookName)
	{
		this.bookName = bookName;
	}

	public List<AuthorDetails> getAuthorlist() 
	{
		return authorlist;
	}

	public void setAuthorlist(List<AuthorDetails> authorlist)
	{
		this.authorlist = authorlist;
	}
	
	//helper method
	
	public void addAuthors(AuthorDetails authref)
	{
		if(authorlist==null)
		{
			authorlist=new ArrayList<AuthorDetails>();
		}
		
		authorlist.add(authref);
	}
	
}
