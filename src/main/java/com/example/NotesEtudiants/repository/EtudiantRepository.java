package com.example.NotesEtudiants.repository;

import com.example.NotesEtudiants.entity.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EtudiantRepository extends JpaRepository<Etudiant, Long> {
}
