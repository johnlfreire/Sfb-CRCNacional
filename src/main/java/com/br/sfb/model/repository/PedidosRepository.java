package com.br.sfb.model.repository;

import org.springframework.data.repository.CrudRepository;

import com.br.sfb.model.entities.Pedido;

public interface PedidosRepository extends CrudRepository<Pedido, Long> {

}
