package com.itau.microserviceativos.dao;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.itau.microserviceativos.model.Ativo;

@Repository
public interface AtivoDao extends MongoRepository<Ativo, Long> {

    @Query("{ 'nome' : ?0 }")
    List<Ativo> findAtivoByNome(String nome);

    List<Ativo> findByDocumento(Long documento);
    
    @Query("{ 'ativo' : ?0 }")
    List<Ativo> findByAtivo(String ativo);
    
    @Query("{ 'nomeCodigoAtivo' : ?0 }")
    List<Ativo> findByNomeCodigoAtivo(String nomeCodigoAtivo); 

    @Query("{ 'nomeAtivo' : ?0 }")
    List<Ativo> findByNomeAtivo(String nomeAtivo); 

    @Query("{ 'documentoCodigoAtivo' : ?0 }")
    List<Ativo> findByDocumentoCodigo(String documentoCodigo); 

    @Query("{ 'documentoAtivo' : ?0 }")
    List<Ativo> findByDocumentoAtivo(String documentoAtivo); 

}
