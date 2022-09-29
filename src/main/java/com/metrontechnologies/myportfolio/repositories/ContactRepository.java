package com.metrontechnologies.myportfolio.repositories;

import com.metrontechnologies.myportfolio.entities.Contact;
import com.metrontechnologies.myportfolio.entities.Skill;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Collection;

public interface ContactRepository extends JpaRepository<Contact, Long> {



}
