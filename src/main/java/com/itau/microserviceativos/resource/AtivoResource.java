package com.itau.microserviceativos.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.itau.microserviceativos.model.Ativo;
import com.itau.microserviceativos.service.AtivoService;

@RestController
@RequestMapping(
		path = "/api/v1/ativos"
		)
public class AtivoResource {

	@Autowired
	private AtivoService ativoService;

	@RequestMapping(
	path="/consulta_nome",
	method = RequestMethod.GET,
	produces = MediaType.APPLICATION_JSON_VALUE
	)
	@CrossOrigin(origins = "http://localhost:4200") //Tirar
	public List<Ativo> consultar(@RequestParam("nome") String nome) {
		return this.ativoService.consultarPosicaoPorNome(nome);
	}

	@RequestMapping(
	path="/consulta_documento/{documento}",
	method = RequestMethod.GET,
	produces = MediaType.APPLICATION_JSON_VALUE
	)
	@CrossOrigin(origins = "http://localhost:4200") //Tirar
	public List<Ativo> consultarDocumento(@PathVariable("documento") Long documento) {
		return this.ativoService.consultarPosicaoPorDocumento(documento);
	}

	@RequestMapping(
	path="/consulta_nomecodigo",
	method = RequestMethod.GET,
	produces = MediaType.APPLICATION_JSON_VALUE
	)
	@CrossOrigin(origins = "http://localhost:4200") //Tirar
	public List<Ativo> consultarAtivoPorNome(@RequestParam("nome") String nomeCodigoAtivo) {
		System.out.println(nomeCodigoAtivo);
		return this.ativoService.consultarPosicaoPorNomeCodigo(nomeCodigoAtivo);
	}

	@RequestMapping(
	path="/consulta_nome_ativo",
	method = RequestMethod.GET,
	produces = MediaType.APPLICATION_JSON_VALUE
	)
	@CrossOrigin(origins = "http://localhost:4200") //Tirar
	public List<Ativo> consultarAtivoPorNomeAtivo(@RequestParam("nome") String nomeAtivo) {
		return this.ativoService.consultarPosicaoPorNomeAtivo(nomeAtivo);
	}

	@RequestMapping(
	path="/consulta_documento_codigo",
	method = RequestMethod.GET,
	produces = MediaType.APPLICATION_JSON_VALUE
	)
	
	@CrossOrigin(origins = "http://localhost:4200") //Tirar
	public List<Ativo> consultarAtivoPorDocumentoCodigo(@RequestParam("documento") String documentoCodigo) {
		return this.ativoService.consultarPosicaoPorDocumentoCodigo(documentoCodigo);
	}

	@RequestMapping(
	path="/consulta_documento_ativo",
	method = RequestMethod.GET,
	produces = MediaType.APPLICATION_JSON_VALUE
	)
	
	@CrossOrigin(origins = "http://localhost:4200") //Tirar
	public List<Ativo> consultarAtivoPorDocumentoAtivo(@RequestParam("documento") String documentoAtivo) {
		return this.ativoService.consultarPosicaoPorDocumentoAtivo(documentoAtivo);
	}	
	
}
