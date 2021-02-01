package com.caseItauUnibanco.restJava.service;
import java.util.List;

import com.caseItauUnibanco.restJava.model.Transacao;
import java.util.DoubleSummaryStatistics;


public interface TransacaoService {

 public List<Transacao> getAllTransacoes();
 
 public Transacao getTransacaoById(int id);
 
 public Transacao addTransacao(Transacao transacao);
  
 public void deleteTransacao(int id);
 
 public void getEstatistica();

 
 

}