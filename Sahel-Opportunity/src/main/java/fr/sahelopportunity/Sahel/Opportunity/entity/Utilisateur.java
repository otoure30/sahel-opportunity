// Utilisateurs
package fr.sahelopportunity.Sahel.Opportunity.entity;

@Entity
@Table(name = "Utilisateurs")
public class Utilisateur {
    @Id
    private int id;
    private String nom;
    private String email;
    private String mot_de_passe;
    private String experience_professionnelle;
    private String education;
    private String competences;
    private String preferences;
    private String historique_recherche;

    public String getExperience_professionnelle() {
        return experience_professionnelle;
    }

    public void setExperience_professionnelle(String experience_professionnelle) {
        this.experience_professionnelle = experience_professionnelle;
    }
    // getters and setters
}