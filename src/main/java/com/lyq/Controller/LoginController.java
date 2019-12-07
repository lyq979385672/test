package com.lyq.Controller;

import com.lyq.Mapper.UserMapper;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class LoginController {
     @Autowired(required = false)
    private UserMapper userMapper;
     @PostMapping(value = "/login")
    public  String login(User user){
         User u = userMapper.getUser(user);
         //if (u != null)

     }

}
