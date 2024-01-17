package ru.pet.soundcritic.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import ru.pet.soundcritic.entities.User;
import ru.pet.soundcritic.services.UserService;

import java.security.Principal;

@Component
@Controller
public class SoundCriticController {

    private UserService userService;

    @Autowired
    public SoundCriticController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/hello")
    public void printer(){
        System.out.println("КАЛЛЛ ");
    }


    @GetMapping("/only_for_admins")
    @ResponseBody
    public String onlyForAdmins(Principal principal){
        User user = userService.findByUsername(principal.getName());
        return "hello, your email: " + user.getEmail();
    }
}
