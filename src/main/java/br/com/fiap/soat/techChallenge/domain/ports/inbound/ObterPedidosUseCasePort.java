package br.com.fiap.soat.techChallenge.domain.ports.inbound;

import br.com.fiap.soat.techChallenge.domain.entity.Pedido;

import java.util.List;

public interface ObterPedidosUseCasePort {
    List<Pedido> execute();
}
