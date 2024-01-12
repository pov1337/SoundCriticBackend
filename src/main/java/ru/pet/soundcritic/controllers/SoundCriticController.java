package ru.pet.soundcritic.controllers;


import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Component
@Controller
public class SoundCriticController {

    @GetMapping("/hello")
    public void printer(){
        System.out.println("КАЛЛЛ ");
    }
}
