package project01.meshup.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class indexController {

    @RequestMapping("/")

    public String getIndex(){
        return "index";   // thymeleave template is going to find a file called index.html in the templates folder

    }
}
