// Offres d'Emploi
package fr.sahelopportunity.Sahel.Opportunity.entity;

import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Offres_Emploi")
public class OffreEmploi {
    @Id
    private int id;
    private String titre;
    private String description;
    private String exigences;
    private String employeur;
    private String lieu;
    private String type_contrat;
    // getters and setters
}