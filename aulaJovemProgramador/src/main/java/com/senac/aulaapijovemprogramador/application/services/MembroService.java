package com.senac.aulaapijovemprogramador.application.services;

import com.senac.aulaapijovemprogramador.application.dto.membro.MembroRequestDTO;
import com.senac.aulaapijovemprogramador.application.dto.membro.MembroResponseDTO;
import com.senac.aulaapijovemprogramador.domain.entities.Membro;
import com.senac.aulaapijovemprogramador.domain.repository.MembroRepository;
import com.senac.aulaapijovemprogramador.domain.valueobjects.StatusPlano;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MembroService {
    @Autowired
    private MembroRepository membroRepository;

    public MembroResponseDTO cadastrar(MembroRequestDTO membroRequestDTO){
        Membro membro = new Membro(membroRequestDTO);
        if (membro.getStatusPlano().equals(StatusPlano.INATIVO)){
            throw new RuntimeException("Membro Inativo não pode ser cadastrado");
        }
        MembroResponseDTO membroResponseDTO = new MembroResponseDTO(membroRepository.save(membro));
        return membroResponseDTO;
    }

    public MembroResponseDTO consultarPorId(Long id){
        Membro membro = membroRepository.findById(id).orElseThrow(() -> new RuntimeException("Membro não cadastrado"));
        return new MembroResponseDTO(membro);
    }

    public List<MembroResponseDTO> listarTodos(){
        List<Membro> membros = membroRepository.findAllByStatusPlano(StatusPlano.ATIVO);
        return membros.stream().map(MembroResponseDTO::new).toList();
    }

    public MembroResponseDTO congelarMatriculaMembro(Long id){
        Membro membro = membroRepository.findById(id).orElseThrow(() -> new RuntimeException("Membro não cadastrado"));
        membro.setStatusPlano(StatusPlano.INATIVO);
        membro = membroRepository.save(membro);
        return new MembroResponseDTO(membro);
    }
}
