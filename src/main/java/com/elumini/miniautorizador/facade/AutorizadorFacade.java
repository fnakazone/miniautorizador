package com.elumini.miniautorizador.facade;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.elumini.miniautorizador.model.Cartao;
import com.elumini.miniautorizador.service.CartaoService;
import com.elumini.miniautorizador.service.TransacaoService;

import jakarta.transaction.Transactional;


@Component
public class AutorizadorFacade {
  
  private CartaoService cartaoService;
  private TransacaoService transacaoService;
  
  @Autowired
  public AutorizadorFacade(CartaoService cartaoService, TransacaoService transacaoService) {
    this.cartaoService = cartaoService;
    this.transacaoService = transacaoService;
  }
  
  @Transactional
  public Cartao criarCartao(Cartao cartao) {
	  
	cartaoService.criarCartao(cartao);
	  
   /* produtosDTO = produtoService.filtrarProdutosForm(produtosDTO);
    List<ProdutoItem> produtosItens = produtoService.carregarProdutosItens(produtosDTO);
  
    produtosItens.forEach(produtoItem -> {
      List<FornecedorDTO> fornecedores = fornecedorService.recuperarFornecedoresPorProduto(produtoItem.getGtin());
      produtoItem.setFornecedorItem(fornecedorService.definirMelhorFornecedor(fornecedores, produtoItem));
    });
  
    var pedidosAgrupados = pedidoService.agruparPedidos(produtosItens);
    var pedidos = new ArrayList<Pedido>();
    
    pedidosAgrupados.forEach((fornecedor,pedidoItens) -> {
      var forn = fornecedorService.salvarSeNãoExiste(fornecedor);
      pedidos.add(pedidoService.salvarPedido(forn, pedidoItens));
    });*/
  
    return cartao;
  }

}
