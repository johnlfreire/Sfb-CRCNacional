package com.br.sfb.model.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "cartorio")
public class Cartorio implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String cnj;
    @Column
    private String cartorio;
    @Column
    private String oficial;
    @Column
    private String endereco;
    @Column
    private String distrito;
    @Column
    private String comarca;
    @Column
    private String cep;
    @Column
    private String cidade;
    @Column
    private String uf;
    @Column
    private String regional;
    @Column
    private String telefone;
    @Column
    private String celular;
    @Column
    private String email;
    @Column
    private String funcionamento;
    @Column
    private String seade;
    @Column
    private String acervo;
    @Column
    private String substituto;
    @Column
    private String rgDoOficial;
    @Column
    private String cpfDoOficial;
    @Column
    private String cnpj;
    @Column
    private String nomeAntigo;
    @Column
    private Date dataNascimento;
    @Column
    private Date anoDeIstalacao;
    @Column
    private Date datadeTitularidade;
    @Column
    private Date certidaoDeNascimento;
    @Column
    private Date certidaoDeCasamento;
    @Column
    private Date certidaoDeObito;
    @Column
    private Date atualizacao;
    @OneToMany(mappedBy="cartorio")
    private Set<Pedido> pedidos;
	
}