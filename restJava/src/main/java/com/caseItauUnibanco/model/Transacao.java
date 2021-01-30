package com.caseItauUnibanco.model;

import java.time.OffsetDateTime;

public class Transacao {
	
		 private int id;
		 private OffsetDateTime data;
		 private Double valor;
		 
		 public Transacao() {
		  super();
		 }

		 public Transacao (int id, OffsetDateTime data, Double valor) {
		  super();
		  this.id = id;
		  this.data = data;
		  this.valor = valor;
		 }

		 public int getId() {
		  return id;
		 }

		 public void setId(int id) {
		  this.id = id;
		 }

		 public OffsetDateTime getData() {
		  return data;
		 }

		 public void setData (OffsetDateTime data) {
		  this.data = data;
		 }

		 public Double getValor() {
		  return valor;
		 }

		 public void setValor(Double valor) {
		  this.valor = valor;
		 }

}
