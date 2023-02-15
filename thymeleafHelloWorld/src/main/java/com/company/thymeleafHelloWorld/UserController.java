package com.company.thymeleafHelloWorld;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class UserController {
    @GetMapping("/if-unless")
    public String users(Model model){
        List<User> users = new ArrayList<>();
        users.add(new User("Bryan","brillant16.gcv@gmail.com", "ADMIN"));
        users.add(new User("Daymen", "daymenliu@gmail.com","USER"));
        users.add(new User("Angel","mentita@gmail.com", "USER"));
        model.addAttribute("users",users);
        return "if-unless";
    }

    @GetMapping("/switch-case")
    public String switchExample(Model model){
        User user = new User("Bryan","brillant16.gcv@gmail.com","ADMIN");
        model.addAttribute("user",user);
        return "switch-case";

    }

}
