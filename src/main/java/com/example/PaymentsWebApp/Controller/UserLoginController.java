package com.example.PaymentsWebApp.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserLoginController {

    @GetMapping("/login")
    public String home(){
    	System.out.println("this is user login controller");
        return "login";
    }
    @PostMapping("/login")
    public String loginRedirect() {
        return "index"; 
    }

}
