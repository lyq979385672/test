package com.lyq.Controller;

import com.lyq.model.Book;
import com.lyq.Services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BookController {
    @Autowired
    BookService bookService;
   @GetMapping("/bookOP")
    @ResponseBody
    public Book bookOP(){
       Book book = new Book();
       book.setAuthor("罗贯中");
       book.setName("三国演义");
       int i = bookService.addBook(book);
       System.out.println("addBook>>>"+i);

       return book;
   }

}
