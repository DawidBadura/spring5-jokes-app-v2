package guru.springframework.spring5jokesappv2.controllers;

import guru.springframework.spring5jokesappv2.services.JokeSercvice;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokeController {

    private final JokeSercvice jokeSercvice;

    public JokeController(JokeSercvice jokeSercvice) {
        this.jokeSercvice = jokeSercvice;
    }

    @RequestMapping({"/", ""})
    public String showJoke(Model model){

        model.addAttribute("joke", jokeSercvice.getJoke());

        return "index";
    }
}
