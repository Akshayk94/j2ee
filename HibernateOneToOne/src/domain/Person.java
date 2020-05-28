package domain;

import javax.persistence.*;

@Entity
@Table(name="person_master")
public class Person //CHILD TABLE
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="person_id")
	private int personId;
	
	@Column(name="person_name")
	private String personName;
	
	@Column(name="person_age")
	private int personAge;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="passport_ref")//foreign key
	private Passport passportRef;//OBJECT COMPOSITION
	
	
	public int getPersonId()
	{
		return personId;
	}
	public void setPersonId(int personId) 
	{
		this.personId = personId;
	}
	public String getPersonName() 
	{
		return personName;
	}
	public void setPersonName(String personName)
	{
		this.personName = personName;
	}
	public int getPersonAge() 
	{
		return personAge;
	}
	public void setPersonAge(int personAge) 
	{
		this.personAge = personAge;
	}
	public Passport getPassportRef() 
	{
		return passportRef;
	}
	public void setPassportRef(Passport passportRef)
	{
		this.passportRef = passportRef;
	}
	
}
