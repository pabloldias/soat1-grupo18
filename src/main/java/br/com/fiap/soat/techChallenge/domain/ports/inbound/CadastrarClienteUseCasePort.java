package br.com.fiap.soat.techChallenge.domain.ports.inbound;

import br.com.fiap.soat.techChallenge.entities.Cliente;

public interface CadastrarClienteUseCasePort {
    Cliente execute(Cliente cliente);
}