package br.com.gerenciador.api.service;

import br.com.gerenciador.api.dto.ClienteResponseDTO;
import br.com.gerenciador.api.dto.ClienteRequestDTO;

import java.util.List;

public interface ClienteService {

    ClienteResponseDTO criarCliente(ClienteRequestDTO dto);
    List<ClienteResponseDTO> listarTodosClientes();
    ClienteResponseDTO buscarClientePeloId(Long id);
    ClienteResponseDTO atualizarClientePeloId(Long id, ClienteRequestDTO dto);
    void deletarClientePeloId(Long id);
}