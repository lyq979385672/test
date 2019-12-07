package com.lyq.Services;

import com.lyq.model.Book;
import com.lyq.Mapper.BookMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    @Autowired
    BookMapper bookMapper;
    public int addBook(Book book){
     return bookMapper.addBook(book);
    }
    public int updateBook(Book book){
        return bookMapper.updateBookById(book);
    }
    public int deleteBookById(Integer Id){
        return bookMapper.deleteBookById(Id);
    }
    public Book getBookById(Integer Id){
        return bookMapper.getBookById(Id);
    }
    public List<Book> getAllBooks(){
        return bookMapper.getAllBooks();
    }

}
