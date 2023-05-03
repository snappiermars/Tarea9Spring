package ico.fes.intro.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Principal {
    @GetMapping("/inicio")
    public String getInicio(Model model){
        model.addAttribute("nombre", "José");
        return "index";
    }

}
