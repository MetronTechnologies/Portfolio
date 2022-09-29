package com.metrontechnologies.myportfolio.repositories;

import com.metrontechnologies.myportfolio.entities.Skill;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Collection;

public interface SkillRepository extends JpaRepository<Skill, Long> {

    Skill findByName(String name);

    Collection<Skill> findByCategory(String category);

}
