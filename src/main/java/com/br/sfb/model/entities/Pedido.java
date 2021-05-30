package com.br.sfb.model.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;


@Entity
@Table(name = "pedido")
@Data
public class Pedido implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "numero_solicitacao")
	private long numeroSolicitacao;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "cartorio_id", referencedColumnName = "id")
	private Cartorio cartorio;
	@Column(name = "conjugue1")
	private String conjugue1;
	@Column(name = "conjugue2")
	private String conjugue2;
	@Column(name = "nome_registrado")
	private String nomeRegistrado;
	@Column(name = "genitor1")
	private String genitor1;
	@Column(name = "genitor2")
	private String genitor2;
	@Column(name = "numero_registro")
	private String numeroRegistro;
	@Column(name = "numero_folha")
	private String numeroFolha;
	@Column(name = "numero_livro")
	private String numeroLivro;	
	@Column(name = "observacao")
	private String Observacao;	
	@Enumerated(EnumType.STRING)
	private TipoRegistro tipoRegistro;
	@Column(name = "data_ocorrido")
	private Date dataOcorrido;
	@Column(name = "data_registro")
	private Date dataRegistro;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "certidao_id", referencedColumnName = "id")
	private Certidao certidao;
	
}