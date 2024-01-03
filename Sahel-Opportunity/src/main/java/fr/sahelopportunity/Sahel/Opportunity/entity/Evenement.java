package fr.sahelopportunity.Sahel.Opportunity.entity;

import jakarta.persistence.Entity;

// Evenements
@Entity
@Table(name = "Evenements")
public class Evenement {
    @Id
    private int id;
    private String nom;
    private Date date;
    private String lieu;
    private String description;
    // getters and setters
}