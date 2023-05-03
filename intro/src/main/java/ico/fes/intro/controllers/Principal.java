package ico.fes.intro.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Principal {
    @GetMapping("/inicio")
    public String getInicio(){
        return "index";
    }

}
