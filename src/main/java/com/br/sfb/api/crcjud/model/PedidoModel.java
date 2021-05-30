package com.br.sfb.api.crcjud.model;

import java.util.Date;

import com.br.sfb.model.entities.Cartorio;
import com.br.sfb.model.entities.Certidao;
import com.br.sfb.model.entities.TipoRegistro;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PedidoModel {
	private Long id;
	
	private long numeroSolicitacao;
	
	private Cartorio cartorio;
	
	private String conjugue1;
	
	private String conjugue2;
	
	private String nomeRegistrado;
	
	private String genitor1;
	
	private String genitor2;
	
	private String numeroRegistro;
	
	private String numeroFolha;
	
	private String numeroLivro;	
	
	private String Observacao;	
	
	private TipoRegistro tipoRegistro;
	
	private Date dataOcorrido;
	
	private Date dataRegistro;
	
	private Certidao certidao;
}
