package br.com.gerenciador.api.dto;

import br.com.gerenciador.api.model.Fornecedor;

import java.math.BigDecimal;

public record ProdutoResponseDTO(
        Long id,
        String nome,
        BigDecimal preco,
        String descricao,
        Integer quantidadeEstoque,
        FornecedorResponseDTO fornecedor
) {
}
