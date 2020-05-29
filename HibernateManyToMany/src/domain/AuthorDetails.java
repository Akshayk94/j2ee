package domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name="author_master")
public class AuthorDetails 
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="author_id")
	private int authorId;
	
	@Column(name="author_name")
	private String authorName;
	
	@ManyToMany(cascade= {CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH})
	@JoinTable
			(
				name="book_author",
				joinColumns=@JoinColumn(name="author_ref"),
				inverseJoinColumns=@JoinColumn(name="book_ref")
			)
	private List<BookDetails> booklist;

	public int getAuthorId() 
	{
		return authorId;
	}

	public void setAuthorId(int authorId)
	{
		this.authorId = authorId;
	}

	public String getAuthorName() 
	{
		return authorName;
	}

	public void setAuthorName(String authorName)
	{
		this.authorName = authorName;
	}

	public List<BookDetails> getBooklist()
	{
		return booklist;
	}

	public void setBooklist(List<BookDetails> booklist)
	{
		this.booklist = booklist;
	}
	
	//helper method
	
	public void addBooks(BookDetails bookref)
	{
		if(booklist==null)
		{
			booklist=new ArrayList<BookDetails>();
		}
		
		booklist.add(bookref);
	}
}
