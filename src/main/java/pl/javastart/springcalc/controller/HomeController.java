package pl.javastart.springcalc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

    @GetMapping("/index")
    public String home(){
        return "index";p
    }

    @PostMapping("/index")
    public String calc(
            @RequestParam( defaultValue = "0") int valueA,
            @RequestParam( defaultValue = "0") int valueB){
        int result = valueA+valueB;
        System.out.println(valueA+" + "+valueB+" = "+result);
        return "index";
    }
}
