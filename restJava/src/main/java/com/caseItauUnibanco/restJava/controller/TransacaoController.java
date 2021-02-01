package com.caseItauUnibanco.restJava.controller;

import java.util.Collections;
import java.util.List;
import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import com.caseItauUnibanco.restJava.model.Transacao;
import com.caseItauUnibanco.restJava.serviceImpl.TransacaoServiceImpl;

@RestController
public class TransacaoController {
	
	
	
	@Autowired
	 private TransacaoServiceImpl transacaoService;
	@RequestMapping(value = "/transacao", method = RequestMethod.GET)
	 public List<Transacao> getAllTransacoes(){
	  return transacaoService.getAllTransacoes();
	 }
	
	 @RequestMapping(value = "/transacao", method = RequestMethod.POST,consumes = {MediaType.APPLICATION_JSON_VALUE},
		        													produces = {MediaType.APPLICATION_JSON_VALUE})
	 
	 public ResponseEntity<Void> addTransacao(@RequestBody Transacao newTransacao, UriComponentsBuilder builder){
		 Transacao transacao = transacaoService.addTransacao(newTransacao);
		 HttpHeaders headers = new HttpHeaders();
	  
	if(transacao.getValor() < 0) {
		  return new ResponseEntity<Void>(headers, HttpStatus.UNPROCESSABLE_ENTITY);
	} 
	 
	  headers.setLocation(builder.path("/transacao/{id}").buildAndExpand(transacao.getId()).toUri());
	  return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
	 }
	 
	 @RequestMapping(value = "/transacao/{transacaoId}", method = RequestMethod.DELETE)
	 public ResponseEntity<Transacao> deleteTransacao(@PathVariable int transacaoId){
	  Transacao t = transacaoService.getTransacaoById(transacaoId);
	  
	  if(t == null) {
	   return new ResponseEntity<Transacao>(HttpStatus.NOT_FOUND);
	  }
	  
	  transacaoService.deleteTransacao(transacaoId);
	  return new ResponseEntity<Transacao>(HttpStatus.OK);
	 }

	 @RequestMapping(value = "/estatistica", method = RequestMethod.GET)
	 
	 public List<Transacao> ReturnEstatistica (){
		return (List<Transacao>) transacaoService.getEstatistica();
 }

}
