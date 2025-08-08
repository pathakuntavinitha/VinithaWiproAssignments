package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.entity.Client;
import com.service.ClientService;

@Controller
public class ClientController {

    private final ClientService service;

    public ClientController(ClientService service) {
        this.service = service;
    }

    @GetMapping("/")
    public String viewHomePage(Model model) {
        model.addAttribute("listClients", service.listAll());
        return "index";
    }

    @GetMapping("/new")
    public String showNewClientForm(Model model) {
        model.addAttribute("client", new Client());
        return "new_client";
    }

    @PostMapping("/save")
    public String saveClient(@ModelAttribute("client") Client client) {
        service.save(client);
        return "redirect:/";
    }

    @PostMapping("/update")
    public String updateClient(@ModelAttribute("client") Client client) {
        service.save(client); // this will update if id is not null
        return "redirect:/";
    }

    @GetMapping("/edit/{id}")
    public String showEditForm(@PathVariable Long id, Model model) {
        model.addAttribute("client", service.get(id));
        return "edit_client";
    }

    @GetMapping("/delete/{id}")
    public String deleteClient(@PathVariable Long id) {
        service.delete(id);
        return "redirect:/";
    }
}
