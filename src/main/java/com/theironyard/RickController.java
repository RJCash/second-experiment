package com.theironyard;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 * Created by rickiecashwell on 4/11/17.
 */
@Controller
public class RickController {

    @RequestMapping("/home")
    public String showtemp(Model model){
        model.addAttribute("random", Math.random());
        model.addAttribute("date", LocalDate.now());
        model.addAttribute("time", LocalTime.now());
        return "home";
    }
}
