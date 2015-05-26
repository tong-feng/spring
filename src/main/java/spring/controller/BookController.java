package spring.controller;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.ListOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import spring.module.Book;
import spring.service.BookService;

@Controller
@RequestMapping("/book.do")
public class BookController
{

	private BookService bookService;
	@Autowired
	private RedisTemplate<String, String> template;
	@Resource(name="redisTemplate")
	private ListOperations<String, String> listOps;

	@RequestMapping(params = "method=add")
	public String add(Book book)
	{
		System.out.println(template.opsForValue().get("abc"));
		System.out.println("bookname:" + book.getName());
		System.out.println("author:" + book.getAuthor());
		bookService.add(book);
		return "success";
	}

	@RequestMapping(params = "method=update")
	public String update(Book book)
	{
		bookService.update(book);
		return "success";
	}

	public BookService getBookService()
	{
		return bookService;
	}

	@Resource
	public void setBookService(BookService bookService)
	{
		this.bookService = bookService;
	}

}
