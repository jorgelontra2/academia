package com.senac.aulaapijovemprogramador.application.dto.membro;

import com.senac.aulaapijovemprogramador.domain.entities.Membro;
import com.senac.aulaapijovemprogramador.domain.valueobjects.StatusPlano;

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
