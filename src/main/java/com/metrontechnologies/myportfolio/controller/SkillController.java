package com.metrontechnologies.myportfolio.controller;


import com.metrontechnologies.myportfolio.Services.SkillService;
import com.metrontechnologies.myportfolio.entities.Skill;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/mt/skill")
@RequiredArgsConstructor
public class SkillController {

    private final SkillService skillService;

    @PostMapping(value = "/saveSkill",  produces = {"application/json"})
    public @ResponseBody Skill save (@RequestBody Skill skill) {
        return skillService.saveSkill(skill);
    }

    @GetMapping(value = "/getAllSkills")
    public @ResponseBody Collection<Skill> getAllSkills() {
        return skillService.findAll();
    }

    @GetMapping(value = "/getSkillByName/{name}", produces = {"application/json"})
    public @ResponseBody Skill getSkillByName(@PathVariable("name") String name) {
        return skillService.nameFinder(name);
    }

    @GetMapping(value = "/getSkillsByCategory/{category}", produces = {"application/json"})
    public @ResponseBody Collection<Skill> getSkillsByCategory(@PathVariable("category") String category) {
        return skillService.categoryFinder(category);
    }

    @GetMapping
    public @ResponseBody String trial() {
        return "This goes well";
    }


}


