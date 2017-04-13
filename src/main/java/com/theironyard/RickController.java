package com.theironyard;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

/**
 * Created by rickiecashwell on 4/11/17.
 */
@Controller
public class RickController {
    @Autowired
    AnimalRepository repo;

    @RequestMapping("/")
    public String showtemp(Model model){
        model.addAttribute("random", Math.random());
        model.addAttribute("date", LocalDate.now());
        model.addAttribute("time", LocalTime.now());
        return "home";
    }
    @RequestMapping("/AnimalList/{name}")
    public String animals(Model model, String name){
        Animal animal = repo.findAnimalByName(name);
        model.addAttribute("animal",animal.getName());
        return "AnimalList";
    }
    @RequestMapping("/AnimalList.html")
    public String getList(Model model){
        List<Animal> animals = repo.getAnimals();
        model.addAttribute("animals", animals);
        return "AnimalList";
    }
    @RequestMapping("/showgif.html")
    public String showGIF(Model model){
        return "showgif";
    }
}
