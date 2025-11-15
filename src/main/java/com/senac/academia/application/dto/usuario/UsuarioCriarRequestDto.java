package com.senac.academia.application.dto.usuario;


public record UsuarioCriarRequestDto (String nome, String email, String senha, String cpf, boolean isAdm){
}
