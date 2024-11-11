// NoteRepository.java
package com.example.NotesEtudiants.repository;

import com.example.NotesEtudiants.entity.Note;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NoteRepository extends JpaRepository<Note, Long> {
}