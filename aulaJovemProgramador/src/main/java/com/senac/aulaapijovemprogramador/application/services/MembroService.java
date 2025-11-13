package com.senac.aulaapijovemprogramador.application.services;

import com.senac.aulaapijovemprogramador.application.dto.membro.MembroRequestDTO;
import com.senac.aulaapijovemprogramador.application.dto.membro.MembroResponseDTO;
import com.senac.aulaapijovemprogramador.domain.entities.Membro;
import com.senac.aulaapijovemprogramador.domain.repository.MembroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MembroService {
    @Autowired
    private MembroRepository membroRepository;

    public MembroResponseDTO cadastrar(MembroRequestDTO membroRequestDTO){
        Membro membro = new Membro(membroRequestDTO);
        MembroResponseDTO membroResponseDTO = new MembroResponseDTO(membroRepository.save(membro));
        return membroResponseDTO;
    }
}
