package com.senac.aulaapijovemprogramador.application.dto.membro;

import com.senac.aulaapijovemprogramador.domain.valueobjects.StatusPlano;

import java.time.LocalDate;

public record MembroRequestDTO(String nome, LocalDate dataMatricula) {
}
