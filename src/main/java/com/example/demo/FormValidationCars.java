package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class FormValidationCars {
    @GetMapping("/DetailsForm")
    public String loadDetailsForm(Model model){
        model.addAttribute("car", new Car());
        return "DetailsForm";
    }
    @PostMapping("/DetailsForm")
    public String processDetailsForm(@Valid Car car, BindingResult result){
        if (result.hasErrors()) {
            return "DetailsForm";
        }
        return "ConfirmForm";
    }
}
