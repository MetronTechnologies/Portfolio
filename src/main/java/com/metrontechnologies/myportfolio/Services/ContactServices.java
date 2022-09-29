package com.metrontechnologies.myportfolio.Services;


import com.metrontechnologies.myportfolio.entities.Contact;
import com.metrontechnologies.myportfolio.repositories.ContactRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
@RequiredArgsConstructor
@Slf4j
public class ContactServices {
    private final ContactRepository cRepo;

    public Contact saveContact(Contact contact) {
        log.info("Saving contact from {}", contact.getEmail());
        return cRepo.save(contact);
    }



}
