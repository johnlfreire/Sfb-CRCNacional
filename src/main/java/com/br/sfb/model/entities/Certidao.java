package com.br.sfb.model.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;
@Entity
@Table(name = "certidao")
@Data
public class Certidao implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "data_solicitacao")
	private Date dataSolicitacao;
	@Column(name = "data_emissao")
	private Date dataEmissao;
	@Column(name = "data_impressao")
	private String dataImpressao;
	@Column(name = "status")
	private String status;
	@Column(name = "arquivo_assinado")
	private String arquivoAssinado;
	@Column(name = "arquivo_xml")
	private String arquivoXML;
	@Column(name = "numero_seloemissao")
	private String numeroSeloEmissao;
	@Column(name = "linha_valores_emissao")
	private String linhaValoresSeloEmissao;
	@Column(name = "codigo_seguranca_emissao")
	private String codigoSegurancaSeloEmissao;
	@Column(name = "selo_materializacao")
	private String seloMaterializacao;
	@Column(name = "codigo_seguranca_materializacao")
	private String codigoSegurancaSeloMaterializacao;
	@Column(name = "linha_valores_materializacao")
	private String linhaValoresSeloMaterializacao;
    @OneToOne(mappedBy = "certidao")
    private Pedido pedido;
	
}
