package com.senac.academia.application.dto.membro;

import java.time.LocalDate;

public record MembroRequestDTO(String nome, LocalDate dataMatricula) {
}
