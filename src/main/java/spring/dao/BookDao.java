package spring.dao;


import org.springframework.stereotype.Component;

import spring.module.Book;

@Component  
public class BookDao {  
  
    //模拟数据库操作  
    public void add(Book book){  
        System.out.print("Add");  
    }  
    public void update(Book book){  
        System.out.print("Update");  
    }  
}  
