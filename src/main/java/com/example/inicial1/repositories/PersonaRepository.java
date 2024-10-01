package com.example.inicial1.repositories;

import com.example.inicial1.entities.Persona;
import com.example.inicial1.entities.audit.Base;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PersonaRepository extends BaseRepository<Persona, Long> {

}