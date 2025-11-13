package com.senac.aulaapijovemprogramador.domain.entities;

import com.senac.aulaapijovemprogramador.application.dto.membro.MembroRequestDTO;
import com.senac.aulaapijovemprogramador.domain.valueobjects.StatusPlano;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Membro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private LocalDate dataMatricula;
    private StatusPlano StatusPlano;

    public Membro(MembroRequestDTO membroRequestDTO){
        this.nome = membroRequestDTO.nome();
        this.dataMatricula = membroRequestDTO.dataMatricula();
        this.StatusPlano = membroRequestDTO.StatusPlano();
    }
}
