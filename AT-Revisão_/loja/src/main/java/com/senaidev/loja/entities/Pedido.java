package com.senaidev.loja.entities;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_pedido")
public class Pedido {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(name = "id_pedido")
	private Long id_pedido;
	
	@Column(name = "nome")
	private String nome;
	
	@Column(name = "preço")
	private double preco;
	
	@Column(name = "data")
	private Date data;

	public Pedido(Long id_pedido, String nome, double preco, Date data) {
		super();
		this.id_pedido = id_pedido;
		this.nome = nome;
		this.preco = preco;
		this.data = data;
	}

	public Long getId_pedido() {
		return id_pedido;
	}

	public void setId_pedido(Long id_pedido) {
		this.id_pedido = id_pedido;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}
	
	
}
