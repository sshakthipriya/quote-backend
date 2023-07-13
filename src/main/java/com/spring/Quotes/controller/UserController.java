package com.spring.Quotes.controller;

import com.spring.Quotes.model.*;
import com.spring.Quotes.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/quotes")
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private MotivationalService motivationalService;

    @Autowired
    private WisdomService wisdomService;

    @Autowired
    private EmotionalService emotionalService;

    @Autowired
    private LifeService lifeService;

    @Autowired
    private WomenService womenService;


    @CrossOrigin
    @PostMapping("/add")
    public User saveUser(@RequestBody User theUser)
   {
       userService.saveUser(theUser);
       return theUser;
   }

   @CrossOrigin
   @GetMapping("/motivational")
    public List<Motivational> getMotivationalQuotes()
   {

       return motivationalService.getQuotes();
   }

    @CrossOrigin
    @GetMapping("/wisdom")
    public List<Wisdom> getWisdomQuotes()
    {

        return wisdomService.getQuotes();
    }

    @CrossOrigin
    @GetMapping("/emotional")
    public List<Emotional> getEmotionalQuotes()
    {

        return emotionalService.getQuotes();
    }

    @CrossOrigin
    @GetMapping("/life")
    public List<Life> getLifeQuotes()
    {

        return lifeService.getQuotes();
    }

    @CrossOrigin
    @GetMapping("/women")
    public List<Women> getWomenQuotes()
    {

        return womenService.getQuotes();
    }


}
