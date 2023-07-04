package br.com.fiap.soat.techChallenge.config;

import br.com.fiap.soat.techChallenge.core.ports.outbound.ClienteRepositoryPort;
import br.com.fiap.soat.techChallenge.core.ports.outbound.ProdutoRepositoryPort;
import br.com.fiap.soat.techChallenge.core.ports.outbound.PedidoRepositoryPort;

import br.com.fiap.soat.techChallenge.core.ports.inbound.CadastrarClienteUseCasePort;
import br.com.fiap.soat.techChallenge.core.ports.inbound.FazerPedidoUseCasePort;
import br.com.fiap.soat.techChallenge.core.ports.inbound.IdentificarClienteUseCasePort;
import br.com.fiap.soat.techChallenge.core.ports.inbound.ObterProdutosPorCategoriaUseCasePort;

import br.com.fiap.soat.techChallenge.core.usecases.*;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {

    @Bean
    public CadastrarClienteUseCasePort cadastrarClienteUseCasePort(ClienteRepositoryPort clienteRepositoryPort) {
        return new CadastrarClienteUseCase(clienteRepositoryPort);
    }

    @Bean
    public IdentificarClienteUseCasePort identificarClienteUseCasePort(ClienteRepositoryPort clienteRepositoryPort) {
        return new IdentificarClienteUseCase(clienteRepositoryPort);
    }

    @Bean
    public CadastrarProdutoUseCase cadastrarProdutoUseCasePort(ProdutoRepositoryPort produtoRepositoryPort) {
        return new CadastrarProdutoUseCase(produtoRepositoryPort);
    }

    @Bean
    public EditarProdutoUseCase editarProdutoUseCasePort(ProdutoRepositoryPort produtoRepositoryPort) {
        return new EditarProdutoUseCase(produtoRepositoryPort);
    }

    @Bean
    public ObterProdutosPorCategoriaUseCasePort identificarProdutoUseCasePort(ProdutoRepositoryPort produtoRepositoryPort) {
        return new ObterProdutosPorCategoriaUseCase(produtoRepositoryPort);
    }

    @Bean
    public FazerPedidoUseCasePort fazerPedidoUseCasePort(PedidoRepositoryPort pedidoRepositoryPort, ProdutoRepositoryPort produtoRepositoryPort) {
        return new FazerPedidoUseCase(pedidoRepositoryPort, produtoRepositoryPort);
    }
}
