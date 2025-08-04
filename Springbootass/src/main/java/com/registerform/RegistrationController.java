package com.registerform;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
public class RegistrationController {
    @GetMapping("/SpringMvcFormExample/register")
    public String showForm() {
        return "registration";
    }
    @PostMapping("/SpringMvcFormExample/register")
    @ResponseBody
    public String handleForm(
            @RequestParam 
            String username,
            @RequestParam 
            String password,
            @RequestParam 
            String email,
            @RequestParam 
            String birthday,
            @RequestParam 
            String profession) {
        return "<h2>Registration Successful!</h2>"+
                "<p><b>User Name:</b>"+username+"</p>"+
                "<p><b>Password:</b>"+password +"</p>"+
                "<p><b>Email:</b>"+email+"</p>"+
                "<p><b>Birthday:</b>"+birthday +"</p>"+
                "<p><b>Profession:</b>"+profession+"</p>";
    }
}
