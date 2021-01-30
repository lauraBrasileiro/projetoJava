package com.caseItauUnibanco.restJava.service;
import java.util.List;

import com.caseItauUnibanco.restJava.model.Transacao;



public interface TransacaoService {

 public List<Transacao> getAllTransacoes();
 
 public Transacao getTransacaoById(int id);
 
 public Transacao addTransacao(Transacao transacao);
  
 public void deleteTransacao(int id);
 
}