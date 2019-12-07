package com.lyq.Mapper;

import com.lyq.model.Book;
import org.apache.catalina.User;


import java.util.List;

public interface UserMapper {
//    //int addUser(Book book);
//    int deleteUserById(Integer Id);
//    int updateUserById(Book book);
//    Book getUserById(Integer Id);
//    List<Book> getAllBooks();
    User getUser(User user) ;
}
