package com.br.sfb.api.crcjud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ResponseBody;

import com.br.sfb.api.crcjud.mapper.PedidoMapper;
import com.br.sfb.api.crcjud.model.PedidoModel;
import com.br.sfb.model.services.PedidoService;

@ResponseBody
public class PedidoController {
	
@Autowired
private PedidoService pedidoService;
@Autowired
private PedidoMapper pedidoMapper;

public void solicitarCertidao(PedidoModel pedido){
	pedidoService.solicitarCertidao(pedidoMapper.toEntity(pedido));
	
}	
public void pesquisarPedidos()
{
	
}
public void consultarPedido(){
	
}

}
