package com.br.sfb.model.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.sfb.model.entities.Pedido;
import com.br.sfb.model.repository.PedidosRepository;

@Service
public class PedidoService {
@Autowired
private PedidosRepository pedidoRepository;
	public void solicitarCertidao(Pedido pedido) {
				
	}
	
}
