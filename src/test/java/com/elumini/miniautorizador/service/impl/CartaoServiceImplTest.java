package com.elumini.miniautorizador.service.impl;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CartaoServiceImplTest {

    @Autowired
    CartaoServiceImplTest cartaoService;

    /*ProdutoItem produtoItem;
    FornecedorDTO fornecedor1;
    FornecedorDTO fornecedor2;

    @BeforeEach
    void setUp() {
        produtoItem = new ProdutoItem(new Produto(), BigDecimal.ONE);

        fornecedor1 = new FornecedorDTO("1", "fornecedor1");
        fornecedor2 = new FornecedorDTO("2", "fornecedor2");
    }

    @Test
    void deveLancarIllegalArgumentExceptionSeListaFornecedoresDTONulo() {
        assertThrows(IllegalArgumentException.class,
                () -> fornecedorService.definirMelhorFornecedor(null, null),
                "Nenhum fornecedor foi encontrado.");
    }

    @Test
    void deveLancarIllegalArgumentExceptionSeListaFornecedoresVazia() {
        assertThrows(IllegalArgumentException.class,
                () -> fornecedorService.definirMelhorFornecedor(new ArrayList<>(), null),
                "Nenhum fornecedor foi encontrado.");
    }

    @Test
    void deveLancarBusinessExceptionSeNaoEncontrarFornecedorParaItem() {
        PrecoDTO preco1 = new PrecoDTO(BigDecimal.ONE, BigDecimal.TEN);

        fornecedor1.setPrecos(List.of(preco1));
        fornecedor2.setPrecos(List.of(preco1));

        assertThrows(BusinessException.class,
                () -> fornecedorService.definirMelhorFornecedor(List.of(fornecedor1, fornecedor2), produtoItem),
                "Nenhum fornecedor foi encontrado.");
    }

    @Test
    void deveRetornarMelhorFornecedorEntreAsOpcoes() {
        PrecoDTO preco1 = new PrecoDTO(new BigDecimal("10"), BigDecimal.ONE);
        PrecoDTO preco2 = new PrecoDTO(new BigDecimal("8"), BigDecimal.TEN);
        fornecedor1.setPrecos(List.of(preco1, preco2));

        PrecoDTO preco3 = new PrecoDTO(new BigDecimal("9"), BigDecimal.ONE);
        PrecoDTO preco4 = new PrecoDTO(new BigDecimal("8.5"), BigDecimal.TEN);
        fornecedor2.setPrecos(List.of(preco3, preco4));

        var melhorFornecedor = fornecedorService.definirMelhorFornecedor(List.of(fornecedor1,
                fornecedor2), produtoItem);

        assertEquals("2", melhorFornecedor.getCnpj());
        assertEquals("fornecedor2", melhorFornecedor.getNome());

        produtoItem = new ProdutoItem(new Produto(), BigDecimal.TEN);

        melhorFornecedor = fornecedorService.definirMelhorFornecedor(List.of(fornecedor1,
                fornecedor2), produtoItem);

        assertEquals("1", melhorFornecedor.getCnpj());
        assertEquals("fornecedor1", melhorFornecedor.getNome());
    }*/

}
