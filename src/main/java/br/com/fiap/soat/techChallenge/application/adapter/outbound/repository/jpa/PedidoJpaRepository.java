package br.com.fiap.soat.techChallenge.application.adapter.outbound.repository.jpa;

import br.com.fiap.soat.techChallenge.application.adapter.outbound.repository.jpa.entity.PedidoEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface PedidoJpaRepository extends CrudRepository<PedidoEntity, UUID> {
}
