package br.com.alura.mudii.Controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class loginController {

    @RequestMapping("/login")
    @GetMapping
    public String login(){
        return "login";
    }

}
