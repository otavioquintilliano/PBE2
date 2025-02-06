package com.senaidev.loja.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.senaidev.loja.entities.Pedido;
import com.senaidev.loja.servicies.PedidoService;

@RequestMapping("/pedidos")
public class PedidoController {

	
	@Autowired
	private PedidoService pedidoService;
	
	@GetMapping
	public List<Pedido> buscarPedido(){
		return pedidoService.buscarPedidos();
	}
	
	@GetMapping("{id}")
	public ResponseEntity<Pedido> buscarPorId(@PathVariable Long id){
		Pedido pedido = pedidoService.buscarPedidoPorId(id);
		
		if(pedido != null) {
			return ResponseEntity.ok(pedido);
		} else {
			return ResponseEntity.notFound().build();
		}
	}
	@PostMapping 
	public Pedido criarPedido(@RequestBody Pedido pedido) {
		return pedidoService.criarPedido(pedido);
	}
	
	@DeleteMapping
	public void excluirPedido(@PathVariable Long id) {
		pedidoService.excluirPedido(id);
		
	}
}
