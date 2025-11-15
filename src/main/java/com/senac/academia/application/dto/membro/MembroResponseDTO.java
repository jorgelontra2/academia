package com.senac.academia.application.dto.membro;

import com.senac.academia.domain.entities.Membro;
import com.senac.academia.domain.valueobjects.StatusPlano;

import java.time.LocalDate;

public record MembroResponseDTO(String nome, LocalDate dataMatricula, StatusPlano StatusPlano) {
    public MembroResponseDTO(Membro membro){
        this(
                membro.getNome(),
                membro.getDataMatricula(),
                membro.getStatusPlano()
        );
    }
}
