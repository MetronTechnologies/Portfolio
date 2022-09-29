package com.metrontechnologies.myportfolio.Services;


import com.metrontechnologies.myportfolio.entities.Skill;
import com.metrontechnologies.myportfolio.repositories.SkillRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Collection;

@Service
@Transactional
@RequiredArgsConstructor
@Slf4j
public class SkillService {

    private final SkillRepository sRepo;

    public Skill saveSkill(Skill skill) {
        log.info("Saving skill with name {}", skill.getName());
        return sRepo.save(skill);
    }

    public Skill nameFinder(String name) {
        log.info("Retrieving skill with name {}", name);
        return sRepo.findByName(name);
    }

    public Collection<Skill> categoryFinder(String category) {
        log.info("Retrieving all skills in category -  {}", category);
        return sRepo.findByCategory(category);
    }

    public Collection<Skill> findAll() {
        log.info("Retrieving all skills");
        return sRepo.findAll();
    }

}
