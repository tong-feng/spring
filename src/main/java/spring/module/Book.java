package spring.module;

import java.io.Serializable;

public class Book implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = -9052046407593389520L;
	private int id;
	private String name;
	private String author;

	public Book()
	{
	}

	public Book(int id, String name, String author)
	{
		super();
		this.id = id;
		this.name = name;
		this.author = author;
	}

	public int getId()
	{
		return id;
	}

	public void setId(int id)
	{
		this.id = id;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getAuthor()
	{
		return author;
	}

	public void setAuthor(String author)
	{
		this.author = author;
	}

}
