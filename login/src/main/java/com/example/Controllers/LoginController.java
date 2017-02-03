package com.example.Controllers;


import com.example.Models.User;
import com.example.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by amladzhov on 2/3/2017.
 */
@Controller
public class LoginController {

    @Autowired
    UserService userService;


    @RequestMapping(value="/home")
    String HomeSave(){
                return "home";
    }
    @RequestMapping(value="/hello")
    String hello(){
        return "hello";
    }

   /* @RequestMapping(value="/login", method = RequestMethod.POST)
    String login(HttpServletRequest request,
                 @RequestParam(value="email", required=false) String email,
                 @RequestParam(value="password", required=false) String password,
                 @RequestParam(value="username", required=false) String name){
        return "login";
    }*/
   @RequestMapping(value = "/login", method = RequestMethod.GET)
   public String addContact(@ModelAttribute("user")User user, BindingResult result){
       user.getName();
   return "login";
   }
}
