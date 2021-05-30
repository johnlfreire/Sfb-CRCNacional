package com.br.sfb.model.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "solicitante")
@Data
public class Solicitante implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name= "nome_solicitante")
	private String nomeSolicitante;
	@Column(name= "cpf")
	private String cpf;
	@Column(name= "cnpj")
	private String cnpj;
	@Column(name= "documento")
	private String documento;
	@Column(name= "tipo_solicitante")
	private TipoSolicitante tipoSolicitante;
	@Column(name= "telefone1")
	private String telefone1;
	@Column(name= "telefone2")
	private String telefone2;
	@Column(name= "email")
	private String email;
	@Column(name= "numero_processo")
	private String numeroProcesso;
	@Column(name= "vara")
	private String vara;
}