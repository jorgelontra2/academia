package com.senac.academia.application.dto.usuario;

import com.senac.academia.domain.entities.Usuario;

public record UsuarioLogadoDto(Long id, String email) {
    public UsuarioLogadoDto(Usuario usuario) {

        this(
                usuario.getId(),
                usuario.getEmail()
        );

    }
}
