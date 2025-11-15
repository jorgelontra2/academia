package com.senac.academia.domain.exceptions;

public class MembroNaoEncontradoException extends EntidadeNaoEncontradaException{

    public MembroNaoEncontradoException(String mensagem) {
        super(mensagem);
    }
    public MembroNaoEncontradoException(Long id) {
        this(String.format("não existe um membro com este codigo %d", id));
    }
}
