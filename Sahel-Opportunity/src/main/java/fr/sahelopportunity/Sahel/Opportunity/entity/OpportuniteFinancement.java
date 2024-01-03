// Opportunités de Financement

package fr.sahelopportunity.Sahel.Opportunity.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "Opportunites_Financement")
public class OpportuniteFinancement {
    @Id
    private int id;
    private String nom;
    private String type;
    private BigDecimal montant;
    private String criteres_eligibilite;
    private String bailleurs_fonds;
    // getters and setters
}