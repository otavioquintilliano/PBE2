package com.senaidev.loja.servicies;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senaidev.loja.controllers.repositories.PedidoRepository;
import com.senaidev.loja.entities.Pedido;

@Service
public class PedidoService {
	
	@Autowired
	private PedidoRepository pedidoRepository;
	
	public List<Pedido> buscarPedidos() {
		return pedidoRepository.findAll();
	}

	public Pedido buscarPedidoPorId(Long id) {
		return pedidoRepository.findById(id).orElse(null);
	}
	
	public Pedido criarPedido(Pedido pedido) {
		return pedidoRepository.save(pedido);
	}

	public void excluirPedido(Long id) {
		pedidoRepository.deleteById(id);
	}
	}

