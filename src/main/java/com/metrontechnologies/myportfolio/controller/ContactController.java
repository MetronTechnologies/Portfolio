package com.metrontechnologies.myportfolio.controller;


import com.metrontechnologies.myportfolio.Services.ContactServices;
import com.metrontechnologies.myportfolio.entities.Contact;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/mt/contact")
@AllArgsConstructor
public class ContactController {

    private final ContactServices contactServices;

    @PostMapping(value = "/saveContact",  produces = {"application/json"})
    public @ResponseBody Contact save (@RequestBody Contact contact) {
        return contactServices.saveContact(contact);
    }

}


