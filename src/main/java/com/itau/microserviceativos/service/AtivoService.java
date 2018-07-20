package com.itau.microserviceativos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itau.microserviceativos.dao.AtivoDao;
import com.itau.microserviceativos.model.Ativo;

@Service
public class AtivoService {
	
	@Autowired
	private AtivoDao ativoDao;
	
	public List<Ativo> consultarPosicaoPorNome(String nome) {
		return this.ativoDao.findAtivoByNome(nome);
	}

	public List<Ativo> consultarPosicaoPorDocumento(Long documento) {
		return this.ativoDao.findByDocumento(documento);
	}

	public List<Ativo> consultarPosicaoPorAtivo(String ativo) {
		return this.ativoDao.findByAtivo(ativo);
	}

	public List<Ativo> consultarPosicaoPorNomeCodigo(String nomeCodigoAtivo) {
		return this.ativoDao.findByNomeCodigoAtivo(nomeCodigoAtivo);
	}
	
	public List<Ativo> consultarPosicaoPorNomeAtivo(String nomeAtivo) {
		return this.ativoDao.findByNomeAtivo(nomeAtivo);
	}

	public List<Ativo> consultarPosicaoPorDocumentoCodigo(String documentoCodigo) {
		return this.ativoDao.findByDocumentoCodigo(documentoCodigo);
	}

	public List<Ativo> consultarPosicaoPorDocumentoAtivo(String documentoAtivo) {
		return this.ativoDao.findByDocumentoAtivo(documentoAtivo);
	}

}
