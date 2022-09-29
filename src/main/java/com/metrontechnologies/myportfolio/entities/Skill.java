package com.metrontechnologies.myportfolio.entities;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;

import java.util.ArrayList;

import static javax.persistence.GenerationType.AUTO;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Skill {

    @Id
    @GeneratedValue(strategy = AUTO)
    private Long id;

    private String name;

    private String smallImageUrl;

    private String bigImageUrl;

    private String category;

    @Lob
    private ArrayList<String> description;

}
