package br.com.fiap.soat.techChallenge.domain.ports.inbound;

import br.com.fiap.soat.techChallenge.entities.Produto;

public interface EditarProdutoUseCasePort {
    Produto execute(Produto produto);
}