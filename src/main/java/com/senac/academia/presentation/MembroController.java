package com.senac.academia.presentation;

import com.senac.academia.application.dto.membro.MembroRequestDTO;
import com.senac.academia.application.dto.membro.MembroResponseDTO;
import com.senac.academia.application.services.MembroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
    @GetMapping("/{id}")
    public ResponseEntity<MembroResponseDTO> consultarPorId(Long id){
        MembroResponseDTO membroResponseDTO = membroService.consultarPorId(id);
        return ResponseEntity.ok(membroResponseDTO);
    }
    @GetMapping
    public ResponseEntity<List<MembroResponseDTO>> listarTodos(){
        List<MembroResponseDTO> membros = membroService.listarTodos();
        return ResponseEntity.ok(membros);
    }
    @PutMapping("/{id}")
    public ResponseEntity<MembroResponseDTO> congelarMatriculaMembro(@PathVariable Long id){
        MembroResponseDTO membroResponseDTO = membroService.congelarMatriculaMembro(id);
        return ResponseEntity.ok(membroResponseDTO);
    }
}
