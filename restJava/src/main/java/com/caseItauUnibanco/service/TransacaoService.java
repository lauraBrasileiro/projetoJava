package com.caseItauUnibanco.service;
import java.util.List;
import com.caseItauUnibanco.model.Transacao;



public interface TransacaoService {

 public List<Transacao> getAllTransacoes();
 
 public Transacao getTransacaoById(int id);
 
 public Transacao addTransacao(Transacao transacao);
  
 public void deleteTransacao(int id);
 
}