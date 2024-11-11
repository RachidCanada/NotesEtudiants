// MatiereRepository.java
package com.example.NotesEtudiants.repository;

import com.example.NotesEtudiants.entity.Matiere;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MatiereRepository extends JpaRepository<Matiere, Long> {
}