package com.formvalidationQ7;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import jakarta.validation.Valid;

@Controller
public class Studentcontroller {

    @GetMapping("/Spring4MVCFormValidationExample/")
    public String showForm(Model model) {
        model.addAttribute("student", new Studentbean());
        return "student-enrollment";
    }

    @PostMapping("/Spring4MVCFormValidationExample/")
    public String submitForm(@Valid @ModelAttribute("student") Studentbean student,
                             BindingResult result) {
        if (result.hasErrors()) {
            return "student-enrollment";
        }
        return "Student-sucess"; 
}
}