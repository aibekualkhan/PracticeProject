package kz.iitu.ualkhan.practiceproject.controller;


import kz.iitu.ualkhan.practiceproject.model.Student;
import kz.iitu.ualkhan.practiceproject.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class StudentController {

    StudentService service;

    @Autowired
    public void setService(StudentService service) {
        this.service = service;
    }

    @GetMapping(path = "/")
    public String getAllStudents(Model model){
        return "home";
    }

    @GetMapping("/registration")
    public String registration(Model model){
        model.addAttribute("student", new Student());
        return "registration";
    }

    @PostMapping
    public String saveStudent(@ModelAttribute("student") Student student){
        service.saveStudent(student);
        return "redirect:/";
    }


}
