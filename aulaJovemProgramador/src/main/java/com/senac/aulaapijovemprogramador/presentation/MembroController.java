package com.senac.aulaapijovemprogramador.presentation;

import com.senac.aulaapijovemprogramador.application.dto.membro.MembroRequestDTO;
import com.senac.aulaapijovemprogramador.application.dto.membro.MembroResponseDTO;
import com.senac.aulaapijovemprogramador.application.services.MembroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/membro")
public class MembroController {
    @Autowired
    private MembroService membroService;

    @PostMapping
    public ResponseEntity<MembroResponseDTO> cadastrar(MembroRequestDTO membroRequestDTO){
        MembroResponseDTO membroResponseDTO = membroService.cadastrar(membroRequestDTO);
        return ResponseEntity.ok(membroResponseDTO);
    }
}
