// Historique des Interactions
package fr.sahelopportunity.Sahel.Opportunity.entity;

import jakarta.persistence.Entity;

@Entity
@Table(name = "Historique_Interactions")
public class HistoriqueInteraction {
    @Id
    private int id;
    @ManyToOne
    @JoinColumn(name="utilisateur_id", nullable=false)
    private Utilisateur utilisateur;
    private String historique_recherche;
    private String offres_consultees;
    private String actions;
    // getters and setters
}