package com.theironyard;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by rickiecashwell on 4/11/17.
 */
@Controller
public class rick2Contoller {

    @RequestMapping("/showgif")
    public String showHtml(Model model){
        return "showgif";
    }

}
