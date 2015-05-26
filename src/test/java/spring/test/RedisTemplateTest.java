package spring.test;

import java.util.Deque;

import junit.framework.TestCase;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;

import spring.module.Book;

public class RedisTemplateTest extends TestCase
{
	private RedisTemplate<String, Book> template;
	private StringRedisTemplate stringTemplate;
	private Deque<String> queue;
	
	@Override
	protected void setUp() throws Exception
	{
		// TODO Auto-generated method stub
		super.setUp();
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		template = (RedisTemplate<String, Book>) ctx.getBean("redisTemplate");
	}
	
	@Test
	public void testLpush()
	{
//		stringTemplate.boundValueOps("mykey").append("hello string");
//		stringTemplate.boundListOps("mylist").leftPush("first element");
//		queue.push("tom");
//		queue.push("jack");
		Book book = new Book(1, "hello java", "tom");
//		System.out.println("before:"+template.opsForHash().get("BOOK", book.getId()));
//		template.opsForHash().put("BOOK", book.getId(), book);
//		template.opsForList().leftPush("BL", book);
//		template.opsForSet().add("SB", book);
//		System.out.println("after:"+((Book)template.opsForSet().pop("SB")).getName());
		System.out.println(((Book) template.opsForList().leftPop("BL")).getName());
	}
}
