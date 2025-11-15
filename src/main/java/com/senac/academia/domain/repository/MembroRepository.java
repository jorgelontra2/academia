package com.senac.academia.domain.repository;


import com.senac.academia.domain.entities.Membro;
import com.senac.academia.domain.valueobjects.StatusPlano;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MembroRepository extends JpaRepository<Membro,Long> {

    List<Membro> findAllByStatusPlano(StatusPlano status);
}
