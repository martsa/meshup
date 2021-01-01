package project01.meshup.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProductController {

    @RequestMapping("/products")
    public String getIndex(){
        return "products";   // thymeleave template is going to find a file called index.html in the templates folder


    }
}