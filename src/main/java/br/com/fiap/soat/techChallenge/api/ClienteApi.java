package br.com.fiap.soat.techChallenge.api;

import br.com.fiap.soat.techChallenge.controllers.ClienteController;
import br.com.fiap.soat.techChallenge.responses.ClienteResponse;
import br.com.fiap.soat.techChallenge.api.requests.CadastrarClienteRequest;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/clientes")
public class ClienteApi {

    private final ClienteController clienteController;

    public ClienteApi(ClienteController clienteController) {
        this.clienteController = clienteController;
    }

    @GetMapping("/{cpf}")
    public ResponseEntity<ClienteResponse> identificarCliente(@PathVariable String cpf) {
        return ResponseEntity.ok(this.clienteController.identificarCliente(cpf));
    }

    @PostMapping("")
    public ResponseEntity<ClienteResponse> cadastrarCliente(@Valid @RequestBody CadastrarClienteRequest cadastrarClienteRequest) {
        return ResponseEntity.ok(this.clienteController.cadastrarCliente(cadastrarClienteRequest.toDomain()));
    }
}
