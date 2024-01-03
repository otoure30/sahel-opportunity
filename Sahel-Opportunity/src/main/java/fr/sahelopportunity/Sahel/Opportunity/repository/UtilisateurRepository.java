// UtilisateurRepository

package fr.sahelopportunity.Sahel.Opportunity.repository;

import fr.sahelopportunity.Sahel.Opportunity.entity.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UtilisateurRepository extends JpaRepository<Utilisateur, Integer> {
}