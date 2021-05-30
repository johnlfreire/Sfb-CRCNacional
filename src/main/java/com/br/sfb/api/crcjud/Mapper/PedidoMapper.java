package com.br.sfb.api.crcjud.Mapper;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import com.br.sfb.api.crcjud.model.PedidoModel;
import com.br.sfb.model.entities.Pedido;

import lombok.AllArgsConstructor;



@AllArgsConstructor
@Component
public class PedidoMapper {

private ModelMapper modelMapper;
	
	public PedidoModel toModel(Pedido pedido) {
		return modelMapper.map(pedido, PedidoModel.class);
	}
	
	public List<PedidoModel> toCollectionModel(List<Pedido> pedidos) {
		return pedidos.stream()
				.map(this::toModel)
				.collect(Collectors.toList());
	}
	
	public Pedido toEntity(PedidoModel pedidoModel) {
		return modelMapper.map(pedidoModel, Pedido.class);
	}
	
}
