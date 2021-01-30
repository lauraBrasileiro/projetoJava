package com.caseItauUnibanco.restJava.serviceImpl;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.stereotype.Component;

import com.caseItauUnibanco.restJava.model.Transacao;
import com.caseItauUnibanco.restJava.service.TransacaoService;

@Component
public class TransacaoServiceImpl implements TransacaoService {
	
	private static List<Transacao> transacoes = new ArrayList<>();
	
	static {
		
		Transacao t01 = new Transacao(1, OffsetDateTime.now(), 150.00);
		Transacao t02 = new Transacao(1, OffsetDateTime.now(), 170.00);
		Transacao t03 = new Transacao(1, OffsetDateTime.now(), 3150.00);
		  
		transacoes.add(t01);
		transacoes.add(t02);
		transacoes.add(t03);
     }
	
	@Override
	 public List<Transacao> getAllTransacoes() {
	  return transacoes;
	 }

	 @Override
	 public Transacao getTransacaoById(int id) {
	  for(Transacao transacao : transacoes) {
	   if(transacao.getId() == id) {
	    return transacao;
	   }
	  }
	  return null;
	 }

	 @Override
	 public Transacao addTransacao(Transacao transacao) {
	  Random random = new Random();
	  int nextId = random.nextInt(1000) + 10;
	  
	  transacao.setId(nextId);
	  transacoes.add(transacao);
	  
	  return transacao;
	 }

	 @Override
	 public void deleteTransacao(int id) {
	  for(Transacao t : transacoes) {
	   if(t.getId() == id) {
	    transacoes.remove(t);
	    break;
	   }
	  }
	 }

}
	
