package com.senac.aulaapijovemprogramador.application.dto.usuario;


import java.util.List;

public record UsuarioCriarRequestDto (String nome, String email, String senha, String cpf, boolean isAdm){
}
