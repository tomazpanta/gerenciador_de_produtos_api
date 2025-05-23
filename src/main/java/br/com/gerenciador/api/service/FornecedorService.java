package br.com.gerenciador.api.service;

import br.com.gerenciador.api.dto.FornecedorResponseDTO;
import br.com.gerenciador.api.dto.FornecedorRequestDTO;

import java.util.List;

public interface FornecedorService {

    FornecedorResponseDTO criarFornecedor(FornecedorRequestDTO dto);
    List<FornecedorResponseDTO> listarTodosFornecedores();
    FornecedorResponseDTO buscarFornecedorPeloId(Long id);
    FornecedorResponseDTO atualizarFornecedorPeloId(Long id, FornecedorRequestDTO dto);
    void deletarFornecedorPeloId (Long id);
}
