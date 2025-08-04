package com.formvalidation10;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import jakarta.validation.Valid;

@Controller
@RequestMapping("cust")
public class CustomerController {
    @GetMapping("/save.do")
    public String showForm(Model model) {
        model.addAttribute("customer", new Customerbean());
        return "customer-form";
    }
    @PostMapping("/save.do")
    public String saveCustomer(@Valid @ModelAttribute("customer") 
    							Customerbean customer,
                               BindingResult result) {
        if (result.hasErrors()) {
            return "customer-form";
        }
        return "customer-success";
    }
}
