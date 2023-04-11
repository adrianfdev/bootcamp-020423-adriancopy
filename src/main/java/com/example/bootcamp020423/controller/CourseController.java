package com.example.bootcamp020423.controller;

import com.example.bootcamp020423.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("courses")
public class CourseController {

    private CourseRepository repository;

    public CourseController(CourseRepository repo) {
        this.repository = repo;
    }

    @GetMapping
    public String getCourses(Model model) {
        model.addAttribute("message", "Here's my lovely message from the CourseController");
        model.addAttribute("courses", repository.getCourses());
        return "courses";
    }






        @PostMapping
        public String searchForCourses(Model model, String searchTerm) {
           System.out.println(searchTerm);
            model.addAttribute("courses", repository.findByKeyword(searchTerm));
            model.addAttribute("searchTerm", searchTerm);
            return "courses";


    }
}
