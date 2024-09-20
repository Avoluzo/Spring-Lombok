package com.example.projetoescola.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.projetoescola.models.Curso;

@Repository
public interface CursoRepository extends JpaRepository<Curso, Long> {

    

}
