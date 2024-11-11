package com.example.NotesEtudiants.service;

import com.example.NotesEtudiants.entity.Matiere;
import com.example.NotesEtudiants.repository.MatiereRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MatiereService {
    private final MatiereRepository matiereRepository;

    public MatiereService(MatiereRepository matiereRepository) {
        this.matiereRepository = matiereRepository;
    }

    public List<Matiere> getAllMatieres() {
        return matiereRepository.findAll();
    }

    public Matiere saveMatiere(Matiere matiere) {
        return matiereRepository.save(matiere);
    }

    public void deleteMatiere(Long id) {
        matiereRepository.deleteById(id);
    }
}