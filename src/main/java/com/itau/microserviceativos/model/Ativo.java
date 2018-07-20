package com.itau.microserviceativos.model;

import java.math.BigInteger;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.querydsl.core.annotations.QueryEntity;

@QueryEntity
@Document(collection = "posicao")
public class Ativo {
	
	@Id
	private BigInteger id;
	
	private String nome;
	
	private Long documento;

	private String codigoAtivo;

	private String ativo;

	private Integer quantidade;
	
	private Double valor;

	private String nomeCodigoAtivo;

	private String nomeAtivo;

	private String documentoCodigoAtivo;

	private String documentoAtivo;

	public Ativo() {
		
	}

	public Ativo(BigInteger id, String nome, Long documento, String codigoAtivo, String ativo, Integer quantidade,
			Double valor, String nomeCodigoAtivo, String nomeAtivo, String documentoCodigoAtivo,
			String documentoAtivo) {
		super();
		this.id = id;
		this.nome = nome;
		this.documento = documento;
		this.codigoAtivo = codigoAtivo;
		this.ativo = ativo;
		this.quantidade = quantidade;
		this.valor = valor;
		this.nomeCodigoAtivo = nomeCodigoAtivo;
		this.nomeAtivo = nomeAtivo;
		this.documentoCodigoAtivo = documentoCodigoAtivo;
		this.documentoAtivo = documentoAtivo;
	}

	public BigInteger getId() {
		return id;
	}

	public void setId(BigInteger id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Long getDocumento() {
		return documento;
	}

	public void setDocumento(Long documento) {
		this.documento = documento;
	}

	public String getCodigoAtivo() {
		return codigoAtivo;
	}

	public void setCodigoAtivo(String codigoAtivo) {
		this.codigoAtivo = codigoAtivo;
	}

	public String getAtivo() {
		return ativo;
	}

	public void setAtivo(String ativo) {
		this.ativo = ativo;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public String getNomeCodigoAtivo() {
		return nomeCodigoAtivo;
	}

	public void setNomeCodigoAtivo(String nomeCodigoAtivo) {
		this.nomeCodigoAtivo = nomeCodigoAtivo;
	}

	public String getNomeAtivo() {
		return nomeAtivo;
	}

	public void setNomeAtivo(String nomeAtivo) {
		this.nomeAtivo = nomeAtivo;
	}

	public String getDocumentoCodigoAtivo() {
		return documentoCodigoAtivo;
	}

	public void setDocumentoCodigoAtivo(String documentoCodigoAtivo) {
		this.documentoCodigoAtivo = documentoCodigoAtivo;
	}

	public String getDocumentoAtivo() {
		return documentoAtivo;
	}

	public void setDocumentoAtivo(String documentoAtivo) {
		this.documentoAtivo = documentoAtivo;
	}


}
