//package com.example.PaymentsWebApp.Controller;
//
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.GetMapping;
////import org.springframework.web.bind.annotation.PostMapping;
//
//@Controller
//
//public class UserDetailsController {
//	@GetMapping("/profile")
//  public String showProfile() {
//      return "profile"; // Maps to /WEB-INF/jsp/profile.jsp
//  }
//
//  @GetMapping("/editprofile")
//  public String showEditProfile() {
//  	System.out.println("this is edit profile");
//  	return "editprofile";
//  }
//
//}
package com.example.PaymentsWebApp.Controller;

import com.example.PaymentsWebApp.Entity.UserEntity;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserDetailsController {

    @GetMapping("/profile")
    public String showUserProfile(HttpSession session, Model model) {
        UserEntity loggedInUser = (UserEntity) session.getAttribute("loggedInUser");
        if (loggedInUser != null) {
            model.addAttribute("user", loggedInUser);
            return "profile";
        } else {
            return "redirect:/login";
        }
    }
}
