package com.senac.aulaapijovemprogramador.domain.repository;


import com.senac.aulaapijovemprogramador.domain.entities.Membro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MembroRepository extends JpaRepository<Membro,Long> {
}
